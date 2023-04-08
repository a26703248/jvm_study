/**
 * ProjectName: jvm_study
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author a0909
 * @version v1.0
 * @create 2023/4/8 - 下午 03:08
 * @since JDK 1.8
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + " 開始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName() + " 結束");
        };
        // 若再多執行緒情況下，類別被加載時類別建構子只能會一個加載器作加載
        Thread t1 = new Thread(r  , "thread 1");
        Thread t2 = new Thread(r, "thread 2");
        t1.start();
        t2.start();
    }
}

class DeadThread {
    static {
        if (true){
            System.out.println(Thread.currentThread().getName() + " 初始化當前物件");
            while (true);
        }
    }
}