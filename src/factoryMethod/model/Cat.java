package factoryMethod.model;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}
