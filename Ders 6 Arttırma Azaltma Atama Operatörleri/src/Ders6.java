public class Ders6 {
    public static void main(String[] args) {
        //Arttırma Azaltma ve Atama Operatörleri
        //   ++      --         =

        int a = 10;
        int b = 5;

        /*
        a++;
        a = a+1;
        a += 1; // a = a+1;




        b--;
        b = b-1;
        b -= 1; //b = b-1;

        ++a;
        a++;
        --b;
        */

        System.out.println("A'nın değeri: " + a);
        System.out.println("B'nın değeri: " + b);

        //System.out.println("A'nın değeri: " + ++a);
        System.out.println("A'nın değeri: " + a++);
        System.out.println("A'nın değeri: " + a);

        System.out.println("B'nın değeri: " + ++b);

    }
}
