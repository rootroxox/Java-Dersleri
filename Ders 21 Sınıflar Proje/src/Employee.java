public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary >1000){
            System.out.println("Your tax: " + (this.salary*3)/100);
            this.salary -= (this.salary*3)/100;
        }
    }

    public void bonus(){
        if(this.workHours > 8){
            int bonus = (this.workHours-8)*30;
            System.out.println("Bonus: " + bonus);
            this.salary += bonus;
        }
    }

    public void raiseSalary(){
        if(2021-this.hireYear < 10){
            System.out.println("Raise Salary: " + (this.salary*5)/100);
            this.salary += (this.salary*5)/100;
        }
        else if(2021-this.hireYear > 10 && 2021-this.hireYear < 20){
            System.out.println("Raise Salary: " + (this.salary*10)/100);
            this.salary += (this.salary*10)/100;
        }
        else if(2021-this.hireYear > 19){
            System.out.println("Raise Salary: " + (this.salary*15)/100);
            this.salary += (this.salary*15)/100;
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Date: " + this.hireYear);
        this.tax();
        this.bonus();
        this.raiseSalary();
        System.out.println("Last Salary: " + this.salary);
    }
}
