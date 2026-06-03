import java.io.Serializable;

public class Tiger extends Animal implements Walk,Serializable{
    private static final long serialVersionUID = 1L;
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
    public String toString() {
        return "Tiger{" +
                "nameOfAnimal='" + getNameOfAnimal() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", age=" + getAge() +
                ", numberOfStripes=" + numberOfStripes +
                ", speed=" + speed +
                ", levelOfRoar=" + levelOfRoar +
                '}';
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