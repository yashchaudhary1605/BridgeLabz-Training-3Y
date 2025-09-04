
class Employee {
    public int employeeID;       
    protected String department;    
    private double salary;         
   
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated to: ₹" + salary);
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

  
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}


class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

  
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID (public): " + employeeID);   
        System.out.println("Department (protected): " + department); 
        System.out.println("Salary (via getter): ₹" + getSalary());  
        System.out.println("Team Size: " + teamSize);
        System.out.println("-----------------------------");
    }
}


public class EmployeeRecords {
    public static void main(String[] args) {
     
        Employee e1 = new Employee(101, "IT", 45000);
        e1.displayEmployeeDetails();

        
        e1.setSalary(50000);
        System.out.println("Updated Salary: ₹" + e1.getSalary());
        System.out.println();

        Manager m1 = new Manager(201, "HR", 60000, 8);
        m1.displayManagerDetails();

       
        m1.setSalary(70000);
        System.out.println("Updated Manager Salary: ₹" + m1.getSalary());
    }
}
