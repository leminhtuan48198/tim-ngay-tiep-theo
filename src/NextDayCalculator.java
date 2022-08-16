public class NextDayCalculator {

    public static final String CONCATATION = "/";

    public static String getNextDay(int day, int month, int year){
        if(day==31){
            return 1+CONCATATION+(month+1)+CONCATATION+year;
        }
    return (day+1)+ CONCATATION +month+ CONCATATION +year;
}
}
