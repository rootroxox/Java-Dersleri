public class Driver {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        Vehicle car = new Car();
        Vehicle plane = new Plane();
        Vehicle rocket = new Rocket();

        car.maxSpeed();
        plane.maxSpeed();
        rocket.maxSpeed();



    }
}
