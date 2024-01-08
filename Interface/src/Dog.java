import Interface.Animal;

public class Dog implements Animal {

    public void eat() {
        System.out.println("Dogs chew on bones");
    }

    public void sleep() {
        System.out.println("Dogs like sleeping");
    }

    public void makeSound() {
        System.out.println("Dogs bark");
    }
}
