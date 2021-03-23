import java.util.Scanner;

public class Ders12 {

    /*
                        DO-WHILE DÖNGÜLERİ

       Kullanımı:

       do{
            code...
            code...
       }
       while(koşul);

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scan.nextInt();
        int toplam = 0;

        //1234

        do{
            System.out.println("Toplam: " + toplam + " Sayı: " + number);
            toplam += number%10; //toplam = toplam + number%10;
            number /=10;
            System.out.println("Toplam: " + toplam + " Sayı: " + number);
        }
        while(number>0);


    }
}
