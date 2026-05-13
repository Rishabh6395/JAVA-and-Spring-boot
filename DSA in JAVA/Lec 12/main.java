// Methods in JAVA

public class main {

    static void tableOfTwo(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }

    static int sumPrint(int n, int m){
        return n+m;
    }

    static int sumPrint(int n, int m, int l){
        return n+m+l;
    }

    public static void main(String[] args) {
        System.out.println("Table printing:");
        tableOfTwo(5);

        System.out.println("Mthod overloading");
        int ans = sumPrint(1, 2);
        int ans2 = sumPrint(2, 3, 4);
        System.out.println("ans1" + ans);
        System.out.println("ans2"+ ans2);
    }
}
