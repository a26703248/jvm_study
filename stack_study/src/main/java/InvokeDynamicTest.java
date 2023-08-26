public class InvokeDynamicTest {

    public void lambda(Func func){
        return;
    }

    public static void main(String[] args) {
        InvokeDynamicTest invokeDynamicTest = new InvokeDynamicTest();
        Func func = s -> {
            return true;
        };

        invokeDynamicTest.lambda(func);

        invokeDynamicTest.lambda(s -> {
            return true;
        });

    }
}


@FunctionalInterface
interface Func{
    boolean func(Func func);
}
