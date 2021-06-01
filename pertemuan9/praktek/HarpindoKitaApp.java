import java.util.Scanner;

public class HarpindoKitaApp {
    public static void main(String[] args) {
        char i = 'w';
        
        while(i != 'q') {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Welcome to Harpindo Kita");
            System.out.println("Sign Up");
            System.out.println("1. Karyawan");
            System.out.println("2. Pembeli");
            System.out.println("PRESS '0' TO QUIT");
            System.out.println("====================");
            
            int choice = myObj.nextInt();
            if (choice == 1) {
                Karyawan officer = new Karyawan();
                Mobil mbl1 = new MobilSedan("sedan", 2000000, 4);
                officer.setNoKTP(100050215);
                officer.setNama("Vilantino");
                System.out.println("No KTP : " + officer.getNoKTP());
                System.out.println("Nama : " + officer.getNama());
                
                
            } else if (choice == 2) {
                System.out.println("Tipe Pembeli : ");
                System.out.println("1. Individu");
                System.out.println("2. Borongan");
                int tCustomer = myObj.nextInt();
                if (tCustomer == 1) {
                    Pembeli customer = new PembeliIndividu("12091201", "tino");
                    System.out.println("No KTP : " + customer.getNoKTP());
                    System.out.println("Nama : " + customer.getNama());


                } else {
                    Pembeli customer2 = new PembeliBorongan("90101982", "Fernan");
                    System.out.println("No KTP : " + customer2.getNoKTP());
                    System.out.println("Nama : " + customer2.getNama());
                }
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Please Input Only Displayed in Menu");
                continue;
            }
        }
        
    }
}
