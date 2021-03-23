import java.util.Scanner;

public class EmpDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int salary;
        int workHours;
        int hireYear;

        System.out.print("Enter name: ");
        name = scan.nextLine();
        System.out.print("Enter salary: ");
        salary = scan.nextInt();
        System.out.print("Enter work Hour: ");
        workHours = scan.nextInt();
        System.out.print("Enter hire year: ");
        hireYear = scan.nextInt();

        Employee employee1 = new Employee(name,salary,workHours,hireYear);

        employee1.showInfo();

    }
}
