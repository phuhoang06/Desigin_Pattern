package factoryMethod.factory;

import factoryMethod.model.Animal;
import factoryMethod.model.Cat;
import factoryMethod.model.Dog;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if("canine".equals(type)) {
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
