public class Tiger extends Animal implements Walk{

    private int numberOfStripes;
    private int speed;
    private int levelOfRoar;

    public Tiger(){
        super("Tiger");
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public int getLevelOfRoar() {
        return levelOfRoar;
    }

    public int getSpeed() {
        return speed;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLevelOfRoar(int levelOfRoar) {
        this.levelOfRoar = levelOfRoar;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at speed of "+speed+" mph");
    }
}