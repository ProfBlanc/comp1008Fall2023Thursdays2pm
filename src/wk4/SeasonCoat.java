package wk4;

public class SeasonCoat {

    //String season;
    //country: enter your own country

    //enum: enumerable
    //preset selection of values aka drop-down menu
    //enum: array of CONSTANTS

    //2 steps in creating an enum
    //1: outline list of values
    //2: create an instance variable that stores

    enum ListOfSeasons {WINTER,SPRING,SUMMER,FALL}

    public ListOfSeasons season;

    enum Months {JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC}
    private Months month;

    public String getMonth(){
        return month.toString();
    }
    public void setMonth(Months month){
        this.month = month;
    }
    public void setMonth(String month){
        Months[] allMonths = Months.values();

        int index = -1;
        boolean match = false;
        for(Months currentMonth : allMonths){
            index++;
            if(currentMonth.toString().equals(month.toUpperCase())){
                match = true;
                break;
            }
        }
        this.month = match ? allMonths[index] : Months.JAN;
    }

}
