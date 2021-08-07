package Pra0804;

import java.util.concurrent.Callable;

public class CreateThread {
    public static void main(String[] args) {
//        Thread t=new Thread(){
//            @Override
//            public void run(){
//                while (true){
//
//                }
//            }
//        };
//        t.start();

        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        },"tt");
        t.start();
        while (true){

        }
    }
}
