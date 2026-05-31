// Encapsulation in java

public class Student {
    // Attributes:
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        this.age = a;
    }

    // Default Constructor // attr-> garbage
    public Student(){
        System.out.println("Student Default Consturctor Called");
    }

    // Parameterized Constructor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterized Consturctor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
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

    public void gfChatting(){
        System.out.println(gf + " gfChatting");
    }
    
}


// public class main {
//     public static void main(String[] args) {
//         Student a = new Student(1, 12, "Rishabh", 3, "Tina");
//         // System.out.println(a.getName());

//         System.out.println("before setting: "+a.getAge());
//         int age = 21;
//         a.setAge(age);
//         System.out.println("after setting: "+age);

//         // a.gfChatting();
//     }
// }
