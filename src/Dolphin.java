import java.io.Serializable;

public class Dolphin extends Animal implements Swim,Serializable{
    private static final long serialVersionUID = 1L;

    private int swimmingSpeed;
    private String colorOfDolphin;

    public Dolphin(){
        super("Dolphin");
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "nameOfAnimal='" + getNameOfAnimal() + '\'' +
                ", weight=" + getWeight() +
                ", height=" + getHeight() +
                ", age=" + getAge() +
                ", swimmingSpeed=" + swimmingSpeed +
                ", colorOfDolphin='" + colorOfDolphin + '\'' +
                '}';
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at speed of "+swimmingSpeed+" nautical miles per hour");
    }
}