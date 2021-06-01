import java.util.ArrayList;

public class Gamer {
    public String nama = "Vilan";
    public int umur;
    ArrayList<String> jenisGame = new ArrayList<String>();

    public Gamer() {
    }

    public Gamer(String nama, int umur, String jenisGame) {
        this.nama = nama;
        this.umur = umur;
        this.jenisGame.add(jenisGame);
        this.jenisGame.add("minecraft");
        this.jenisGame.add("sonic");
        this.jenisGame.add("mario bross");
    }

    public String getNama() {
        return nama;
    }

    public void ShowGames() {
        System.out.println("Daftar Game :");
        for (int i = 0; i < jenisGame.size(); i++) {
            System.out.println((i+1 + ". ") + jenisGame.get(i));
        }
    }

    public void Play() {
        System.out.println(nama + " is playing");
    }
    
}