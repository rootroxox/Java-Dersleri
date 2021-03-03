import java.util.Scanner;

public class Ders3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name;
        name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Your age: "+ age);
        System.out.println("Your name: "+ name);




    }
}
