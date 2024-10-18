abstract class Vehicle {
    abstract void speed();
}

class Bike extends Vehicle {
    void speed() {
        System.out.println("100 km/h");
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("250 km/h");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.speed(); 
        car.speed(); 
    }
}
