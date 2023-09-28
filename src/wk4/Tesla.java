package wk4;

public class Tesla {

    String make, model;

    public static final String FOUNDER = "Elon Musk";
    public static final short YEAR_CREATED = 2003;


    public static String emailSupport(String country){

        return switch (country.toLowerCase()){
            case "canada" -> "help@email.ca";
            case "usa" -> "help@email.com";
            default -> "help@help.com";
        };


    }
}
