package jishi0803.introduce;

/**
 * @ClassName Department
 * @Description 部门类
 * @Author CQ
 * @Date 2022/8/2 17:20
 * @Version 1.0
 */
public class Department {
    public Department(){

    }
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

    private String id;//部门编号
    private String name;//部门名称
    public Department(String id,String name){
        this.id=id;
        this.name=name;
    }

    //部门信息
    public void print(){
        System.out.print("部门信息  ");
        System.out.print("部门编号："+id);
        System.out.print("，部门名称："+name);
    }
}
