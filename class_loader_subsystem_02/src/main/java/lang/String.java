package lang;

/**
 * ProjectName: jvm_study
 * Package: java.lang
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 07:47
 * @since JDK 1.8
 */
public class String {

    static {
        System.out.println("customer");
    }

    public static void main(String[] args) {
        // 在類別 java.lang.String 中找不到主要方法，請定義主要方法為:
//        因為雙親委託模型中會先為派上層而核心函式庫String 沒有 main 方法
        System.out.println("hello String");
    }

}
