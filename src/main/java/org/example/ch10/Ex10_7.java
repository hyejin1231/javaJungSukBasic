package org.example.ch10;

import java.util.Calendar;
import java.util.Date;

/**
 * ch10. Calendar 예제 (2)
 */
public class Ex10_7 {
    public static void main(String[] args) {
        // Calendar -> Date
        Calendar calendar = Calendar.getInstance();
        Date d = new Date(calendar.getTimeInMillis());

        // Date -> Calendar
        Date d2 = new Date();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(d2);
    }
}
