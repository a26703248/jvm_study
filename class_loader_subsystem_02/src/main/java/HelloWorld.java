/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 02:23
 * @since JDK 1.8
 */
public class HelloWorld {

    private static int num = 1;

    static {
        num = 2;
        number = 20;
        System.out.println(num);
//        System.out.println(number); // 非法引用，若是宣告在靜態區塊之後的靜態變數只能賦值不可呼叫使用
    }

    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println("Hello World!");
    }
}
