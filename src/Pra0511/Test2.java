package Pra0511;
//未完
import java.util.*;

public class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            int nums=sc.nextInt();
            String input=sc.nextLine();
            List<List<Integer>> list=new ArrayList<>();
            for(int i=1;i<=nums;i+=4){
                List<Integer> row=new ArrayList<>();
                row.add(i);
                if(i+1<=nums){
                    row.add(i+1);
                }
                if(i+2<=nums){
                    row.add(i+2);
                }
                if(i+3<=nums){
                    row.add(i+3);
                }
                list.add(row);
            }
            if(nums<=4){
                List<Integer> cur=list.get(0);
                int len=cur.size();
                int cur=0;
                for(int i=0;i<input.length();i++){
                    if(input.charAt(i)=='U'){

                    }
                }
            }else{

            }
        }
    }
}
