// Arrays in Java

public class main {
    public static void main(String[] args) {
        int[] rollNum = new int[3];
        // 2nd way to declare arrays:
        int num[] = new int[3];
        // 101, 102, 103

        rollNum[0] = 101;
        rollNum[1] = 102;
        rollNum[2] = 103;

        // for(int i =0; i<rollNum.length; i++){
        //     System.out.println("arrays : "+ rollNum[i]);
        // }
        // System.out.println("length of array: " + rollNum.length);
        // System.out.println(rollNum[3]); // ArrayIndexOutOfBoundsException

        // int x = 100;
        // for(int i =0; i<num.length; i++){
        //     System.out.println("Value of x is: " + x);
        //     x++;
        // }

        // 2D arrays (array of arrays):

        int [][] marks = new int[3][3];

        marks[0][0] = 50;
        marks[0][1] = 60;
        marks[0][2] = 70;
        marks[1][0] = 80;
        marks[1][1] = 90;
        marks[1][2] = 100;


        for(int i = 0; i< marks.length; i++){
            for(int j =0; j<marks.length; j++){
                System.out.println("Position [" + i + "][" + j + "] = " +marks[i][j]);
            }
        }
        
        
    }
}
