import java.util.Scanner;

public class Ders25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan.nextInt();
        }

        double result;
        int sum = 0;

        for (int j : array1) {
            sum += j;
        }

        result = sum / 10.0;

        System.out.println("Result = " + result);


    }
}
