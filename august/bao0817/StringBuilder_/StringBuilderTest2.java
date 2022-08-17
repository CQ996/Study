package august.bao0817.StringBuilder_;

/**
 * @ClassName StringBuilderTest2
 * @Description 用StringBuilder打印整型数组内容
 * @Author CQ
 * @Date 2022/8/16 23:27
 * @Version 1.0
 */
public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr1=null;
        System.out.println(toString(arr1));

        int[]arr2={10,28,99};
        System.out.println(toString(arr2));
    }
    //1.定义方法接收任意整形数组，返回数组内容格式
    public static String toString(int[] arr){
        //2.拼接内容
        if(arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i==arr.length-1?"":",");
            }
            sb.append("]");
            return sb.toString();
        }else {return null;}
    }
}
