public class GameEnemy {
    double width, height;
    int positionX, positionY;

    GameEnemy() {
        }

    GameEnemy(double width, double height) {
    
        }

    GameEnemy(double width, double height, int positionX, int positionY) {
    
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
        System.out.println("Enemy is running");
    }

    void Run(int incrementX) {
        positionX = incrementX + 30;
    }

}
