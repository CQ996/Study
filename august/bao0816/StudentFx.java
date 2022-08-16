package august.bao0816;

import java.util.*;

/**
 * @ClassName Fx
 * @Description HashMap的泛型形式：通过姓名取出成绩
 * @Author CQ
 * @Date 2022/8/16 7:37
 * @Version 1.0
 */
public class StudentFx {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        HashMap<String, Integer> st = new HashMap<String, Integer>();
        st.put("方凯",45);
        st.put("胡永见",75);
        st.put("程前",40);
        System.out.println("输入学生的姓名：");
        String name=in.next();
        System.out.println(name+"的成绩是："+st.get(name));
        Set<String> keys = st.keySet();
        for (String key : keys) {
            Integer score = st.get(key);
            System.out.println(key+"的成绩是："+score);
        }
    }
}

