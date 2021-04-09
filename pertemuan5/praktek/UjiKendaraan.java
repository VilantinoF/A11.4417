public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(3, "H 171 NO");
    

        sepeda.goStraight();
        sepeda.ringBell();
        kendaraan.turnRight();
        System.out.println(motor.getSizeofEngine());
        System.out.println(motor.getLicencePlate());
    }
}
