import java.util.Scanner;

public class Ders11 {

    /*
                        WHILE DÖNGÜLERİ

       Kullanımı:

       while(koşul){
            code...
            code...
            code...
            code...
            code...
            arttırma,azaltma,atama...
       }
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int number = scan.nextInt();
        int factorial = 1;

        while(number>1){
            factorial *= number;
            System.out.println("Sayı: " + number + " Faktöryel: " + factorial);
            number--;

        }

        System.out.println("Faktöryel = " + factorial);

    }
}
