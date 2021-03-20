public class GamePlayer {
    double width, height;
    int positionX = 60, positionY;

    GamePlayer() {
    }

    GamePlayer(double width, double height) {

    }

    GamePlayer(double width, double height, int positionX, int positionY) {

    }

    public void setDimension(double width, double height) {

    }

    public void setPosition(int positionX, int positionY) {

    }

    public double getWidth() {
        return 10.0;
    }

    public double getHeight() {
        return 10.0;
    }

    public int getX() {
        return 10;
    }

    public int getY() {
        return 10;
    }

    void Run() {
        System.out.println("Player is running");
    }

    void Run(int incrementX) {
        positionX = positionX + incrementX;
        System.out.println("Player still running...current X position= " + positionX);
    }

}