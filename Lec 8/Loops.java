// package Lec 8;

public class Loops {
    public static void main(String[] args) {
        // For Loop

        // int l = 1;
        // for( int i = l; i <=10; i++){
        //     System.out.println("i value: " + i);
        // }

        // While loop

        // int i =1;
        // while(i <=10){
        //     System.out.println("i value " + i);
        //     i++;
        // }

        // do while loop:

        // do{
        //     // do something
        // } while(expression);

        // int i =1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i <=10);



        // VARIATIONS IN LOOPS:

        // for(int i =0, j =0; i<=10; i++, j++){
        //     System.out.println("Square of "+ j + ": "  + i * i);
        // }

        // Pattern Printing

        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        // for(int i =1; i<= 5; i++){ // row
        //     for(int j = 1; j <= i; j++){ // col
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // JUMP STATEMENTS:
        // break, continue;


        // for(int i= 1; i<= 10; i++){
        //     if(i == 2) continue;
        //     System.out.println(i);

        //     if(i > 5) break;
        // }
        
        
        // for(int i=1; i<=10; i++){
        //     if(i % 2 != 0){
        //         System.out.println("Odd Number: " + i);
        //     }else{
        //         System.out.println("Even num " + i);
        //     }
        // }

        for(int i=1 ; i<=10; i++){
            if(i %2 ==0) continue;
            System.out.println("Odd num " + i);
        }


    }
}
