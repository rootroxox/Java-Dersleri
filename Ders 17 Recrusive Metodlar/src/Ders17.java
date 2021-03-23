public class Ders17 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(addUntilX(20,sum));

    }
    static int addUntilX(int x, int sum){
        if(x == 0){
            return sum;
        }
        return addUntilX(x-1,sum+x);
    }
}
