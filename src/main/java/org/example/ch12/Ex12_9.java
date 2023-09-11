package org.example.ch12;

import java.util.Arrays;

/**
 * ch12. 열거형 enum
 * : 관련된 상수들을 묶어놓은 것
 */
// 열거형 상수는 == 와 compareTo() 사용
enum Direction {
	EAST, SOUTH, WEST, NORTH
}

public class Ex12_9
{
	public static void main(String[] args)
	{
		Direction east = Direction.EAST;
		Direction west = Direction.valueOf("WEST");
		Direction north = Enum.valueOf(Direction.class, "NORTH");
		
		System.out.println("east = " + east);
		System.out.println("west = " + west);
		System.out.println("north = " + north);
		
		System.out.println("(east == west) = " + (east == west));
//		System.out.println("(east > west) = " + (east > west)); // error ! 비교 연산자 사용 x
		System.out.println("(east.compareTo(west)) = " + (east.compareTo(west))); // -2
		
		switch (east) {
			case EAST -> System.out.println("The direction is EAST");
			case WEST -> System.out.println("The direction is WEST");
			case NORTH -> System.out.println("The direction is NORTH");
			case SOUTH -> System.out.println("The direction is SOUTH");
		}
		
		Direction[] values = Direction.values();
		System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
		
		for (int i = 0; i< values.length; i++)
		{
			System.out.println(values[i] + " = " + values[i].ordinal());
		}
	}
}

