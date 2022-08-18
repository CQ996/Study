package august.bao0818.domeyl;

import java.util.ArrayList;

public class Class {
    //班级名称
    String cName;
    //每个班级内的同学
    ArrayList<Student> students = new ArrayList<>();

    @Override
    public String toString() {
        return "Class{" +
                "cName='" + cName + '\'' +
                ", students=" + students +
                '}';
    }

    public Class(String cName) {
        this.cName = cName;
    }
}
