package Pra0602;

import java.util.*;

public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            String[] line1=line.split(" ");
            String[][] input=new String[Integer.parseInt(line1[0])][Integer.parseInt(line1[1])];
            int row=0;
            int col=0;
            for(int i=0;i<input.length;i++){
                String str=sc.nextLine();
                if(str.contains("@")){
                    row=i;
                    col=str.indexOf("@");
                }
                input[i]=str.split(" ");
            }
            System.out.println(row+" "+col);
            arr=new int[input.length][input[0].length];
            System.out.println(steps(input,row,col));
        }
    }

    private static int[][] arr;
    private static int steps(String[][] input,int row,int col){
        if(row<0||row>=input.length||col<0||col>=input[0].length||input[row][col].equals("#")||arr[row][col]==1){
            return 0;
        }
        arr[row][col]=1;
        int a=Math.max(steps(input,row-1,col),steps(input,row+1,col));
        int b=Math.max(steps(input,row,col-1),steps(input,row,col+1));
        return 1+a>b?a:b;
    }
}
