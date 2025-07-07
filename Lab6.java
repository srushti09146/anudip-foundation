class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}

class Garage {
    void serviceVehicle(Vehicle vehicle) {
        vehicle.start();
        System.out.println("Vehicle serviced.");
    }
}

class Student {
    String name;
    int age;
    String department;

    Student() {
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unassigned";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "IT";
    }

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class Lab6 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();
        Garage garage = new Garage();

        System.out.println("--- Vehicle Service ---");
        garage.serviceVehicle(car);
        garage.serviceVehicle(bike);

        System.out.println("\n--- Student Records ---");
        Student s1 = new Student();
        Student s2 = new Student("srushti", 21);
        Student s3 = new Student("tanvi", 22, "Computer Science");

        s1.display();
        s2.display();
        s3.display();
    }
}
