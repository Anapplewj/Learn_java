package Pra0119;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
//    String str1="hello";
//    String str2=new String("hello");
//    char[] arr={'h','e','l','l','o'};
//    String str3=new String(arr);
    public static void main(String[] args) {
//        String str1="hello";
//        String str2="hello";
//        System.out.println(str1==str2);
//        String str1=new String("hello");
//        String str2=new String("hello");
//        System.out.println(str1.equals(str2));//也可写成str2.equals(str1)
//        System.out.println(str1==str2);
////        字符数组/字节数组—>字符串
//        char[] arr1={'a','b','c'};
//        String str1=new String(arr1);
////        字符串—>字符数组
//        String str2="hello";
//        char[] arr2=str2.toCharArray();
////        字符串—>字节数组
//        String str3="hello";
//        byte[] arr3=str3.getBytes();
        String str1=new String("hello");
        System.out.println("hello"==str1);
        String str2=new String("hello").intern();
        System.out.println("hello"==str2);

    }

}
