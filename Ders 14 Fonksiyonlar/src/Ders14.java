public class Ders14 {
    public static void main(String[] args) {
        // f(x) = 10x+6
        //f(10);
        power(2,3);
        power(3,2);
        power(10,2);

    }

    static void f(int x){
        int result = x*10+6;
        System.out.println("Result: " +result);

    }

    static void power(int base, int exp){
        int result = 1;
        for(int i = 1; i<= exp; i++){
            result *= base;

        }
        System.out.println("Result: " + result);
    }
}
