// strings:

import java.util.Scanner;

public class main {

    // 1. Print each char of the string;
    static void printString(String str){
        for(int i =0; i<str.length(); i++){
            char l = str.charAt(i);
            System.out.println(l);
        }
    };

    // 2. count length of string without using length()
    static int getLength(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    };

    
    // 3. count vowels in a string;
    static void getVowelsCount(String str){
        int count = 0;
        for(int i =0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count);
    };

    // 4. Reverse a string;

    static void printReverseStr(String str){
        String newStrr = "";
        for(int  i = str.length()-1; i>=0; i--){
            // System.out.println(str.charAt(i));
            newStrr += str.charAt(i);
        }
        System.out.println(newStrr);
    };

    // 5. check string is a palindrome or not; 
    
    static void checkPalindrom(String str){
        String temp = "";
        String newTemp = "";
        for(int i =0; i<= str.length()-1; i++){
            temp += str.charAt(i);
            // System.out.println("Temp: " + temp);
        }
        for(int j = str.length()-1; j>=0; j--){
            newTemp += str.charAt(j);
            // System.out.println("newTemp: " + newTemp);
        }
        if(temp.equals(newTemp)){
            System.out.println("Yes");
        } 
        else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        // System.out.println(getLength("rishabh")); 
        // System.out.println(getVowelsCount("Rishabh"));
        // getVowelsCount("my name is rishabh bhatt");
        // printReverseStr("Rishabh");
        checkPalindrom("mom");

        // String fName = "rishabh";
        // String lName = "bhatt";

        // System.out.println("Firstname is: " + fName + " and " + "Lastname is: " + lName);
        // System.out.println("Length of fname is: " + fName.length());

        // STRING IS IMMUTABLE:
        
        // String str = "test";
        // str = "new test";
        // System.out.println(str);

        // output: new test (becuase in 1st go str is reffering to the "test" but after reassign string as "new test" then str is pointing to the "new test", that's why it is printing as new test)

        // COMPARING STRING:

        // String name1 = "Rishabh";
        // String name2 = "Rishabh";

        // if(name1 == name2){
        //     System.out.println("Both equal");
        // }
        // else{
        //     System.out.println("both are not equal");
        // }
        // explaination: o/p is Both equal because both are pointing to the same location, when in stack name1 is assigned a location then java will check the string of name2 is present in String Pool or not if present then it should not assigned new memory to the name2;

        // System.out.println("by.equals() method" + name1.equals(name2)); // best way to compare strings, but this is case sensetive;
        // System.out.println("by.equalsIgnoreCase() method" + name1.equalsIgnoreCase(name2)); // this is not case senesetive;

        // HOW TO TAKE INPUT IN STRING;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Provide the string conetent: ");
        // String str = sc.nextLine();
        // System.out.println("Values of str is : " + str);

        
        // System.out.println("Provide the string conetent: ");
        // String str2 = sc.next();
        // System.out.println("Values of str is : " + str2);


        // String str = "my name";
        // System.out.println(str.substring(3, 7));

        // Questions:
        /*
            1. Print each char of the string;
            2. count length of string without using length()
            3. count vowels in a string;
            4. Reverse a string;
            5. check string is a palindrome or not; 
        */

        // 1. Print each char of the string;

        // String str = "rishabh";
        // char[] arr = str.toCharArray();

        // for(char l: arr){
        //     System.out.println(l);
        // }



        // 2. count length of string without using length()

        // String str = "rishabh";
        // char[] arr = str.toCharArray();
        // int newarr;

        // for(int i = 0; i<arr; i++){
        //     newarr++;
        //     System.out.println(i);
        // }



        
    }
}
