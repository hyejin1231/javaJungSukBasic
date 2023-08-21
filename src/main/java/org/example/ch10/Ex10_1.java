package org.example.ch10;

import java.util.Calendar;

/**
 * ch10. 날짜와 시간, Calendar 클래스
 */
public class Ex10_1
{
	public static void main(String[] args)
	{
		// Calendar 클래스는 추상클래스이므로 getInstance를 통해 구현된 객체를 얻어야 한다.
		Calendar cal = Calendar.getInstance();
		
		// get() 으로 날짜와 시간 필드 가져오기
		int thisYear = cal.get(Calendar.YEAR); // 올해가 몇년인지
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막날
		
		System.out.println("thisYear = " + thisYear);
		System.out.println("lastDayOfMonth = " + lastDayOfMonth);
		
		System.out.println("이 해의 년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 (0 ~ 11, 0 :1월) : " + cal.get(Calendar.MONTH));
		System.out.println("이 해의 몇째 주 : " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주 : " + cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println();
		
		System.out.println("이 달의 몇 일 : " + cal.get(Calendar.DATE) );
		System.out.println("이 달의 몇 일 : " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 월 : " + cal.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 (1 ~ 7, 1:일요일) : " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println();
		
		System.out.println("오전 오후 (0: 오전, 1:오후) : " + cal.get(Calendar.AM_PM));
		System.out.println("시간 (0 ~ 11) : " + cal.get(Calendar.HOUR));
		System.out.println("시간 (0 ~ 23) : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0 ~ 59 ) : " + cal.get(Calendar.MINUTE));
		System.out.println("초 (0 ~ 59 ) : " + cal.get(Calendar.SECOND));
		System.out.println("1000분의 1초 (0~999) : " + cal.get(Calendar.MILLISECOND));
		System.out.println("TimeZone : " + (cal.get(Calendar.ZONE_OFFSET)) / (60 * 60 * 1000));
		System.out.println("이 달의 마지막 날 : " + cal.getActualMaximum(Calendar.DATE));
	}
}
