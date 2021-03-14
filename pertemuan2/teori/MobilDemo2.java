public class MobilDemo2 {
    public static void main(String[] args) {
        // Membuat object
        Mobil2 bike = new Mobil2();

        // memanggil atribut dan memberi nilai
        bike.cekMesin(true);
        bike.cekSpeed(10);
        bike.gerShift(1);
        // Memanggil method dan menunjuk nilai parameter
        bike.Kecepatan(10);
        bike.gantigigi(2);

        bike.kondiimesin(false);
    }
}