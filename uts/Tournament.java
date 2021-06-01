public class Tournament {
    public static void main(String[] args) {
        Gamer player1 = new Gamer("Vilan", 20, "pacman");
        Programmer person = new Programmer();
        Youtuber vila = new Youtuber();
        vila.viewer = 200;
        vila.subscriber = 1000;
    
        player1.ShowGames();
        player1.Play();
        vila.ShowSubAndView();
        person.Play();
        
    }

}
