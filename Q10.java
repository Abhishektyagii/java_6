abstract class Employee {

    abstract double calculateSalary();

    abstract void displayInfo();
}

class Manager extends Employee {

    double basicSalary;
    double bonus;

    Manager(double basicSalary, double bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Manager");
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {

    double basicSalary;
    double bonus;

    Programmer(double basicSalary, double bonus) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Programmer");
        System.out.println("Salary: " + calculateSalary());
    }
}

public class Q10 {
    public static void main(String[] args) {

        Manager manager = new Manager(50000, 10000);
        Programmer programmer = new Programmer(40000, 8000);

        manager.displayInfo();

        System.out.println();

        programmer.displayInfo();
    }
}