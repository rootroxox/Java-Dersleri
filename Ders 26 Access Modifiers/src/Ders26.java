import x.Car2;

public class Ders26 {
    /*
                    ACCESS MODIFIERS (ERIŞIM BELIRLEYICILER)

        Public ---------->Bütün paketlerden, sınıflardan erişilebillir.
        Private --------->Sadece kendi sınıfı içerisinden erişilebilir.
        Protected -------->Sadece kendi paketi içerisinden veya kendi alt sınıfı
                          içerisinden erişilebilir.


     */
    public static void main(String[] args) {
//        Car car1 = new Car(200);
//
//        car1.changeColor("Siyah");
//        System.out.println(car1.toString());

        Car2 car2 = new Car2(200);

        car2.changeMotor(2.0);
        System.out.println(car2.toString());
    }
}
