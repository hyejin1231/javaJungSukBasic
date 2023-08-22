package org.example.ch10;

import java.util.Calendar;

/**
 * ch10. Calendar 예제 (1)
 */
public class Ex10_4
{
	public static void main(String[] args)
	{
		final int[] TIME_UNIT = { 3600, 60, 1 };
		final String[] TIME_UNIT_NAME = { "시간", "분", "초" };
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		long diff = Math.abs((time1.getTimeInMillis() - time2.getTimeInMillis())) / 1000;
		System.out.println("time1과 time2의 차이 : " + diff + "초 입니다. ");
		
		String tmp = "";
		for (int i = 0; i< TIME_UNIT_NAME.length; i++)
		{
			tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			diff %= TIME_UNIT[i];
		}
		
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
		
	}
}
