public class MobilDemo2 {
    public static void main(String[] args) {
        // Membuat object
        Mobil2 bike = new Mobil2();

        // memanggil atribut dan memberi nilai
        bike.cekMesin(true);
        bike.gantiGigi(1);
        // Memanggil method dan menunjuk nilai parameter
        bike.gantiGigi(2);

        bike.cekMesin(false);
    }
}