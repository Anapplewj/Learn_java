package Pra0119;

import java.util.Arrays;

public class HomeWork {
    //实现方法 split, 能够指定分割符将字符串拆分成字符串数组
    public static void main(String[] args) {
        String str1 = "Hello,java,world";
        String[] str2 = mySplit(str1,',');
        for(String x:str2){
            System.out.println(x);
        }
    }

    //    如果遇到s这个字符串，那么就进行分割
//    分割的时候str1中的s就不要了
//    大概思路为，创建一个字符串数组，用来保存分割后的结果
//    字符串数组的长度假设为字符串的长度
//    但是这个长度怎么确定呢？
//    需要将str1转化为字符数组，如果没有遇到分割符，那么就一直将字符数组中的元素
//    继续拼接到字符串数组的0号元素的后面
//    如果遇到了分割符，那么从分割符之后的下一个元素开始拼接到字符串数组的1号元素
    public static String[] mySplit(String str1, char s) {
        String[] result=new String[str1.length()];
        char[] s1 = str1.toCharArray();
        int j = 0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s){
                if(result[j]!=null) {
                    result[j] += s1[i];
                }else{
                    result[j]=s1[i]+"";
                }
            }else{
                j++;
                continue;
            }
        }
        int num=0;
        for(int i=0;i<result.length;i++){
            if(result[i]==null){
                result[i]="";
                num=i;
                break;
            }
        }
        String[] result2=new String[num+1];
        for(int i=0;i<num+1;i++){
            result2[i]=result[i];
        }
        return result2;
    }
}
//    public static void main(String[] args) {
//        //实现方法 replace, 能够替换字符串中的某个部分
//        String str1="Hello world world";
//        String str2="world";
//        System.out.println(myReplace(str1,str2,"apple"));
//    }
////    将str1中存在str2的部分换成str3
////    和刚刚的代码类似，先找到str2在str1中存在的位置
////    如果不是-1那么就执行替换操作
////    如果str2的长度大于str3的长度，那么剩余的部分被转化为""
////    如果是-1，就return结果
//    public static String myReplace(String str1, String str2,String str3) {
//            char[] s1=str1.toCharArray();
//            char[] s3=str3.toCharArray();
//            while (myContains(str1,str2)!= -1) {
//                int num=myContains(str1,str2);
//                for(int i=0;i<str3.length();i++){
//                    s1[num+i]=s3[i];
//                }
////                if(str2.length()>str3.length()){
////                    for(int i=num+str2.length()-1;i<num+str3.length()-1;i++){
////                        s1[i]='0';
////                    }
////                }
//                str1=new String(s1);
//            }
//            return str1;
//    }
//    //找到str2在str1中的起始位置
//    public static int myContains(String str1, String str2) {
//        char[] s1 = str1.toCharArray();
//        int i = 0;
//        while (i < str1.length()) {
//            char[] s2 = new char[str2.length()];
//            String s22="";
//            for (int j = 0; j < str2.length(); j++) {
//                if((i+j)<str1.length()) {
//                    s22 += s1[i + j];
//                }
//            }
//            if(str2.equals(s22)){
//                return i;
//            }
//            i++;
//        }
//        return -1;
//    }
//}

//    public static void main(String[] args) {
//        //实现方法 contains, 能够判定字符串中是否包含子串
//        String str1="Hello java";
//        String str2="java";
//        System.out.println(myContains(str1,str2));
//    }
////    判断str1中是否包含str2,如果包含返回true,不包含返回false
////    将str1转化成为字符数组
////    从i开始，转化str2长度个字符存放到字符数组中
////    将这个字符数组转化为字符串，和str1比较
////    如果相等，返回true；
////    如果遍历完了，还没有找到一个相等的，那就返回false
//
//    public static int myContains(String str1, String str2) {
//        char[] s1 = str1.toCharArray();
//        int i = 0;
//        while (i < str1.length()) {
//            char[] s2 = new char[str2.length()];
//            String s22="";
//            for (int j = 0; j < str2.length(); j++) {
////                s2[j] = s1[i + j];
//                if((i+j)<str1.length()) {
//                    s22 += s1[i + j];
//                }
//            }
//            if(str2.equals(s22)){
//                return i;
//            }
//            i++;
//        }
//        return -1;
//    }
//}

//    public static void main(String[] args) {
//        //实现方法 compareTo, 能够实现按照字典序比较字符串大小
//        String str1="helloa";
//        String str2="hello";
//        System.out.println(myCompareTo(str1,str2));
//    }
//
//    //确定长度是较小的字符串的长度
//    //进行比较，如果第一个小于第二个，那么返回-1
//    //如果第一个大于第二个，那么返回1
//    //如果第一个等于第二个
//    //如果所确定的长度遍历完了都相等的话，那么看两个长度是否相等，相等，就返回0
//    //前一个长，那么返回1，后一个长那么返回-1
//    public static int myCompareTo(String str1, String str2) {
//        int num=(Math.min(str1.length(), str2.length()));
//        char[] s1=str1.toCharArray();
//        char[] s2=str2.toCharArray();
//        for(int i=0;i<num;i++){
//            if(s1[i]>s2[i]){
//                return 1;
//            }else if(s1[i]<s2[i]){
//                return -1;
//            }
//        }
//        if(s1[num-1]==s2[num-1]){
//            return str1.length()-str2.length();
//        }
//        return -2;//异常情况返回-2
//    }
//}

//    public static boolean isAdmin(String userId){
//        return userId.toLowerCase()=="admin";
//    }
//    public static void main(String[] args){
//        System.out.println(isAdmin("Admin"));//输出结果为false,因为比较的是地址
//    }
//}