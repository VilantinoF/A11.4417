public class TestGame {
    public static void main (String[] args) {
        GamePlayer player1 = new GamePlayer();
        GameEnemy enemy1 = new GameEnemy();

        
        player1.Run();
        player1.Run(30);
    }
}
