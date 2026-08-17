// Object Class

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "fsd";
        s1.age = 69;
        Student s2 = new Student();
        s2.name = "fsd";
        s2.age = 69;
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
    }
}

class Student extends Object{
    String name;
    int age;

    @Override
    public String toString() {
        return this.name + ", " + this.age;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null) return false;

        if(obj.getClass() != this.getClass()){
            return false;
        }

        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = result * 31+ age;
        result = result *31 + name.hashCode();

        return result;
    }
}
