package Pra0129;

public class Test {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));

    }
    //判断一个数是否为回文数
    public static boolean isPalindrome(int x) {
        int num=x;
        if(num<0){
            return false;
        }
        int result=0;
        while(num!=0){
            result=result*10+num%10;
            num=num/10;
        }
        return result==x;
    }
    //赎金信
    //判断magazine中的字符是否能组成ransomNote，并且不能重复
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        char[] arr2=ransomNote.toCharArray();
        int count=0;
        for(int i=0;i<arr2.length;i++){
            int num=magazine.indexOf(arr2[i]);
            if(num>=0){
                if(i==magazine.length()-1){
                    magazine=magazine.substring(0,magazine.length()-1);
                    count++;
                }else{
                    magazine=magazine.substring(0,num)+magazine.substring(num+1,magazine.length());
                    count++;
                }
            }else{
                return false;
            }
        }
        if(count==arr2.length){
            return true;
        }
        return false;
    }
}
