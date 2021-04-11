package Transportasi;

public class Car extends MotorVehicle {
    boolean seatbelt = false;

    public Car() {

    }

    public void goStraight() {
        System.out.println("Mobil Maju...");
    }

    public void setSeatBelt(int seatbelt) {
        if (seatbelt == 1) {
            this.seatbelt = true;
        } else {
            this.seatbelt = false;
        }
    }

    public boolean getSeatBelt() {
        return seatbelt;
    }

}
