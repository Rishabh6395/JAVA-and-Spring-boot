// Basic maths needed for DSA

public class main {

    static void reverseInt(int num){
        
        while(num!=0){
            int lastNum = num%10;
            System.out.println(lastNum);
            num = num/10;
        }
    }

    static int countInt(int num){
        int count = 0;

        while(num !=0){
            int digit = num%10;
            count ++;
            num = num / 10;
        }
        return count;
    }

    // 1234
    static int sumInt(int num){
        int temp = 0;
        while(num !=0){
            int s = num %10; 
            temp += s; 
            num = num/10;
        }
        return temp;
    }

    static int reverseNum(int num){
        int l =0;
        while(num != 0){
            l = num %10;
            System.out.print(l);
            num = num /10;
        }
        return l;
    }

    static void palindromInt(int num){
        int or = num;
        int rev = 0;

        // ans = ans *10+digit;
        while(num !=0){
            int digit = num %10;
            rev = rev * 10 + digit;
            num = num /10;
        }
        if(rev == or){
            System.out.println("Yes");
        }
        else System.out.println("no");
    }

    public static void main(String[] args) {
        // reverseInt(123456);
        // System.out.println(countInt(123456));
        // System.out.println(sumInt(1234));
        // reverseNum(123456); 
        palindromInt(121); 
        int n = 121;
        int x = 121;
        // System.out.println(n == x ? "Yes" : "No");
    }
}
