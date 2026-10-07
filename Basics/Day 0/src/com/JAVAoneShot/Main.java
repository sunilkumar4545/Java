package com.JAVAoneShot;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //METHODS
    public static void printJava(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {

        System.out.println("Hello java");

        //variable
        String neighbor = "Sunil Kumar";
        String Friend = neighbor;

        /*Java Types
        1.Primitive

        byte -1 [-128 to 127]
        short -2
        int -4
        long -8
        float- 8
        char -2
        bool -1 [true/false]

         */

        byte bit = 27;
        int phone1 = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean IsAdult = true;
        /*
        2. Non-primitive types
         */
        String name = "Samantha";
        String friend1 = new String("Zar ");
        System.out.println(name.length());

        //Concatenate
        String name2 = "Evilon";
        String name3 = name + " And " + name2;
        System.out.println(name3);

        //charAt
        System.out.println(name.charAt(0)); //S
        //length
        System.out.println(name.length());

        //replace
        String replace = name.replace('S', 'E');
        System.out.println(replace);

        //substring
        String name4 = "SUMI and Evilon";
        System.out.println(name4.substring(5, 8));

        /* ARRAYS
        1.Unidimensional Arrays (non-primitive)
         */

        int[] marks = {97, 98, 99};
        //95,97,98
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        //length
        System.out.println(marks.length);
        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);


        //2.Multidimensional Arrays

        int[][] finalmarks = {{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalmarks[1][1]); //Rows*Columns


        //Implicit casting
        double price = 100.00;
        double finalPrice = price + 18.5;

        System.out.println(finalPrice);
        //Explicit Casting
        int P = 100;
        int FP = P + (int) 18.5;
        System.out.println(FP);

        //CONSTANTS
        final float PI = 3.142F;

        /* OPERATORS */

        //1.Arithmetic Operators;
        double a = 5;
        double b = 3;

        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double modulus = a % b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(modulus);


        //2.Unirary Operators
        int[] num = {1, 1, 1, 1};
        System.out.println("--------------------------");
        System.out.println(++num[1]); //pre Increment
        System.out.println(num[1]);
        System.out.println("--------------------------");

        System.out.println(num[2]++); //post Increment
        System.out.println(num[2]);
        System.out.println("--------------------------");

        System.out.println(--num[3]); //pre Decrement
        System.out.println(num[3]);
        System.out.println("--------------------------");
        System.out.println(num[0]--); //post Decrement
        System.out.println(num[0]);
        System.out.println("--------------------------");

        //MATHS CLASS
        System.out.println(Math.max(2, 3));
        System.out.println(Math.min(2, 3));

        System.out.println((int) (Math.random() * 100)); //Random Value from 1-100

        //How to take INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your Age: ");
        float age = sc.nextFloat(); //Datatype Variable_name= sc.nextDatatype();
        System.out.println(age);


        System.out.print("Input your Name: ");
        String name5 = sc.next(); //String Variable_name= sc.next[tokens only]();
        System.out.println(name5);


        //CONDITIONAL STT
        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("It's day");
        else
            System.out.println("It's night");


        if (age > 18)
            System.out.println("Allowed to Vote");
        else
            System.out.println("Not Allowed to Vote");


    /*3.Comparison Operators
    a==b
    a!=b
    a<b
    a>b
    a>=b
    a<=b


    4.Logical Operators
     */
        //AND &&
        int p = 30;
        int q = 40;

        if (p < 50 && q < 50)
            System.out.println("both are less than 50");

        //OR ||
        if (p < 50 || q < 50)
            System.out.println("Atleast one is less than 50");

        //negation Operator !
        boolean isAdult = false;
        if (!isAdult)
            System.out.println("is Adult");
        else
            System.out.println("not Adult");



    /*
    EXAMPLES
     */
        //CONDITIONAL-IF ELSE

        //pen=10 notebook=40
        System.out.print("Enter Cash Amount: ");
        int cash = sc.nextInt();

        if (cash <= 10) {
            System.out.println("Cannot buy Anything");
            System.out.println("Get more Cash");
        } else if (cash < 50) {
            System.out.println("can get only one thing");
        } else {
            System.out.println("Can get both");
        }

        //CONDITIONAL-SWITCH

        System.out.print("Enter Number corresponding to days: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
        //LOOPS
        //forward for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //Backward for loop
        for (int i = 10; i >= 1; i--) { //i is local variable in for loop
            System.out.println(i);
        }

        //While loop
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        //Do While loop
        int k = 100;
        do {
            System.out.println(k);
            k--;
        } while (k >= 1);

        //BREAK AND CONTINUE
        int i = 0;
        while (true) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
            if (i > 5) {
                break;
            }

        }
        //EXCEPTION HANDING- TRY & CATCH
        try {
            System.out.println(marks[5]);
        } catch (Exception exception) {
            //do things after catching
        }
        System.out.println("Exception Handeling works like this");


        //METHODS
        printJava();

        //MINI PROJECT
        Scanner myNum= new Scanner(System.in);
        int myNumber= ((int) (Math.random() * 100)); //Random Value from 1-100
        int usernumber=0;

//        do{
//            System.out.print("Guess my number: ");
//            usernumber= sc.nextInt();
//            if(usernumber== myNumber){
//                System.out.println("WOOHO....CORRECT NUMBER!!!");
//                break;
//            }
//            else if(usernumber >myNumber){
//                System.out.println("Your number is too Large");
//            }
//            else{
//                System.out.println("Your number is too Small");
//            }
//        }
//        while (usernumber>=0);
//        System.out.println("My number was: ");
//        System.out.println(myNumber);

     
    }
}

