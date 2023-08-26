public class StringBuilderTest {

    // 因只有被單執行緒修改所以為線程安全
    private static void methodA() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
    }

    // 因StringBuilder作為外部傳入參數有可能發生線程不安全問題
    private static void methodB(StringBuilder sb) throws InterruptedException {
        sb.append("a");
        sb.append("b");
    }

    //因StringBuilder為方法內建立所以為線程安全
    private static StringBuilder methodC() {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        return sb;
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
