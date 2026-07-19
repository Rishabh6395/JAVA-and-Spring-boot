/*
    Rules of Constructor:
    1. Same name as class
    2. No return type, not even void.
    3. Automatically called during object creation.
    4. used to inetialize an object.
    5. It can also be Overloaded.

    Question: Can we call Constructor manually?
    Ans: NO, we have to define a object or using this keyword we can call a Constructor.

    Question: When we create a object using 'new' keyword and if in Heap memory does'nt have enough space to create. Then what will heappen?
    Ans: We got an Run-time exception.
*/

public class cons {
    public static void main(String[] args) {
        Student s1 = new Student("rishabh", 22, 21, "UU");
        
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        Student s2 = new Student("rishabh2", 21, 22);        
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNumber);
    }
}

class Student {
    String name; 
    int age;
    int rollNumber;
    String college;

    // default constructor;
    Student(){}
    
    // constructor chaning
    Student(String name, int age, int rollNumber){
        this(name, age, rollNumber, null);
    }

    // parameterised constructor;
    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }


    void markAttendance(){ // behaviours  -> functions -null> instance variables
        System.out.println("Attendance marked by: " + name); 
    }
}
