public class Driver {
    /*
                             Object Oriented Programming Concepts
                           Nesne Yönelimli Programlama Konseptleri

          *Encapsulation (Kapsülleme)
          *Inheritence (Kalıtım)
          *Polymorphism (Çok Biçimlilik)
          *Abstraction (Soyutlama)
     */
    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.age = 10;
        animal.gender = "Male";

        Duck duck = new Duck();
        duck.age = 5;
        duck.gender = "Female";
        duck.beakColor = "Red";

        Fish fish = new Fish();
        fish.size = 10;

        Zebra zebra = new Zebra();
        zebra.isWild = true;

    }
}
