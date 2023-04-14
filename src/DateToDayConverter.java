import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateToDayConverter {
    public static void main(String[] args) {
//        Calendar calender = Calendar.getInstance();
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
//        String TodayDate = simpleDateFormat.format(calender.getTime());
//        System.out.println(TodayDate);
//sout is the shortcut to System.out.println();
//https://stackoverflow.com/questions/5270272/how-to-determine-day-of-week-by-passing-specific-date/33895008#33895008

        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.parse("05-08-2023",dateTimeFormatter);
        DayOfWeek dayOfWeek=localDate.getDayOfWeek();
        String output=dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US);
        System.out.println(output);

    }
}
