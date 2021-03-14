public class Mobil2 {
    String warna;
    int tahunProduksi;
    int speed = 0;
    int gear = 0;
    boolean a;

    // metho
    void cekMesin(boolean on) {
        if (a = on) {
            System.out.println("Mesin Dinyalakan");
        } else {
            System.out.println("MesinMati");
        }
    }

    void gearShift(int newValue) {
        gear = gear + newValue;
        System.out.printf(" \n Gigi:", gear);
    }

    void cekSpeed(int increment) {
        speed = speed + increment;
        System.out.printf(" \n Kecepatan:", speed);
    }
}

 

         
             
            

        
            
            

        
            
            