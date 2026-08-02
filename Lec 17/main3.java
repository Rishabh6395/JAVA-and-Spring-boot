public class main3 {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}

// Static -> they belong to class and not to objects
// private -> privates method cant be overriden
// final -> final methods cant be overriden

class A{
    static void fun(){
        System.out.println("Hello");
    }

    private void fun2(){
        System.out.println("helo");
    }

    final void fun3(){
        System.out.println("Bye");
    }
}

class B extends A {
    static void fun(){
        System.out.println("Bye");
    }

    
}
