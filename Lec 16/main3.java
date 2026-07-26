

public class main3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        EngineeringStudent es = new EngineeringStudent();
        es.name = "rishabh";
        es.markAttendance();
        es.attendLab();

    }
}

class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println("Mark attendacne by: " + name);
    }
}

class EngineeringStudent extends Student {
    
    void attendLab(){
        System.out.println("Lab attended");
        super.age = 12;
        System.out.println(age);
    }
}
