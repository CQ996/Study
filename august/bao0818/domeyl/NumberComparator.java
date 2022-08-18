package august.bao0818.domeyl;

import java.util.Comparator;

public class NumberComparator implements Comparator<Class> {

    //按学生人数排序
    @Override
    public int compare(Class o1, Class o2) {
        return o1.students.size() - o2.students.size();
    }
}
