package Pra0426;

public class Test3{
    public static void main(String args[]){

        Test3 test =new Test3();
        System.out.println("和是："+test.add(9, 34));
    }
    public int add(int a,int b){
        try {
            return a+b;
        }
        catch (Exception e) {
            System.out.println("catch语句块");
        }
        finally{
            System.out.println("finally语句块");
        }
        return 0;
    }
}