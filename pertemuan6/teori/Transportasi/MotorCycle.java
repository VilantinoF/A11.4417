package Transportasi;

public class MotorCycle extends MotorVehicle {
    int numGear = 0;

    public MotorCycle() {
        
    }

    public void goStraight() {
        System.out.println("Motor Maju...");
    }

    public void setGearFoot(int numGear) {
        this.numGear = numGear;
        
    }

    public int getGearFoot() {
        return numGear;
    }
    
}
