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
        this.season = season;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {

        if(temperature >= -50 && temperature <= 50)
            this.temperature = temperature;
    }
}
