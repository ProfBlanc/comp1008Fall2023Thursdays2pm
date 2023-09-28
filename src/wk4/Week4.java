package wk4;

public class Week4 {
    public static void main(String[] args) {
        example5();
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
