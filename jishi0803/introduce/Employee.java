package jishi0803.introduce;

import java.util.Scanner;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 15:33
 * @Version 1.0
 */
public class Employee extends Department{
Scanner input=new Scanner(System.in);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    private String id;//员工编号
    private String name;//员工名称
    private double salary;//底薪
    private String department;//所在部门
    private double sales;//本月销售额
    double rate;//提成比例
    double money;//工资


    public Employee(String id,String name,double salary,String department,String id2,String name2){
        super(id2,name2);
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.sales=sales;

    }
    //薪资计算
    public double countSalary(double sales){

        if(sales<10){
            rate=0.1;
        }else if (sales>=10 && sales<20){
            rate=0.2;
        }else if(sales>20){
            rate=0.3;
        }
        this.money=rate*sales+salary;
        return this.money;
    }
    @Override
    public void print() {
        super.print();
        System.out.print("员工信息  ");
        System.out.print("员工编号："+id);
        System.out.print("，姓名："+name);
        System.out.print("，底薪："+salary);
        System.out.println("，所在部门："+department);
        System.out.print("请输入"+this.name+"本月销售额：");
        this.sales=input.nextDouble();
        countSalary(sales);
        System.out.print(name+"本月的工资为"+this.money);
    }
}
