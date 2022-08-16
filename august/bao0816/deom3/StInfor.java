package august.bao0816.deom3;

import java.util.*;

/**
 * @ClassName StInfor
 * @Description 使用迭代器根据班级获取学生姓名
 * @Author CQ
 * @Date 2022/8/16 8:16
 * @Version 1.0
 */
public class StInfor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList st1 = new ArrayList();
        st1.add("张三丰");
        st1.add("杨过");
        st1.add("郭靖");
        ArrayList st2 = new ArrayList();
        st2.add("王二麻");
        st2.add("杨广");
        st2.add("李自成");
        HashMap<String, ArrayList> stt = new HashMap<String, ArrayList>();
        stt.put("三年级一班",st1);
        stt.put("三年级二班",st2);
        System.out.println("输入年级：");
        String grade=in.next();
        System.out.println(grade+"学生列表：");
        ArrayList st= stt.get(grade);
        Iterator it = st.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
//        for (String key :keys) {
//            ArrayList name = stt.get(key);
//            System.out.println(name);
//        }


    }
}
