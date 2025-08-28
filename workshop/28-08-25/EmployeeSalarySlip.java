
public class EmployeeSalarySlip {

    public static void main(String[] args) {
        
        String[] names = {"Yash", "Rahul", "Priya", "Amit"};
        int[] basicSalary = {40000, 55000, 30000, 70000};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int basic = basicSalary[i];

         
            double hra = 0.20 * basic; 
            double da = 0.10 * basic; 

            double netSalary = basic + hra + da;

            if (netSalary > 50000) {
                double tax = 0.10 * netSalary;
                netSalary -= tax;
                System.out.println("\nSalary Slip for: " + name);
                System.out.println("Basic Salary: " + basic);
                System.out.println("HRA (20%): " + hra);
                System.out.println("DA (10%): " + da);
                System.out.println("Tax (10%): " + tax);
                System.out.println("Net Salary: " + netSalary);
            } else {
                System.out.println("\nSalary Slip for: " + name);
                System.out.println("Basic Salary: " + basic);
                System.out.println("HRA (20%): " + hra);
                System.out.println("DA (10%): " + da);
                System.out.println("Tax: 0");
                System.out.println("Net Salary: " + netSalary);
            }
        }
    }
}
