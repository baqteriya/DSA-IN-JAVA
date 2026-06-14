public class Vehicle {
    String color;
    String model;
    int speed;

    public Vehicle(String color, String model, int speed) {
        this.color = color;
        this.model = model;
        this.speed = speed;
    }

    public static void main(String[] args) {
        Car car = new Car("Red", "Honda", 100);
        car.printDisplay();
    }
}

class Bike extends Vehicle {
    Bike(String color, String model, int speed) {
        super(color, model, speed);
    }
}

class Car extends Bike {
    Car(String color, String model, int speed) {
        super(color, model, speed);
    }

    public void printDisplay() {
        System.out.println("******");
        System.out.println("------");
        System.out.println("Color of vehicle: " + color);
        System.out.println("Model of vehicle: " + model);
        System.out.println("Speed of vehicle: " + speed);
        System.out.println("------");
        System.out.println("******");
    }
}