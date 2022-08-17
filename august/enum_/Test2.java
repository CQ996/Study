package august.enum_;

/**
 * @ClassName Test2
 * @Description 枚举的声明定义演示
 * @Author CQ
 * @Date 2022/8/17 14:46
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) {

        // 枚举:   一种特殊的数据类型(内部数据已经被声明为常量格式).

        //例如: 模拟性别变量. 取值应该位于: 男生、女生范围内.
        //不推荐.
        String gender  =  "男生";
        gender  =  "女生";
//             gender  =  "难士  ";

//       推荐: 使用枚举类型声明和表示. 好处: 声明固定的常量取值范围.
//       步骤: 1.定义声明枚举类型( enum 枚举  ).  2.使用枚举类型定义变量.
        Gender gender1 = Gender.女生;

        System.out.println(gender1);

//        使用枚举的构造:

        Result r1 = Result.OK_Result;
        r1 = Result.ERROR_Result;
        r1 = Result.EXCEPTION_Result;

        System.out.println("程序的执行结果为: " + r1.getInfo()+" -- " + r1.getCode());


    }


}

//声明定义枚举类型表示性别:
enum Gender{
    男生,女生
}

//声明定义程序操作结果:
enum Result{

    //枚举常量: 根据构造构建的三个对象数据.
    OK_Result(200 , "hehe"),
    ERROR_Result(250 , "haha"),
    EXCEPTION_Result(300,"xixi");


    //定义声明枚举构造.
    Result(int code , String info){
        this.code = code;
        this.info = info;
    }

    //枚举内部封装属性:
    private int code;

    private String info;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
