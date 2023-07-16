import java.util.Date;

/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/7/14 - 下午 08:14
 * @since JDK 1.8
 */
public class LocalVariableTest {

    private int count = 0;

    public static void main(String[] args) {
        LocalVariableTest test = new LocalVariableTest();
        int num = 10;
        test.test1();
    }

    public static void testStatic(){
        LocalVariableTest test = new LocalVariableTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
    }

    public void test1(){
        Date date = new Date();
        String name1 = "test";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP, String name2){
        dateP = null;
        name2 = "test2";
        double weight = 130.5;
        char gender = '男';
        return dateP + name2;
    }

    public void test3(){
        count++;
    }

    public void test4(){
        int a = 0;
        {
            int b = 0;
            b = a+1;
        }
        // 變數c的slot是使用變數b的slot空間,因變數b的作用範圍消失,是可重複將以取得變數b的slot空間作使用
        int c = a + 1;
    }
}
