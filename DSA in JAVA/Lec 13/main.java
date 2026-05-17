// Arrays in Java

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        // declaration of an array:

        // int arr[];

        // allocation
        // arr = new int[5];

        // init
        // int brr[] = {1,2,3};
        // System.out.println("single value priniting: "+brr[1]);

        // for(int i = brr.length - 1; i >= 0; i--){
        //     System.out.println(brr[i]);
        // }

        // For Each Loop
        // for(int val: brr){
        //     System.out.println(val);
        // }

        // how to take input in array:

        /*
            Normal way of taking input in array:
            Scanner sc = new Scanner(system.in)
            int n;
            n = sc.nextInt()
        */

        // int arr[] = new int[5];
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the element");
        // for(int i =0; i<=arr.length -1; i++){
        //     System.out.println("Provide the element value: " + i);
        //     arr[i] = sc.nextInt();
        // }

        // for(int val: arr){
        //     System.out.println("printing n values :"+val);
        // }

        // Printing the sum of an array:

        // int arr[] = {10,20,30,40,50};
        // int sum = 0;

        // for(int i =0; i<= arr.length-1; i++){
        //     sum += arr[i];
        // }
        // System.out.println("Sum of an array is: " +sum);

        // FIND MAXIMUM ELEMENT IN AN ARRAY:

        // int arr[] = {1,234,232,12,-12, 2,76,34};

        // int maxi = arr[0];

        // for(int i = 0; i<= arr.length -1; i++){
        //     if(arr[i] > maxi){
        //         maxi = arr[i];
        //     }
        // }
        // System.out.println(maxi);



        // 2D ARRAY:

        int [][] arr;
        
        arr = new int[3][4];

        int[][] brr = {
            {1,2},
            {3,4},
            {4,5},
            {5,6},
        };

        // System.out.println(brr[2][1]);

        for(int i =0; i<=3; i++){
            for(int j=0; j<=1; j++){
                System.out.print(brr[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
