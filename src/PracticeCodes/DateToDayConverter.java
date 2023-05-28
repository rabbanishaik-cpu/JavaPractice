package PracticeCodes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateToDayConverter {
    //sout is the shortcut to System.out.println();
//https://stackoverflow.com/questions/5270272/how-to-determine-day-of-week-by-passing-specific-date/33895008#33895008

    public static String getDay(String day){
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.parse(day,dateTimeFormatter);
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        System.out.println(getDay(day));
    }
}
