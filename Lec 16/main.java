// Encapsulation

public class main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        ba.withDraw(2000);
        System.out.println(ba.getBalance());
    }
}


class BankAccount {
    private double balance;

    public void deposit(int amount){
        balance += amount;
    }
    public void withDraw(int amount){
        balance -= amount;
    }

    // getter/setter
    public double getBalance(){
        return balance;
    }
}


class Student {
    private String name;
    private int age;
    private int rollNum;
    private String college;

    // Constructor
    Student(String name, int rollNum, int age, String college){
        this.name = name;
        this.rollNum = rollNum;
        this.age = age;
        this.college= college;
    }

    // getter setter:
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCollege(){
        return college;
    }

    public void setCollege(String college){
        // we can perform validations here:
        this.college = college;
    }
}