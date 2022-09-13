package StaticJava;
public class MyUtilities {
    public static final int CUTOVER_YEAR = 1582; // Julian -> Gregorian calendar

    public static boolean isLeapYear3(int year) {
        boolean beforeCutover = year <= CUTOVER_YEAR;
        boolean every4Years = year % 4 == 0;
        boolean every100Years = year % 100 == 0;
        boolean every400Years = year % 400 == 0;
        return every4Years && (beforeCutover || !every100Years || every400Years);
    }}
