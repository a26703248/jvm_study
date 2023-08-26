public class MethodCallTest {

    public static void main(String[] args) {

    }

    public void showAnimal(Animal animal){
        animal.eat(); // 晚期綁定(invokevisual)
    }

    public void showHunt(Huntable huntable){
        huntable.hunt(); // 晚期綁定(invokevisual)
    }

}
class Animal{
    public void eat(){
        System.out.println("eat... ");
    }
}
interface Huntable{
    void hunt();
}

class Dog extends Animal implements Huntable{

    @Override
    public void eat(){
        System.out.println("dog eat... ");
    }
    @Override
    public void hunt() {
        System.out.println("dog hunt... ");
    }
}

class Cat extends Animal implements Huntable{

    public Cat() {
        super();// 早期綁定(invokespecial)
    }

    public Cat(String name){
        this(); // 早期綁定(invokespecial)
    }

    @Override
    public void eat(){
        super.eat(); // 早期綁定(invokespecial)
        System.out.println("cat eat... ");
    }

    @Override
    public void hunt() {
        System.out.println("cat hunt... ");
    }
}