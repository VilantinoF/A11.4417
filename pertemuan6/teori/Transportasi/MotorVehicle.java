package Transportasi;

public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";

    public MotorVehicle() {

    }

    public MotorVehicle(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;

    }


    public int getSizeofEngine() {
        return sizeofEngine;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

}
