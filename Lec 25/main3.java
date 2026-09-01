// Problem of Immutabiltiy

public class main3 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 0; i<5; i++){
            s+=i;
        }
        String s1 = "01234";
        System.out.println(s == s1);
    }
}
