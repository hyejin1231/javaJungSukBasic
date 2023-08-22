package org.example.ch10;

import java.util.Calendar;

/**
 * ch10. Calendar 예제 (1)
 */
public class Ex10_3
{
	public static void main(String[] args)
	{
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토", "일" };
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2023, 7 , 1);  // 2023년 8월 1일로 지정
		System.out.println("date1은 " + toString(date1) + "이고, ");
		System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] +"요일 입니다.");
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("date1 부터 오늘까지 " + diff +"초가 지났습니다..");
		System.out.println("일로 계산하면 " + diff/ (24 * 60 * 60) + " 일 입니다. "); // 1일 24 * 60 * 60
	}
	
	public static String toString(Calendar date)
	{
		return date.get(Calendar.YEAR) + "년 " + date.get(
				Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
