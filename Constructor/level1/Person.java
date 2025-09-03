class Person {
    // Attributes
    String name;
    int age;


    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

 
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

 
    public static void main(String[] args) {
        
        Person p1 = new Person("Yash", 20);
        System.out.println("Original Person:");
        p1.displayDetails();

        System.out.println();

       
        Person p2 = new Person(p1);
        System.out.println("Copied Person:");
        p2.displayDetails();
    }
}
