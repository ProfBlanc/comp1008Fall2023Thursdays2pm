package wk3;

/**
 * This class determines which coat to wear based on the season, month and temperature
 * @author Ben
 * @since 2023-09-21
 * @version 1.0
 */
public class SeasonCoat {

    /*
            2 components
                attributes
                    characteristics
                        variables (instance variables)
                actions
                    behaviours, decisions made
                        methods

     */
    private String season, month, coat;
    private double temperature = -5;
    /*
        encapsulation
            hiding info
                1) integrity b/c sensitive info
                2) restrict values

    public: accessible anywhere
    protected : access w/i package
    package-private (default) : access w/i package
    private: only accessible w/i class
     */

    //getters and setters: way to access or modify values
    //methods
    //alt+insert
    //right-click => Generate

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        season = season.toLowerCase();
        this.season = switch (season){

            case "winter","fall",
                    "summer","spring": yield season;
            default:yield "winter";

        };
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        month = month.toLowerCase().substring(0,3);
        this.month = switch (month){
            case "jan","feb","mar","apr","may","jun","jul",
                    "aug","sep","oct","nov","dec": yield month;
            default: yield "jan";
        };
    }

    public String getCoat() {
        return coat;
    }

    private void setCoat() {

        if(season.equals("fall")){
            if(month.equals("sep")){
                coat = "light coat";
            } else if (month.equals("nov")) {
                coat = "winter coat";
            } else if (month.equals("dec")) {
                coat = "heavy coat";
            }
        }
        else if(season.equals("summer")){
            coat = "no coat";
        }
        else if(season.equals("spring")){
            coat = "light sweater";
        }
        else if(season.equals("winter")){
            coat = "super warm coat";
        }

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {

        if(temperature >= -50 && temperature <= 50)
            this.temperature = temperature;
    }

    //constructor: order form => customize the object when initializing
    /*
        special method
            no return data type
            name exact same as class
     */
    public SeasonCoat(){}  //default constructor: always avaialble
    // until you start adding new VARIATIONS of how to create an object

    public SeasonCoat(String season, String month, double temperature){
        setMonth(month);
        setTemperature(temperature);
        setSeason(season);
        setCoat();
    }
    public SeasonCoat(double temperature, String season, String month){
        this(season, month, temperature);
    }
    public SeasonCoat(String month, double temperature, String season){
        this(season, month, temperature);
    }
    /*
    method overloading
        same method name
            unique combo of
                1) amount of parameters
                2) order of data types
     */

    //summarize the object instance variables
    //aka adding the toString


    public String toString(){
        return String.format("Season=%s, Month=%s, Temp=%.1f, Coat=%s%n",
                season, month, temperature, coat);
    }

    /*
    Overridding: change the result of calling the method
    ??? Where does toString come from?
    Object class
        every class inherits from Object class
            Default constructor()
            toString()
            equals(Object o)



     */
}
