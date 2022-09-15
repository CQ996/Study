package September.bao0915.test;

import java.sql.*;

/**
 * @ClassName Test2
 * @Description 查询多行数据并解析
 * @Author CQ
 * @Date 2022/9/15 15:26
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //编写jdbc实现姓名中包含:井下的学生, 查询学生信息.
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.建立连接
        String url="jdbc:mysql://localhost:3306/myschool2";
        String username="root";
        String password="111111";
        Connection conn = DriverManager.getConnection(url, username, password);


        //3.编写sql
        String sql = "SELECT * FROM tb_student where stu_name like ?;";

        //4.创建一个预编译执行对象，先绑定参数，再执行sql
        PreparedStatement pstm = conn.prepareStatement(sql);
        String name = "井下";
        pstm.setString(1,"%"+name+"%");
        //set查询结果是一张临时数据表
        ResultSet set = pstm.executeQuery();

        //5.解析返回结果，封装存储到Java对象中

        //循环解析每一行：当所有行解析完毕，返回false循环结束
        while(set.next()){
            //解析一行：id,stu_name,gender
            //long id = set.getLong(1);//根据索引位置解析某个单元格的数据
            long id = set.getLong("id");//根据列名解析某个单元格的数据
            String stu_name = set.getString("stu_name");
            String gender = set.getString("gender");
            System.out.println("解析的学生信息为："+id + stu_name + gender);
        }

        //6.释放资源
        set.close();
        pstm.close();
        conn.close();

    }
}
