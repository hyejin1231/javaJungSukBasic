package org.example.ch07;

import org.example.ch07.tmp.Car;
import org.example.ch07.tmp.FireEngine;

/**
 * ch07. 참조변수의 형변환(1)
 */
public class Ex7_6
{
	public static void main(String[] args)
	{
		Car car;
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2;
		
		fireEngine.water();
		car = fireEngine;
//		car.water(); // error!
		fireEngine2 = (FireEngine) car; // 자손 타입 <- 조상 타입 형변환 생략 불가
		fireEngine2.water();
	}
}
