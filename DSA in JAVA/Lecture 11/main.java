

public class main {
    public static void main(String[] args) {
        // 1st pattern printing:
        /*
            * * * * * *
            * * * * * *
            * * * * * *
            * * * * * *
        */
        // code:
        // for(int i =1; i<=3; i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2nd Pattern:
        /*
                 * * * * * * *
                * * * * * * *
               * * * * * * * 
              * * * * * * * 
             * * * * * * * 
        */

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k<=n; k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 5:

        /*
                    *
                  * * *
                * * * * *
              * * * * * * *
            * * * * * * * * *
        */

        // i -> row; j -> col
        // int n =5;

        // for(int i =1; i<=n; i++){
        //     // spaces:
        //     for(int j = 1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 1; j<= 2*i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Pattern 6:

        /*
            * * * * * * *
              * * * * * 
                * * *  
                  *  
        */
        
        // int n =4;

        // for(int i =1; i<=n; i++){
        //     // For Space
        //     for(int j =1; j<=i-1; j++){
        //         System.out.print("  ");
        //     }
        //     // For Stars
        //     for(int j = 1; j<= 2* n - 2* i +1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Pattern 7:
        /*
           * * * * * * *
           *           *
           *           *
           * * * * * * *
        */

        int n = 4;

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=6; j++){
                if(i== 1 || i == n){
                    System.out.print("* ");
                }
                else if(j == 1 || j == 6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
