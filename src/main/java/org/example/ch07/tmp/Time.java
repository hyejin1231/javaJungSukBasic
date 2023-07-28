package org.example.ch07.tmp;

/**
 * ch07. 캡슐화
 * 접근 제어자 사용 이유 : 외부로 부터 데이터를 보호하기 위해서
 */
public class Time
{
	// 접근제어자를 private 로 하여 외부에서 직접 접근하지 못하도록 한다.
	private int hour;
	private int minute;
	private int second;
	
	public int getHour()
	{
		return hour;
	}
	
	public void setHour(int hour)
	{
		if (isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}
	
	// 외부에서 불필요한, 내부적으로 사용되는 부분을 감추기 위해서 접근제어자 private 사용
	private static boolean isNotValidHour(int hour)
	{
		return hour < 0 || hour > 23;
	}
}
