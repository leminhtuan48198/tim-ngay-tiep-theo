public class NextDayCalculator {

    public static final String CONCATATION = "/";
    public static final int FIRSTOFMONTH = 1;
    public static final int FIRSTOFYEAR = 1;
    public static final int LASTOFYEAR = 12;

    public static String getNextDay(int day, int month, int year){
        int lastOfMonth = getLastOfMonth( month,year);
        if(day== lastOfMonth){
            if(month== LASTOFYEAR){
                return FIRSTOFMONTH+CONCATATION+ FIRSTOFYEAR +CONCATATION+ ++year;
            }
            return FIRSTOFMONTH +CONCATATION+(month+ 1)+CONCATATION+year;
        }
    return (day+ 1)+ CONCATATION +month+ CONCATATION +year;
}

    public static int getLastOfMonth(int month,int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if( isLeapYear(year))
                {return 29;}
                    return 28;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        boolean checkIsLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    checkIsLeapYear = true;
                }
            } else {
                checkIsLeapYear = true;
            }
        }
        return  checkIsLeapYear;
    }
    }

