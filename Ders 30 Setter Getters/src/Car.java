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

    //getter ----> Getirici


    public double getMotor(){
        return this.motor;
    }

    public String getColor(){
        return this.color;
    }

    public int getDoorNum(){
        return this.doorNum;
    }

    public void setMotor(double x){
        this.motor = x;
    }

    public void setColor(String x){
        this.color = x;
    }

    public void setDoorNum(int x){
        if(x == 2 || x == 4){
            this.doorNum = x;
        }else{
            this.doorNum = 4;
        }
    }
}
