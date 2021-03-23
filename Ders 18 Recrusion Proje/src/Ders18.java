public class Ders18 {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21 34...
        /*
        f(7) = 8 + 5
        f(6) = 5 + 3
        f(5) = 3 + 2
        f(4) = 2 + 1
        f(3) = 1 + 1
        f(2) = 1
        f(1) = 1
         */
        System.out.println(fib(7));
    }

    static int fib(int n){
        if(n == 1 || n == 2)
            return 1;

        return fib(n-1) + fib(n-2);
    }
}
