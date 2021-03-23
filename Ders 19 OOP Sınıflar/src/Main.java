public class Main {
    public static void main(String[] args) {
        //SınıfAdı objeİsmi = new SınıfAdı();
        Car araba1 = new Car();
        Car araba2 = new Car();
        Car araba3 = new Car();

        araba1.color = "Kırmızı";
        araba1.door = 4;
        araba1.motor = 1.6;

        araba1.showInfo();

        araba2.color = "Siyah";
        araba2.door = 2;
        araba2.motor = 2.0;

        araba2.showInfo();

        araba3.showInfo();

        araba3.color = "Yeşil";
        araba3.showInfo();

    }
}
