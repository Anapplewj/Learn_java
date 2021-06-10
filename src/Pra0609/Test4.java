package Pra0609;

public class Test4 {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(isUglyNumber(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isUglyNumber(int num){
        if(!(num%2==0&&num%3==0&&num%5==0)){
            return false;
        }
        for(int i=2;i<num;i++){
            if(i==2||i==3||i==5){
                continue;
            }
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
