class Employee {
    // Attributes
    String name;
    int id;
    double salary;

  
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee e1 = new Employee("Yash Chaudhary", 101, 45000.50);
        Employee e2 = new Employee("Rohit Sharma", 102, 52000.75);

        
        e1.displayDetails();
        e2.displayDetails();
    }
}
