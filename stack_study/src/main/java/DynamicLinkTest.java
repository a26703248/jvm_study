public class DynamicLinkTest {

    float num = 10;

    public static void main(String[] args) {

    }

    public void methodA(){
        System.out.println("methodA");
    }

    public void methodB(){
        System.out.println("methodB");
        methodA();
        num++;
    }

}
