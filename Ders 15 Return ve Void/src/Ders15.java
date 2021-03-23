public class Ders15 {
    public static void main(String[] args) {
        int ans = power(2,3);
        System.out.println(ans);
    }

    static int power(int base, int exp){
        int result = 1;
        for(int i = 1; i<= exp; i++){
            result *= base;
        }
        return result;
    }
}
