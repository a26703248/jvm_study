public class StringBuilderTest {

    // 因在內部宣告且在內部銷毀，所以 sb1 的宣告: 線程安全
    private static void methodA() {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("a");
        sb1.append("b");
    }

    // 因 sb2 作為外部傳入參數有可能發生，所以 sb2 的宣告: 線程不安全
    private static void methodB(StringBuilder sb2) throws InterruptedException {
        sb2.append("a");
        sb2.append("b");
    }

    // 因 sb3 為方法有返回出去可能被其他線程爭搶，所以 sb3 的宣告: 線程不安全
    private static StringBuilder methodC() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("a");
        sb3.append("b");
        return sb3;
    }

    // 因 sb4 為中toString()方法為重新建立 String 物件返回，所以 sb4 的宣告: 線程安全
    private static String methodD() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append("a");
        sb4.append("b");
        return sb4.toString();
    }

    public static void main(String[] args) throws InterruptedException {
        // StringBuilder 線程不安全物件
        StringBuilder sb = new StringBuilder();
        new Thread(() -> {
            sb.append("a");
            sb.append("b");
        }).start();

        methodB(sb);
    }

}
