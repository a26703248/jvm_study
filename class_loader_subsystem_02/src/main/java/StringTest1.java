/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 07:43
 * @since JDK 1.8
 */
public class StringTest1 {

    public static void main(String[] args) {

        // 因為 Classloader 雙親委託模型所以會先委託給上層加載器
        // 所以會先使用 BootstrapClassLoader 原生 String 不會是自訂 String
        String str = new String();
        System.out.println(str);
    }
}
