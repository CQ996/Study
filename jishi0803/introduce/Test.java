package jishi0803.introduce;

/**
 * @ClassName Test
 * @Description 继承类——计算部门人员销售奖金
 * @Author CQ
 * @Date 2022/8/3 15:42
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Department department=new Department("0001","销售部");
        Employee employee=new Employee("0033","郭德纲",2000,"销售部","0001","销售部");
        employee.print();
    }
}
