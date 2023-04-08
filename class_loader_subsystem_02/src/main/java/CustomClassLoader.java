import java.io.FileNotFoundException;

/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 07:20
 * @since JDK 1.8
 */
public class CustomClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFormCustomPath(name);
            if (result == null) {
                throw new FileNotFoundException();
            }else {
                return defineClass(name, result, 0, result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFormCustomPath(String path){
        /*
        從自訂路徑中讀取 .class 檔 ...
        .class 檔有加密則須在此動作下解密
         */
        return null;
    }
}
