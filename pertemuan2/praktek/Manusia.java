public class Manusia {
    String nama = "noname";
    boolean punyaTV = false;

    public Manusia(){
    }

    public Manusia(String newnama) {
        nama = newnama;
    }

    public void namaSaya() {
        System.out.println(nama);
    }

    void beliTV() {
        punyaTV = true;
    }

    void jualSemuaTV() {
        punyaTV = false;
    }

    public void cekTV() {
        System.out.println(punyaTV);
    }

    public static void main(String[] args) {
        Manusia man1 = new Manusia("Erik");
        man1.namaSaya();
        TestTV tvku = new TestTV();
        man1.beliTV();
        man1.cekTV();
        man1.jualSemuaTV();
        man1.cekTV();
    }
}
