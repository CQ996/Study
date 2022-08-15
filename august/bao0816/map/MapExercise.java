package august.bao0816.map;

import java.util.*;

/**
 * @ClassName MapExercise
 * @Description Map练习
 * @Author CQ
 * @Date 2022/8/15 19:20
 * @Version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        //添加对象
        hashMap.put(1, new Emp("jack", 30000, 1));
        hashMap.put(2, new Emp("tom", 21000, 2));
        hashMap.put(3, new Emp("milan", 12000, 3));

        //遍历2种方式
        //1.使用keySet 增强for
        Set keySet = hashMap.keySet();
        System.out.println("====第一组遍历方式");
        for (Object key : keySet) {
            //先获取value
            Object o = hashMap.get(key);
            Emp emp = (Emp) hashMap.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }

        //2.使用Entry Set->迭代器
        System.out.println("====迭代器=====");
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            //System.out.println(entry.getClass());//HashMap$Node
            //通过entry 取得key 和 value
            Emp emp=(Emp)entry.getValue();
            if(emp.getSal()>18000){
                System.out.println(emp);
            }
        }
                
    }
}

class Emp {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private double sal;
    private int id;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public Emp() {
    }
}