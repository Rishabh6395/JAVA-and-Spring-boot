
// functions in java

public class main {

    static int sum(int a, int b){
        return a+b;
    }

    // recursion

    static int recur(int n, int m){

        if(n == m) return n;
        System.out.println(n);
        n++;
        recur(n,m);
        return n;
    }

    public static void main(String[] args) {
        // System.out.println(sum(1,2));
        recur(5, 10);
    }
}