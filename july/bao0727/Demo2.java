package july.bao0727;

/**
 * @ClassName Demo2
 * @Description split 分隔字符串
 * @Author CQ
 * @Date 2022/7/27 15:50
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        String trip="Day1:抵达青岛;Day2:栈桥——五四广场;Day3:海底世界——小麦岛;" +
                "Day4:跨海大桥——天主教堂;Day5:电影博物馆——海底隧道，返程；";
        String[] result=trip.split(";");//以";"分隔字符串
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
