class Circle {

    double radius;

    Circle() {
        this(1.0);  
    }

    Circle(double radius) {
        this.radius = radius;
    }

    
    double getArea() {
        return Math.PI * radius * radius;
    }

  
    double getCircumference() {
        return 2 * Math.PI * radius;
    }

  
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

   
    public static void main(String[] args) {
       
        Circle c1 = new Circle();
        System.out.println("Circle 1 (Default Constructor):");
        c1.displayDetails();

        System.out.println();

        
        Circle c2 = new Circle(5.0);
        System.out.println("Circle 2 (Parameterized Constructor):");
        c2.displayDetails();
    }
}
