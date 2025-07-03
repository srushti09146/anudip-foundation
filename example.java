public class example {
    public static void main(String[] args) {
        
    }
}
interface Animal{
    void walk();
    void eat();
    static void sleep() {
        System.out.println("Animal is sleeping");

    }
}
class Dog implements Animal {
    public void walk() {
        System.out.println("Dog is walking");
    }
    
    public void eat() {
        System.out.println("Dog is eating");
    }
}