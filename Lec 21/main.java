

public class main {
    public static void main(String[] args) {
        College college = new College("IIT G", "Assam");
        Student s1 = new Student(21, "Rishabh", college);
        
        System.out.println(s1.getCollege().name);
        s1.getCollege().name = "IIT B";
        System.out.println(s1.getCollege().name);

    }
}

// (Not purely immutable)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getters 
    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public College getCollege(){
        return this.college;
    }
}

class College {
    String name;
    String address;

    College(String name, String address){
        this.name = name;
        this.address = address;
    }
}

