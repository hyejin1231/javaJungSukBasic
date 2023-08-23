package org.example.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ch10. SimpleDateFormat
 */
public class Ex10_10 {
    public static void main(String[] args) throws ParseException {
        // SimpleDateFormat : 날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(today);
        System.out.println("format = " + format);

        // 특정 형식으로 되어 있는 묹자열에서 날짜와 시간을 뽑아낼 수 있다,
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
        SimpleDateFormat df3 = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = df2.parse("2023년 8월 23일");
        String format1 = df3.format(parse);
        System.out.println("format1 = " + format1);

    }
}
