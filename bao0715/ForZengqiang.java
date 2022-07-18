package bao0715;

/**
 * @ClassName ForZengqiang
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/17 11:10
 * @Version 1.0
 */
public class ForZengqiang {

        public static void main(String[] args){
            int [] numbers = {10, 20, 30, 40, 50};

            for(int x : numbers ){
                System.out.print( x );
                System.out.print(",");
            }
            System.out.print("\n");
            String [] names ={"James", "Larry", "Tom", "Lacy"};
            for( String name : names ) {
                System.out.print( name );
                System.out.print(",");
            }
        }

}
