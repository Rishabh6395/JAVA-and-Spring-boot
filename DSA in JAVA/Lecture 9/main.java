import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // int dailyPractice = 12;
        // if(dailyPractice >= 10){
        //     System.out.println("Good");
        // }

        // int age = 10;
        // if(age > 18){
        //     System.out.println("You are elegible");
        // }else {
        //     System.out.println("You are  not elegible");
        // }

        // NESTED IF CONDITION
        // boolean hasSub = true;
        // int solvedProblems = 20;

        // if(hasSub){
        //     if(solvedProblems >= 200){
        //         System.out.println("Unlock Advanced sheet");
        //     }
        //     else{
        //         System.out.println("Practice More Problem");
        //     }
        // }
        // else{
        //     System.out.println("Upgrade to premium");
        // }


        // TERNARY OPERATOR

        // int streakDay = 35;
        
        // String status = (streakDay >= 30) ? "Consistant" : "Irregular";

        // System.out.println(status);

        // SWITCH CASE;

        System.out.println("Enter the value for a day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thrus");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}
