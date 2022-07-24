package bao0722;

/**
 * @ClassName CellTest
 * @Description 电池类测试
 * @Author CQ
 * @Date 2022/7/22 14:50
 * @Version 1.0
 */
public class CellTest {
    public static void main(String[] args) {
        Cell cell=new Cell();
        cell.brand="公牛牌";
        System.out.println(cell.charge());
    }
}
