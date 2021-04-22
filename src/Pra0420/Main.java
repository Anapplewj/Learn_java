package Pra0420;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNextLine()){
            list.add(sc.nextInt());
        }
        int k=list.get(list.size()-1);
        list.remove(list.size()-1);
        Collections.sort(list);
        for(int i=0;i<k;i++){
            if(i==k-1){
                System.out.println(list.get(i));
            }else{
                System.out.print(list.get(i)+" ");
            }
        }
    }
}