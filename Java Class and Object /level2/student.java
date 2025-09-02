class Student {
   
    String name;
    int rollNumber;
    double marks;

 
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

  
    char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else if (marks >= 35) {
            return 'D';
        } else {
            return 'F';
        }
    }


    void displayReport() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
     
        Student s1 = new Student("Yash Chaudhary", 101, 92);
        Student s2 = new Student("Rohit Sharma", 102, 78);
        Student s3 = new Student("Ankit Verma", 103, 46);

  
        s1.displayReport();
        s2.displayReport();
        s3.displayReport();
    }
}
