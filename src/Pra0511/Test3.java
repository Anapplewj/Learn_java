package Pra0511;

import java.util.Scanner;

public class Test3 {
    //假设str1的长度短
    private static String subString(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        int len1=arr1.length;
        int len2=arr2.length;
        //最长子串的起始位置
        int start=0;
        //最长子串的长度
        int maxLen=0;
        int[][] maxSubLen=new int[len1+1][len2+1];
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                //如果第i个字符和第j个字符相等的,则进行累加
                if(arr1[i-1]==arr2[j-1]){
                    maxSubLen[i][j]=maxSubLen[i-1][j-1]+1;
                    //更新
                    if(maxLen<maxSubLen[i][j]){
                        maxLen=maxSubLen[i][j];
                        start=i-maxLen;
                    }
                }
            }
        }
        return str1.substring(start,start+maxLen);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            if(str1.length()<=str2.length()){
                System.out.println(subString(str1,str2));
            }else{
                System.out.println(subString(str2,str1));
            }
        }
    }
}
