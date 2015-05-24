/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author shahzad
 */
public class TestUtils {

    public static void main(String[] args) {

        try {

            // Time 
            Time time = new Time(System.currentTimeMillis());
            System.out.println(time);

            Date date = new Date(System.currentTimeMillis());
            System.out.println(date);

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            System.out.println(timestamp);

            // Formatting 
            SimpleDateFormat sdf
                    = new SimpleDateFormat("EEE, d MMM yyy HH:mm:ss Z");
            System.out.println(sdf.format(timestamp));

            SimpleDateFormat d = new SimpleDateFormat("D");
            System.out.println(d.format(timestamp));

            // Calendar
            Calendar cal = Calendar.getInstance();
            long current = cal.getTimeInMillis();
            System.out.println(sdf.format(cal.getTime()));
            cal.add(Calendar.HOUR, 1);
            cal.add(Calendar.DAY_OF_MONTH, 2);
            long end = cal.getTimeInMillis();
            System.out.println(sdf.format(cal.getTime()));
            long days = (end - current) / (1000 * 60 * 60);
            System.out.println(days);

            // Timer Task
            final Timer timer = new Timer("Scheduled Report");
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Timer Task Running .. " + System.currentTimeMillis() ) ;
                    //timer.schedule(this, 1000);
                }
            }, 1000, 1000);
        } catch (Exception e) {
        }
        
        // Quartz
    }
}
