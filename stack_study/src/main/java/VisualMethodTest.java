public class VisualMethodTest {

    public static void main(String[] args) {
        Son so = new Son();
        so.show();

    }

}

class Father{
    public Father() {
        System.out.println("father constructor... ");
    }

    public static void showStatic(String str){
        System.out.println("father " + str);
    }

    public final void showFinal(){
        System.out.println("father final... ");
    }

    public void showCommon(){
        System.out.println("father normal... ");
    }

}

class Son extends Father {
    public Son() {
        super();// 非虛方法(invokespecial)
    }

    public Son(int age){
        this();// 非虛方法(invokespecial)
    }

    // 不是複寫方法因靜態方法不可被複寫
    public static void showStatic(String str){
        System.out.println("son " + str);
    }

    private void showPrivate(String str){
        System.out.println("son private " + str);
    }

    public void show(){

        showStatic("com.howard");// 非虛方法(invokestatic)
        super.showStatic("good!");// 非虛方法(invokestatic)
        showPrivate("hello!");// 非虛方法(invokespecial)
        super.showCommon();// 非虛方法(invokespecial)

        // invokevisual
        showFinal();// 因為此方法為宣告為final方法，不能被覆寫，所以也被定義為非虛方法
        // 以下為虛方法
        showCommon();// invokevisual
        info();// invokevisual

        MethodInterface in = null;
        // invokeinterface
        in.methodA();

    }
    public void info(){

    }
    public void display(Father f){
        f.showCommon();
    }

}

interface MethodInterface{
    void methodA();
}