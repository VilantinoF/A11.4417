package Transportasi;

public class Vehicle {
    double speed = 0;
    String color = "orange";

    Vehicle() {

    }

    public void goStraight() {
        System.out.println("Maju...");
    }

    public void turnLeft() {
        System.out.println("Belok Kiri...");

    }

    public void turnRight() {
        System.out.println("Belok Kanan...");

    }

}
