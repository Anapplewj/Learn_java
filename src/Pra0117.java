import java.util.Arrays;

//寒假作业部分
public class Pra0117 {
    public static void main(String[] args) {
        //给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
        //也就是旋转字符串
        //例如：1，2，3，4，5，6  k=2  5,6,1,2,3,4
        int[] arr={1,2,3,4};
        rotate(arr,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k){
        int[] arr=new int[nums.length*2];
        for(int i=0;i<arr.length;i++){
            if(i<nums.length) {
                arr[i] = nums[i];
            }else{
                arr[i]=nums[i-nums.length];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i+(nums.length-k)];
        }
    }
}
//    public static void main(String[] args) {
//        String str1="HELLOapple0117";
//        System.out.println(toLower(str1));
//    }
//
//    public static String toLower(String str) {
//        //将字符串中的字符取出来
//        //判断如果是大写字母，就将其转化为小写字母
//        String result="";
//        for(int i=0;i<str.length();i++){
//            char pos=str.charAt(i);
//            if('A'<=pos&&(pos<='Z')) {
//                result += (char) (pos+ ('a' - 'A'));
//            }else{
//                result+=pos;
//            }
//        }
//        return result;
//    }
//
//}
//    public static void main(String[] args) { 
//        //输出结果为25255
//        int x=20;
//        int y=5;
//        System.out.println(x+y+""+(x+y)+y);
//    }
//}
