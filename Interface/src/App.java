public class App {
    public static void main(String[] args) throws Exception {
        Dog charlie = new Dog();
        Cat garfield = new Cat();

        charlie.eat();
        charlie.sleep();
        charlie.makeSound();
        garfield.eat();
        garfield.sleep();
        garfield.makeSound();
    }
}
