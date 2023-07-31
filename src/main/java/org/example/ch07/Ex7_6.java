package org.example.ch07;

import org.example.ch07.tmp.Car;
import org.example.ch07.tmp.FireEngine;

/**
 * ch07. 참조변수의 형변환(1) ~ (2)
 */
public class Ex7_6
{
	public static void main(String[] args)
	{
		// 형변환 할 때는 실제 인스턴스가 무엇인지가 중요하다 !
		Car car;
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2;
		
		fireEngine.water();
		car = fireEngine;
//		car.water(); // error! Car 타입 참조변수로는 water를 사용할 수 없다.
		fireEngine2 = (FireEngine) car; // 자손 타입 <- 조상 타입 형변환 생략 불가
		fireEngine2.water();
		
		// 형변환할 때 실제 인스턴스가 뭔지 !!! 중요하다
		Car car1 = new Car();
		FireEngine fireEngine1 = (FireEngine) car1; // car 인스턴스는 멤버개수가 4개인데 5개의 FireEngine으로 형변환은 안된다.
//		fireEngine1.water(); // compile error !
	}
}
