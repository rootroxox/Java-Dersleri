import jdk.swing.interop.SwingInterOpUtils;

public class Ders28 {

    /*
                                FINAL KEYWORD

            Sabit değişkenler veya fonksiyonlar tanımlarken kullanılır.


     */

    public static void main(String[] args) {
        HesapMakinesi h1 = new HesapMakinesi();

        System.out.println(h1.add(5,5));

        System.out.println(HesapMakinesi.PI);
    }
}
