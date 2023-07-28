package org.example.ch07;

import org.example.ch07.tmp.Time;

/**
 * ch07. 캡슐화
 * 접근 제어자 사용하는 이유
 * 1) 외부로부터 데이터를 보호하기 위해서
 * 2) 외부에서 불필요하고 내부적으로만 사용되는 부분을 감추기 위해서
 */
public class TimeTest
{
	public static void main(String[] args)
	{
		Time time = new Time();
//		time.hour  = 10;  // error ! hour를 private로 접근 제한해서 hour 에 직접 접근할 수 없도록 막음
		time.setHour(15); // 메서드를 통해 접근해서 값을 설정하도록 !
		System.out.println("time.getHour() = " + time.getHour());
	}
}
