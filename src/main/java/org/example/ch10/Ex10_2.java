package org.example.ch10;

import java.util.Calendar;

/**
 * ch10. Calendar 예제 (1)
 */
public class Ex10_2
{
	public static void main(String[] args)
	{
		Calendar date = Calendar.getInstance();
		
		// 날짜 지정하는 방법
		// set() 으로 날짜와 시간 지정하기
		date.set(2023, 11 , 31); // 월 (month)는 0부터 시작한다는 점 주의 !
		
		// 시간 지정하는 방법
		Calendar time = Calendar.getInstance();
		time.set(Calendar.HOUR_OF_DAY, 10);
		time.set(Calendar.MINUTE, 8);
		time.set(Calendar.SECOND, 30); // 시간을 10시 8분 30초로 설정
	}
}
