public class MotorCycle extends MotorVehicle {
    int numGear = 0;

    MotorCycle() {
        
    }

    void goStraight() {
        System.out.println("Motor Maju...");
    }

    public void setGearFoot(int numGear) {
        this.numGear = numGear;
        
    }

    public int getGearFoot() {
        return numGear;
    }
    
}
