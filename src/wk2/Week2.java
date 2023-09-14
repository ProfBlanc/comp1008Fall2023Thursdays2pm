package wk2;

import java.util.Scanner;

public class Week2 {


    //psvm+tab

    public static void main(String[] args) {

        example4();
    }

    //highlight, ctl+?
    static void example1(){

        System.out.println("Working with loops");

        int start = 1, end = 20;

//        for( ; start <= end ; start++){
//            System.out.print(start + "\t");
//        }


//        for( ; start <= end ; ){
//            System.out.print(start + "\t");
//            start++;
//        }

//        for( ; ; start++){
//            if(start > end)
//                break;
//            System.out.print(start + "\t");
//        }


//        for( ; ; ){
//            if(start > end)
//                break;
//            System.out.print(start + "\t");
//            start += 2;
//        }



//        while(start <= end){
//            System.out.println(start);
//            start++;
//            int abc = 123;
//        }


       // System.out.println(abc);


        do{
            System.out.println(start);
            start++;
        }while(start <= end);


        for(int i = 0; i < 10; i++){
            int b = 100;
            System.out.println(i);
        }



        /*
                in while loop:
                    do you have to initialize starting variable value
                    BEFORE using the loop?
                        YES
                is this the case in the for loop?
                    NO

                do-while? when to use?
                    when you need the loop to run at least once

                for vs while
                    for loop, statements (i, i< ...) variables are not accessible outside loop


         */


    }


    static void example2(){

        String numberText = "123";
        //Convert.toTargetDataType => Convert.toInt16() => short

        //converting from text to integral data type (any numerical data type)

        int v1 = Integer.parseInt(numberText);
        byte v2 = Byte.parseByte(numberText);
        long v3 = Long.parseLong(numberText);

        //promoting (converting) from smaller data type to bigger data
        //promotion
        //implicity typecast
        int v4 = v2;

        int v5 = 130;
        //explicitly typecast
        //demotion
        // bigger to a smaller data type
        byte v6 = (byte) v5;
        System.out.println(v6);

        /*
                byte range?

        lower                       upper

        -128                        127


        int value               byte value
        127                     127
        128                     -128
        129                     -127
        130                     -126

         */


    }

    static void example3(){

        //enhanced switch statement

        String color = "green";

        switch (color){
            case "red":
            case "blue":
            case "green":
                System.out.println("Primary Color for computers");
                break;
            case "yellow":
                System.out.println("Primary color for painting");
                break;
            default:
                System.out.println("Not a primary color");
        }

    }
    static void example4(){

        Scanner input = new Scanner(System.in);

        System.out.println("Input Color");
        String color = input.nextLine().trim();

        Object o = 123.45;
        o = true;
        o = "hello";

        Object result = switch (color){
            case "red", "blue", "green": yield "Primary color for computers";
            case "yellow": yield 123;
            default: yield "Not a primary color";
        };

        System.out.println(result);

    }
}
