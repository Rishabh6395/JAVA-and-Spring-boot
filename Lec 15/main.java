// Static and final in Java
/*
    Rules of static method:
    1. One static method can call only other static method;
    2. Static method can only access static variables.
    3. Does not have access to "this" keyword;
*/

// Final keyword is similar to Constants in JS, if you declare a varaible with Final keyword then you can not change the value later.

public class main {
    public static void main(String[] args) {

        Student s1 = new Student("Rishabh", 23, 21);
        Student s2 = new Student("Rohit", 25, 26);

        // Student.college = "IIT Delhi";
        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNumber + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNumber + " , " + Student.college);

    }
}

class Student {
    int age;
    String name;
    int rollNumber;
    static String college;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    static {
        college = "IIT Delhi";
    }

}
