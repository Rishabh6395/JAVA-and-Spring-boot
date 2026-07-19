

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.age = 22;
        s1.name = "rishabh";
        s1.rollNumber = 12;
        s1.college = "UU";

        // Constructor -> to create an object

        // Default values: 
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // Local variable -> NO default value
        // int x;
        // System.out.println(x);
        
    }
}

class Student {
    String name; // information/data/characterstics -> instance variables (Having a default values)
    int age;
    int rollNumber;
    String college;

    void markAttendance(){ // behaviours  -> functions -> instance variables
        System.out.println("Attendance marked by: " + name); 
    }
}
