package org.example.ch10;

import java.util.Calendar;
import java.util.Date;

/**
 * ch10. Calendar 예제 (1)
 */
public class Ex10_5
{
	public static void main(String[] args)
	{
		// clear() : Calendar 객체의 모든 필드 초기화
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(new Date(calendar.getTimeInMillis()));
		calendar.clear();
		System.out.println(new Date(calendar.getTimeInMillis()));
	}
}
