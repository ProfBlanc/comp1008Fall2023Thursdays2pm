package wk2;

import java.util.Scanner;

public class Week2 {


    //psvm+tab

    public static void main(String[] args) {

        //example4();
        //ctl+g => go to a line
        chooseCoat();
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

    static void chooseCoat(){
        /*
        We are going to create a program that chooses the coat we should wear
        Based on: season, month, temperature
        Be back at: 15:20
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter season");
        String season = input.nextLine();
        System.out.println("Enter month");
        String month = input.nextLine();
        System.out.println("Enter temperature");
        double temperature = input.nextDouble();
        //create 2 static boolean methods that validate the season and month

        if(validateSeason(season) && validateMonth(month)){

            /*
                create your own, personal, customize code to decide which coat to wear
                if summer
                    month is september
                        if temp is 15+: no coat
                        if temp < 15: light coat
                    else
                        no coat
                if fall
                    on months
                        september: light coat
                        october: wind coat
                        november: winter coat
                        december: heavy duty coat
             */

            String coat = "N/A";
            if(season.equalsIgnoreCase("summer")){
                if(month.substring(0,3).equalsIgnoreCase("sep") &&
                        temperature < 15){
                    coat = "Light Coat";
                }
                else{
                    coat = "No coat";
                }
            }
            else if(season.equalsIgnoreCase("fall")){
                coat = switch (month.substring(0,3).toLowerCase()){
                    case "sep": yield "Light Coat";
                    case "oct": yield "Wind Coat";
                    case "nov": yield "Winter Coat";
                    default: yield "Heavy Duty Coat";
                };
            }
            /*
                    String formatting
                    Console.WriteLine($"I am {} years old. I love the {} programming lang"
                    , 100, "Java");
                    System.out.printf()
                    %DataType
                        %s
                        %d
                        %f
             */
            System.out.printf("In the %s season, during the %s month, with a " +
                    "temperature of %f, you should wear %s%n", season, month,temperature,coat);
        }
        else{
            //serr+tab
            System.err.println("Season and/or Month is invalid");
        }
    }
    static boolean validateSeason(String season){

        return season.equalsIgnoreCase("wiNtEr") ||
                season.equalsIgnoreCase("fall") ||
                season.equalsIgnoreCase("summer") ||
                season.equalsIgnoreCase("spring");
    }

    static boolean validateMonth(String month){
        //  m   a   r   c   h
        //  0   1   2   3   4
        return switch (month.toLowerCase().substring(0,3)){
            case "jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"
                    : yield true;
            default: yield false;
        };
    }
}
