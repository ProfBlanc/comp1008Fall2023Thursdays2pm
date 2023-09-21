package wk3;

public class Week3 {

    public static void main(String[] args) {
        int count=0;
        for(int i = 0; i < 10; i++){
            count++;
            System.out.println(count);
        }
        //example5();
    }
    static void example1(){
        SeasonCoat seasonCoat = new SeasonCoat();

    }
    static void example2(){

        SeasonCoat seasonCoat = new SeasonCoat();
        seasonCoat.setSeason("blah");
        System.out.println(seasonCoat.getSeason());

        seasonCoat.setSeason("fall");
        System.out.println(seasonCoat.getSeason());

        seasonCoat.setTemperature(-1000);
        System.out.println(seasonCoat.getTemperature());

        seasonCoat.setTemperature(10);
        System.out.println(seasonCoat.getTemperature());

        seasonCoat.setMonth("blah");
        System.out.println(seasonCoat.getMonth());

        seasonCoat.setMonth("september");
        System.out.println(seasonCoat.getMonth());

    }
    static void example3(){
        SeasonCoat seasonCoat = new SeasonCoat("winter", "feb", -22);
        System.out.println(seasonCoat);
    }
    static void example4(){

        int[] nums1 = new int[5];
        SeasonCoat[] items = {
                new SeasonCoat(),
                new SeasonCoat(25, "summer", "aug"),
                new SeasonCoat("fall", "sep", 22)
        };

        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(items[2]);

        Object o = 1;
        o = true;
        o = 1.1;
        o = new SeasonCoat();

        Object[] values = {null, 0, false, new SeasonCoat()};

        System.out.println(values[1]);

    }
    static void example5(){

        //multi-dimensional arrays
        //arrays within arrays

        /*  dictionary aka associative array => Map

                mon      tue    wed

                php      c#     coop
                css      java   js
         */

        String[][] courses1 = new String[3][2];
        courses1[0][0] = "php";
        courses1[0][1] = "css";
        courses1[1][0] = "c#";
        courses1[1][1] = "java";
        courses1[2][0] = "coop";
        courses1[2][1] = "js";

        String[][] courses2 = {
                {"php","css"},
                {"c#","java"},
                {"coop","js"}
        };

        String[][] example = new String[3][];
        example[0] = new String[2];
        example[1] = new String[3];
        example[2] = new String[4];

        //iterate thru md-arrays

        for(int row = 0; row < courses2.length; row++){

            for(int column = 0; column < courses2[row].length; column++){

                //courses2[row][column] = "ben";
                System.out.println(courses2[row][column]);
            }
        }
    }
}
