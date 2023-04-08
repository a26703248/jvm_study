//import sun.misc.Launcher;

import sun.misc.Launcher;
import sun.security.ec.SunEC;

import java.net.URL;
import java.security.Provider;
import java.util.Arrays;

/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 06:58
 * @since JDK 1.8
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        System.out.println("========= Boot =========");
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        Arrays.stream(urls).forEach(System.out::println);
        ClassLoader provider = Provider.class.getClassLoader();
        System.out.println(provider);
        System.out.println("========= Ext =========");
        String extDirs = System.getProperty("java.ext.dirs");
        Arrays.stream(extDirs.split(";")).forEach(System.out::println);
        ClassLoader sunEc = SunEC.class.getClassLoader();
        System.out.println(sunEc);
        System.out.println("========= App =========");
        ClassLoader classLoaderTest2 = ClassLoaderTest2.class.getClassLoader();
        System.out.println(classLoaderTest2);
    }
}
