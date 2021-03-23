public class Ders16 {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2, 2.7));
        System.out.println(add(1,2.9, 3));
    }

    // add(int,int)
    static int add(int a, int b){
        System.out.println("Fonksiyon 1");
        return a+b;
    }

    // add(int,int,int)
    static double add(int a, double b, int c){
        System.out.println("Fonksiyon 2");
        return a+b+c;
    }

    static double add(int a, int b, double c){
        System.out.println("Fonksiyon 3");
        return a+b+c;
    }
}
