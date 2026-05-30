

public class Student {
    // Attributes:
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Constructor // attr-> garbage
    public Student(){
        System.out.println("Student Default Consturctor Called");
    }

    // Parameterized Constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student Parameterized Consturctor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy Constructor
    public Student(Student srcobj){ // srcboj -> A
        System.out.println("Student Copy Consturctor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Method(function) / Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    
    // Method(function) / Behaviours
    public void sleeep(){
        System.out.println(name + " Sleeping");
    }
    
    // Method(function) / Behaviours
    public void bunk(){
        System.out.println(name + " Bunking");
    }
    
}
