/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 03:03
 * @since JDK 1.8
 */
public class ClientTest2 {
    static class Father{
        public static int a = 1;
        static {
            a = 2;
        }
    }

    static class Son extends Father{
        public static int b = a;
    }

    public static void main(String[] args) {
        // 先加載 Father 物件，在加載 Son 物件
        System.out.println(Son.b);
    }

}
