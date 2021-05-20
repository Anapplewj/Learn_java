package Pra0517;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

public class Test3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            String[] arr=input.split(" ");
            Long a=Long.parseLong(arr[0]);
            Long b=Long.parseLong(arr[1]);
            System.out.println(a<=b*6.28);
        }
    }
}