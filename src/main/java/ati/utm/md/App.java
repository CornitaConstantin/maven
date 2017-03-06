package ati.utm.md;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class App 
{
    public static void main( String[] args )

    {
        System.out.println( "Zile pina la noul an:" +
        daysToNewYear(
                LocalDate.now())
                .getDays(
        ));
    }
    public static Days daysToNewYear(LocalDate fromDate)
    {
        LocalDate newYear = fromDate
                .plusYears(1)
                .withDayOfYear(1);
        return Days.daysBetween(fromDate, newYear);

    }
}
