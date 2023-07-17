package org.example.ch02;

/**
 * ch02. 정수형의 오버플로우
 */
public class Ex2_11
{
	public static void main(String[] args)
	{
		short sMin = -32768, sMax = 32767; // 부호있는 정수
		char cMin= 0, cMax = 65535; // 부호없는 정수
		
		System.out.println("sMin = " + sMin);
		System.out.println("(sMin - 1) = " + (short)(sMin - 1));
		System.out.println("(sMax + 1) = " + (short)(sMax + 1));
		
		System.out.println("cMin = " + (int)cMin);
		System.out.println("(--cMin) = " + (int)(--cMin));
		System.out.println("cMax = " + (int)cMax);
		System.out.println("(++cMax) = " + (int)(++cMax));
	}
}
