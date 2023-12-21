// HomeAnimal.java
public class HomeAnimal<T extends Animal & Run & Speak> {
    private T animal;

    public HomeAnimal(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void showType() {
        System.out.println("Type of animal: " + animal.getClass().getSimpleName());
    }

    public void sleepOnTheCouch() {
        System.out.println("The " + animal.getClass().getSimpleName() + " is sleeping on the couch.");
    }

    public void interact() {
        if (animal instanceof Dog) {
            System.out.println("Playing fetch with the dog.");
        } else if (animal instanceof Cat) {
            System.out.println("Petting the cat.");
        } else {
            System.out.println("This animal doesn't know how to play.");
        }
    }
}
