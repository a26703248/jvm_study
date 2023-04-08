/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 03:24
 * @since JDK 1.8
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        // 獲得應用程式類別加載器(系統類別加載器)
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 延伸類別加載器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        // 啟動類別加載器(獲得不到啟動類別加載器)
        ClassLoader boot = extClassLoader.getParent();
        System.out.println(boot);

        // 找尋物件是由哪個類別加載器
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        // String 類別是使用啟動類別加載器加載(java.lang & java.util)
        ClassLoader strClassloader = String.class.getClassLoader();
        System.out.println(strClassloader);

    }

}
