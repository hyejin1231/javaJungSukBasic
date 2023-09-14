package org.example.ch12;

/**
 * ch12. 열거형 멤버 추가하기
 */

enum Direction2
{
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
	
	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	
	// 괄호를 사용하려면 생성자를 추가해야 한다. (열거형 생성자는 묵시적으로 private이고, 외부에서 객체 생성 불가)
	Direction2(int value, String symbol)
	{
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public static Direction2 of(int dir)
	{
		if (dir < 0 || dir > 4) {
			throw new IllegalArgumentException("Invalid value : " + dir);
		}
		return DIR_ARR[dir];
	}
}

public class Ex12_10
{
	public static void main(String[] args)
	{
		for (Direction2 direction2 : Direction2.values())
		{
			System.out.printf("%s = %d%n", direction2.name(), direction2.getValue());
		}
		
		Direction2 east = Direction2.EAST;
		Direction2 of = Direction2.of(2);
		
		System.out.printf("%s = %d%n", east.name(), east.getValue());
		System.out.printf("%s = %d%n", of.name(), of.getValue());
	}
}
