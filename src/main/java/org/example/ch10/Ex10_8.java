package org.example.ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * ch10. 형식화 클래스
 */
public class Ex10_8 {
    public static void main(String[] args) throws ParseException {
        // java.text 패키지의 DecimalFormat, SimpleDateFormat
        // DecimalFormat : 숫자를 형식화할 때 사용 (숫자 -> 형식 문자열)
        // 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능 (숫자, 날짜 -> 형식 문자열)
        double number = 1234567.89;
        DecimalFormat decimalFormat = new DecimalFormat("#.#E0");
        String result = decimalFormat.format(number);
        System.out.println("result = " + result);

        // 형식 문자열에서 숫자와 날짜를 뽑아내는 기능 (형식 문자열 -> 숫자, 날짜)
        DecimalFormat decimalFormat1 = new DecimalFormat("#,###.##");
        Number number1 = decimalFormat1.parse("1,234,567.89");
        double doubleValue = number1.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

    }
}
