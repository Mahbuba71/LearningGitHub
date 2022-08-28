package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    //Print month and year

     public static String[] returnNextMonth() {

        //Crate a date object
        Date dNow = new Date();
        // Create calendar object for Gregorian Calendar
        Calendar calendar = new GregorianCalendar();
        //Set calendar date to current date
        calendar.setTime(dNow);
        //Create object of SimpleDateFormat
        //Defining Date format to - example: (Jan-2022)
         SimpleDateFormat sdf = new SimpleDateFormat("MMM-YYYY");
         //Incrementing the current month
        calendar.add(Calendar.MONTH,1);
        //Generating the date based on the specified format

         String date = sdf.format(calendar.getTime());

         //Returning the value of month and year in an array

       return date.split("-");
     }
}
