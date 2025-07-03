
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal(); 
        Dog dog = new Dog();                 
        Cat cat = new Cat();                 

        
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
