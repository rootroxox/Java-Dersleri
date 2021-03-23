public class Car {
    public int speed;
    private double motor;
    private String color;

    public Car(int speed) {
        this.speed = speed;
        this.motor = 1.6;
        this.color = "Kırmızı";
    }

    public void changeColor(String color){
        this.color = color;
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
