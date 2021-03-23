public class Car {
    public String color;
    public int door;
    public double motor;

    public void showInfo(){
        System.out.println(this.color);
        System.out.println(this.door);
        System.out.println(this.motor);
    }

    Car(String color, int door, double motor){
        this.color = color;
        this.door = door;
        this.motor = motor;
    }
}
