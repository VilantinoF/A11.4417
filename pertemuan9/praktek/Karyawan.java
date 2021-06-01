import java.util.ArrayList;

public class Karyawan {
    private int noKTP;
    private String nama;
    ArrayList<Mobil> listMbl = new ArrayList<>();


    Karyawan() {

    }

    Karyawan(String noKTP, String nama) {

    }

    public void setNoKTP(int noKTP) {
        this.noKTP = noKTP;
    }

    public int getNoKTP() {
        return noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    void invoice() {

    }

}