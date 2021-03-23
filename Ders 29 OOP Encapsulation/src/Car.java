public class Car {
    private double motor;
    private String color;
    private int doorNum;

    public Car(double motor, String color, int doorNum) {
        this.motor = motor;
        this.color = color;
        if(doorNum == 2 || doorNum == 4){
            this.doorNum = doorNum;
        }else{
            this.doorNum = 4;
        }
    }

    public void showInfo(){
        System.out.println("Motor : " + this.motor +"\nColor: " + this.color
                + "\nDoor Number: " + this.doorNum);
    }
}
