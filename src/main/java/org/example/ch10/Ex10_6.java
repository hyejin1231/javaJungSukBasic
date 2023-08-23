package org.example.ch10;

import java.util.Calendar;

/**
 * ch10. Calendar 예제 (2)
 */
public class Ex10_6 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.clear(); // 모든 필드 초기화
        date.set(2020, 7, 31); // 2023년 8월 23일

        // add() : 특정 필드의 값을 증가 또는 감소 (다른 필드에 영향 x)
        date.add(Calendar.DATE, 1);  // 날짜에 1 더하기
        date.add(Calendar.MONTH, -8); // 월에 -1 하기
        System.out.println("date.toString() = " + toString(date));

        // roll() : 특정 필드의 값을 증가 또는 감소 (다른 필드에 영향 x)
        date.set(2020, 7, 31);

        date.roll(Calendar.DATE, 1); // 날짜에 1을 더한다.
        date.roll(Calendar.MONTH, -8); // 월에 8을 뺀다.
        System.out.println("date.toString() = " + toString(date));
    }

    public static String toString(Calendar date)
    {
        return date.get(Calendar.YEAR) + "년 " + date.get(
                Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
    }
}
