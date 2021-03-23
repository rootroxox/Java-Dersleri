import java.util.Scanner;

public class Ders10 {

    /*
                            SWITCH-CASE YAPISI
        Kullanımı:
        switch(ifade){
            case durum1:
                code...
                break;
            case durum2:
                code...
                break;
            case durum3:
                code...
                break;
            case durum4:
            .
            .
            .
            break;
            case durum(n):
                code...
                break;
            default:
                code...
                break;
        }
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int seçim;
        int bakiye = 5000;
        int miktar;

        System.out.println("1.Bakiye Görüntüleme\n2.Para Çekme\n3.Para Yatırma\n4.Çıkış");
        seçim = scan.nextInt();

        switch(seçim){
            case 1:
                System.out.println("Bakiyeniz: " + bakiye);
                break;
            case 2:
                System.out.println("Miktar Giriniz: ");
                miktar = scan.nextInt();
                bakiye -= miktar;
                System.out.println("Bakiyeniz: " + bakiye);
                break;
            case 3:
                System.out.println("Miktar Giriniz: ");
                miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Bakiyeniz: " + bakiye);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Geçerli bir seçim yapınız...");
                break;

        }
    }
}
