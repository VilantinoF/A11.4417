public class Buku {
    String penerbit, judul, pengarang;
    int tahun;

    public Buku(String newpenerbit, String newjudul, String newpengarang, int newtahun) {
        penerbit = newpenerbit;
        judul = newjudul;
        pengarang = newpengarang;
        tahun = newtahun;
    }

    public void cetakBuku() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Penerbit : " + penerbit);
        System.out.println("Tahun : " + tahun);
    }
    
}
