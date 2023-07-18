package org.example.ch03;

/**
 * ch03. Math.round() 반올림
 */
public class Ex3_11
{
	public static void main(String[] args)
	{
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // (int) / (double) = (double)
		System.out.println("shortPi = " + shortPi);
	}
}
