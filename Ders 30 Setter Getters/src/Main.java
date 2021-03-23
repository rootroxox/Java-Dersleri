public class Main {

    /*
                  Object Oriented Programming Concepts
                Nesne Yönelimli Programlama Konseptleri

          *Encapsulation (Kapsülleme)
          *Inheritence (Kalıtım)
          *Polymorphism (Çok Biçimlilik)
          *Abstraction (Soyutlama)

                                  Setter/Getter Methods

          In Java, getter and setter are two conventional methods that are used
          for retrieving and updating the value of a variable. So, a setter is a
          method that updates the value of a variable. And a getter is a method that
          reads the value of a variable. Getter and setter are also known as accessor
          and mutator in Java.



     */
    public static void main(String[] args) {
        Car car1 = new Car(2.0,"Kırmızı",4);

        System.out.println(car1.getMotor());
        System.out.println(car1.getColor());
        System.out.println(car1.getDoorNum());

        car1.setDoorNum(5);
        System.out.println(car1.getDoorNum());

        car1.setMotor(1.6);
        System.out.println(car1.getMotor());

        car1.setColor("Sarı")
        System.out.println(car1.getColor());

    }
}
