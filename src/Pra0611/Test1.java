package Pra0611;

import java.util.*;
//题目要求: 将所有的文件名记录下来,然后如果对应的行号也相同,那么只记录其中的一个,并且错误的个数+1
//如果文件名相同,但是错误的行号不同,那么不会记录一个,而是记录多个.
public class Test1{
    public static Map<String,Integer> map; //存储最终结果的HashMap记录错误的名称和出现错误的次数
    public static ArrayList<String> list1; //错误名称
    public static int count=8;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()&&count<=0){
            count=8;
            map=new HashMap<>();
            list1=new ArrayList<>();
            String str1=sc.next();
            String[] arr=str1.split("\\\\");
            String res=arr[arr.length-1];
            int n=sc.nextInt();
            String key=res+" "+String.valueOf(n);
            list1.add(res);
            int value=map.getOrDefault(key,0);
            if(value==0){
                map.put(key,value);
            }else{
                map.put(key,value+1);
            }
            count--;
        }
        for(int i=0;i<list1.size();i++){
            String str=list1.get(i);
            String[] arr=str.split(" ");
            String res=arr[0];
            int len=arr[0].length();
            if(len>16){
                arr[0]=arr[0].substring(len-16,len);
            }
            System.out.println(res+" "+arr[1]+map.get(res));
        }
    }
}
//主要问题是,假如两个文件名都超过了16位,前面被裁剪掉的部分不相同,但是后面的十六位相同,那肯定不算是一个文件呀
//我想到了一个办法,既然如此,那我可以将行号和文件名拼接在一起,当做HashMap的key,然后value记录次数