public class Programmer extends Gamer {
    public void Play() {
        for (int i = 0; i < 1; i++) {
            int rand = (int) (Math.random() * 3) + 1;
            System.out.println(rand);;
            System.out.println(super.getNama() + " is winning on " + super.jenisGame.get(rand));
        }
    }
}