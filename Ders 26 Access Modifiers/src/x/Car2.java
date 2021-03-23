package x;

public class Car2 {
    public int speed;
    protected double motor;
    private String color;

    public Car2(int speed) {
        this.speed = speed;
        this.motor = 1.6;
        this.color = "Kırmızı";
    }

    public void changeColor(String color){
        this.color = color;
    }

    public void changeMotor(double x){
        this.motor = x;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", motor=" + motor +
                ", color='" + color + '\'' +
                '}';
    }
}
