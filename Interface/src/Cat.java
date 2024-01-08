import Interface.Animal;

public class Cat implements Animal {

    public void eat() {
        System.out.println("Cats eat fish");
    }

    public void sleep() {
        System.out.println("Cats are lazy, they like sleeping ");
    }

    public void makeSound() {
        System.out.println("Cats meow");
    }
}
