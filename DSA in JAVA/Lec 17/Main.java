// Classes, Objects, Constructor, Object Lifecycle in Java;


public class main {
    public static void main(String[] args) throws Exception{
        // Defualt Constructor

        // Student A = new Student();
        // A.id = 1;
        // A.name = "Rishabh";
        // A.age = 12;
        // A.nos = 5;
        // System.out.println(A.name);
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.nos);

        // A.bunk();
        // A.study();
        // A.sleeep();

        // PARAMETERIZED CONSTRUCTOR

        Student a = new Student(5, 21, "Rishabh", 3);
        // System.out.println("name: "+a.name);
        // System.out.println("id: "+a.id);
        // System.out.println("age: "+a.age);
        // System.out.println("nos: "+a.nos);

        // a.bunk();
        // a.study();
        // a.sleeep();

        
        // COPY CONSTRUCTOR

        Student b = new Student(a);
        System.out.println("name: "+a.name);
        System.out.println("id: "+a.id);
        System.out.println("age: "+a.age);
        System.out.println("nos: "+a.nos);
        b.sleeep();

    }
    
}
