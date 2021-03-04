package Pra0303;
//逆波兰表示法
class Solution{
    public static void main(String[] args) {
        String[] tokens={"10","6","9","3","+","-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        //别人的好办法
//        int[] arr=new int[tokens.length/2+1]; //定义一个数组用来存放字符数组内容
//        int i=0;
//        for(String token:tokens){
//            switch (token){
//                case "+":
//                    arr[i-2]+=arr[--i];  //遇到加法运算符就前两个相加
//                    break;
//                case "-":
//                    arr[i-2] -=arr[--i]; //遇到减法运算符就前两个相减
//                    break;
//                case "*":
//                    arr[i-2] *=arr[--i]; //遇到乘法运算符就前两个相乘
//                    break;
//                case "/":
//                    arr[i-2] /=arr[--i]; //遇到除法运算符就前两个相除
//                    break;
//                default:
//                    arr[i++]=Integer.valueOf(token); //若没有遇到运算符就把字符串存放进数组
//                    break;
//            }
//        }
//        return arr[0]; //最后取数组第一个元素的值就是计算后的值
        //我学到的好办法
        //刚开始忘记加break，导致一些错误
        //思路：创建一个数组用来保存数字，当遇到运算符号时，进行计算，并且更新数组
        int[] arr=new int[tokens.length/2+1];
        int i=0;
        for(String token:tokens){
            switch(token){
                case "+":
                    arr[i-2]+=arr[i-1];
                    i--;
                    break;
                case "-":
                    arr[i-2]-=arr[i-1];
                    i--;
                    break;
                case "*":
                    arr[i-2]*=arr[i-1];
                    i--;
                    break;
                case "/":
                    arr[i-2]/=arr[i-1];
                    i--;
                    break;
                default:
                    arr[i++]=Integer.parseInt(token);
                    break;
            }
        }
        return arr[0];
    }

}
//我最开始的笨办法
//思路：遇到运算符计算，将计算结果保存在运算符的一位，然后删除前两位
//class Solution {
//    public static void main(String[] args) {
//        String[] tokens={"10","6","9","3","+","-11", "*", "/", "*", "17", "+", "5", "+"};
//        System.out.println(evalRPN(tokens));
//    }
//    public static int evalRPN(String[] tokens) {
//        for(int i=0;i<tokens.length;i++){
//            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
//                int num1=Integer.parseInt(tokens[i-2]);
//                int num2=Integer.parseInt(tokens[i-1]);
//                if(tokens[i].equals("+")){
//                    tokens[i]=num1+num2+"";
//                    tokens=delete(tokens,i);
//                    i-=2;
//                    continue;
//                }else if(tokens[i].equals("-")){
//                    tokens[i]=num1-num2+"";
//                    tokens=delete(tokens,i);
//                    i-=2;
//                    continue;
//                }else if(tokens[i].equals("*")){
//                    tokens[i]=num1*num2+"";
//                    tokens=delete(tokens,i);
//                    i-=2;
//                    continue;
//                }else if(tokens[i].equals("/")){
//                    tokens[i]=num1/num2+"";
//                    tokens=delete(tokens,i);
//                    i-=2;
//                }
//            }
//        }
//        return Integer.parseInt(tokens[0]);
//    }
//    public static String[] delete(String[] tokens,int cur){
//        String[] newTokens=new String[tokens.length-2];
//        int j=0;
//        for(int i=0;i<tokens.length;i++){
//            if(i==cur-1||i==cur-2){
//                continue;
//            }
//            newTokens[j]=tokens[i];
//            j++;
//        }
//        return newTokens;
//    }
//}
