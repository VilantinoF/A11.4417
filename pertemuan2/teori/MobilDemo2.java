public class MobilDemo2 {
    public static void main(String[] args) {
        // Membuat object
        Mobil2 bike = new Mobil2();

        // memanggil atribut dan memberi nilai
        bike.cekMesin(true);
        bike.gantiGigiUp();
        bike.gantiGigiUp();
        bike.gantiGigiDown();
        bike.cekMesin(false);
    }
}