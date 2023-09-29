package wk4;

public class Week4 {
    public static void main(String[] args) {
        example7();
    }
    static void example7(){

        //String ref or prim?
        //SeasonCoat sc = "hello";
        String s1 = "Hello";
        //string is a hybrid.
        s1 = "World";
        String s2 = new String();
        String s3 = new String("Hello");
        String s4 = new String(new char[]{'B','e','n'});

        System.out.println(s4);

        //length: # of chars
        //capacity: max # of chars
        //capacity in NOT fixed
        //increase by: +1, * 2
        //capacity = 10   => 22
        StringBuilder sb = new StringBuilder();  //l=0, cap=16
        StringBuilder sb1 = new StringBuilder(20);// l=0, cap=20
        StringBuilder sb2 = new StringBuilder("hello"); //l=5, cap = l + 16


        sb2.deleteCharAt(1); //hllo
        sb2.insert(2, "ben"); //hlbenlo
        sb2.setLength(3);  //hlb
        sb2.delete(0,2); // b
        String b = sb2.toString();
        System.out.println(sb2); //b
        sb2.append("Hello");

        sb2.append(123);
        sb2.append(true);
        sb2.append(12.34);
        sb2.append("World");
        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
    }
    static void example6(){

        Student kid = Student.elementarySchoolStudent("Kid", 10, 90);
        System.out.println(kid);

        Student s1 = Student.honorRollStudent("Smarty Pants", 20, 99);

        Student s2 = Student.postSecondaryStudent();

        System.out.println(s1);
        System.out.println(s2);
    }
    static void example5(){
        int i = 123;
        SeasonCoat a = new SeasonCoat();
        a.setMonth("sep");
        System.out.println(a.getMonth());
    }
    static void example4(){

        System.out.println(SeasonCoat.ListOfSeasons.SPRING);
        System.out.println(SeasonCoat.ListOfSeasons.values()[1]);

        SeasonCoat seasonCoat = new SeasonCoat();
        System.out.println(seasonCoat.season);
        seasonCoat.season = SeasonCoat.ListOfSeasons.FALL;
        System.out.println(seasonCoat.season);

        String s = SeasonCoat.ListOfSeasons.WINTER.toString();
        String s1 = SeasonCoat.ListOfSeasons.values()[2].toString().toLowerCase(); // SUMMER

        //iterate / cycle through enums
        //enhanced for loop

        //for(DataType placeHolderName : collectionOfValues){}
        System.out.println();
        int[] nums = {1,2,3,4,5};
        for (int currentNumber : nums){
            System.out.println(currentNumber);
        }
        System.out.println();
        for(SeasonCoat.ListOfSeasons currentSeason : SeasonCoat.ListOfSeasons.values())
        {
            System.out.println(currentSeason);
        }

    }
    static void example3(){
        switch ("hello"){
            case "Hello":
                //do something;
                break;
            case "hello":
                //do something;
                break;
            default:
                //do something
                break;
        }

        int a = switch (12345){
            case 123: yield 456;
            default: yield 98765;
        };
        boolean b = switch ("example"){
            case "hello" -> false;
            default -> true;
        };
    }
    static void example2(){
        Tesla t = new Tesla();

       // System.out.println(Tesla.Founder);
        //Tesla.Founder = "Ben";
       // System.out.println(Tesla.Founder);
        System.out.println(Tesla.FOUNDER);

        System.out.println(Tesla.YEAR_CREATED);

        System.out.println(Tesla.emailSupport("canada"));
    }
    static void example1(){

        char letter = '\n';

        int num = letter; //implicitly typecasted
        //ASCII chart
        System.out.println(num);


        Object o = 123;
        o = "hi";
    }
}
