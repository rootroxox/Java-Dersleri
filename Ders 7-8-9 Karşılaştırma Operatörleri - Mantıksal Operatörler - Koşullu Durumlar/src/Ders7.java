public class Ders7 {
    public static void main(String[] args) {

        /*
                                  KARŞILAŞTIRMA OPERATÖRLERİ

                a==b ------> a, b'ye eşit mi? (eşit ise true, değil ise false)
                a!=b ------> a, b'ye eşit değil mi? (eşit değil ise true, eşit ise false)
                a>b -------> a, b'den büyük mü? (büyük ise true, değil ise false)
                a<b -------> a, b'den küçük mü? (küçük ise true, değil ise false)
                a<=b ------> a, b'den küçük yada eşit mi? (küçük yada eşit ise true, değilse false)
                a<=b ------> a, b'den büyük yada eşit mi? (büyük yada eşit ise true, değilse false)

         */

        /*
                                    MANTIKSAL OPERATÖRLER

                && (And)
                Kullanımı:

                (koşul 1 && koşul 2)

                Dönecek cevap:
                koşul1          koşul2          cevap

                true            true            true
                true            false           false
                false           true            false
                false           false           false


                || (Yada)
                Kullanımı:

                (koşul1 || koşul2)

                Dönecek cevap:
                koşul1          koşul2          cevap

                true            true            true
                true            false           true
                false           true            true
                false           false           false


                ! (not)
                Kullanımı:

                (!koşul1)

                Dönecek cevap:
                koşul1          cevap

                true            false
                false           true

                public static void main(String[] args) {
        boolean andOP = 5>4 && 7>2;
        boolean andOPP = 5>4 && 7<2;

        boolean orOP = 5<4 || 7<2;

        boolean notOP = !(5<4);
        boolean nottOP = !((5<4) && (6>2));




    }

         */

        /*
                                 IF, ELSE IF, ELSE YAPISI

                if(koşul1){


                }
                else if(koşul2){


                }
                else{

                //      koşul 1 ve koşul 2 sağlanmazsa çalışacak kısım

                }

       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu Giriniz: ");
        int note = scan.nextInt();

        if(note >= 90){
            System.out.println("AA ile geçtiniz...");
        }
        else if (note >= 80){
            System.out.println("BB ile geçtiniz...");
        }
        else if (note >=70){
            System.out.println("CC ile geçtiniz...");
        }
        else{
            System.out.println("Dersten Kaldınız!");
        }


    }



         */






    }
}
