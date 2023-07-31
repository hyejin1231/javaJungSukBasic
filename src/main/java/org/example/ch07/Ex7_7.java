package org.example.ch07;

import org.example.ch07.tmp.Car;
import org.example.ch07.tmp.FireEngine;

/**
 * ch07. instanceof 연산자
 */
public class Ex7_7
{
	public static void main(String[] args)
	{
		FireEngine fireEngine = new FireEngine();
		
		System.out.println("(fireEngine instanceof Object) = " + (fireEngine instanceof Object));
		System.out.println("fireEngine instanceof Car = " + (fireEngine instanceof Car));
		System.out.println("(fireEngine instanceof FireEngine) = " + (fireEngine instanceof FireEngine));
	}
}
