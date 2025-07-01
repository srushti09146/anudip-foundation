
interface Animal {
    void makeSound();   
    void move();        
}


class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    public void move() {
        System.out.println("Dog runs on four legs.");
    }
}


class Bird implements Animal {
    public void makeSound() {
        System.out.println("Bird says: Tweet!");
    }

    public void move() {
        System.out.println("Bird flies in the sky.");
    }
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myBird = new Bird();

        myDog.makeSound();
        myDog.move();

        myBird.makeSound();
        myBird.move();
    }
}