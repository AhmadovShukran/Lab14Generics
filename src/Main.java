// Main.java
public class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> homeDog = new HomeAnimal<>(new Dog());
        HomeAnimal<Cat> homeCat = new HomeAnimal<>(new Cat());

        homeDog.showType();
        homeDog.sleepOnTheCouch();
        Dog dog = homeDog.getAnimal();
        dog.run();
        dog.speak();

        homeCat.showType();
        homeCat.sleepOnTheCouch();
        Cat cat = homeCat.getAnimal();
        cat.run();
        cat.speak();
    }
}
