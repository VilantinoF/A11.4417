public class Mobil2 {
    String warna;
    int tahunProduksi;
    int gear = 0;
    boolean a = true;

    // method
    void cekMesin(boolean on) {
        if (a = on) {
            System.out.println("Mesin Dinyalakan");
        } else {
            System.out.println("\nMesin Mati");
        }
    }

    void gantiGigiUp() {
        ++gear;
        System.out.println("\nGigi: " + gear);
    }

    void gantiGigiDown() {
        if (gear == 0) {
            System.out.println("Sudah netral");
        } else {
            --gear;
            System.out.println("\nGigi: " + gear);
        }
    }

}

 

         
             
            

        
            
            

        
            
            