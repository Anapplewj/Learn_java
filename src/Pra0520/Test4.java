package Pra0520;

import java.util.*;

public class Test4 {
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public static void oddInOddEvenInEven2(int[] arr) {
        List<Integer> oddList=new ArrayList<>();
        List<Integer> evenList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                oddList.add(arr[i]);
            }else{
                evenList.add(arr[i]);
            }
        }
        int o=0;
        int e=0;
        int i=0;
        while(o<oddList.size()&&e<evenList.size()){
            if(i%2==0){
                arr[i]=oddList.get(o);
                o++;
            }else{
                arr[i]=evenList.get(e);
                e++;
            }
            i++;
        }
        if(o>=oddList.size()){
            for(;i<arr.length&&e<evenList.size();i++){
                arr[i]=evenList.get(e);
                e++;
            }
        }else{
            for(;i<arr.length&&o<oddList.size();i++){
                arr[i]=oddList.get(o);
                o++;
            }
        }
    }
    public static void oddInOddEvenInEven(int[] arr) {
        for(int i=0;i<arr.length;i++){
            //当前是偶数位,但是数字却不是偶数
            //从后往前找到一个偶数,交换
            if(i%2==0&&arr[i]%2!=0){
                boolean flag=false;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]%2==0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
                if (!flag){
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        oddInOddEvenInEven2(arr);
        System.out.println(Arrays.toString(arr));
    }
}