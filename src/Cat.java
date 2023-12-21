public class Cat extends Animal implements Run, Speak {
    @Override
    public void run() {
        System.out.println("Cat is running.");
    }

    @Override
    public void speak() {
        System.out.println("Cat is meowing.");
    }
}
