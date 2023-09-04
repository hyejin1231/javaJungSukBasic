package org.example.ch11;

/**
 * ch11. Comparable과 Comparator
 */
public class Ex11_10
{
	public static void main(String[] args)
	{
	
	}
	
	// 버블 정렬
	public static void sort(int[] intArr)
	{
		for (int i = 0; i < intArr.length -1 ; i++)
		{
			for (int j = 0; j < intArr.length -1 - i; j++)
			{
				int tmp = 0;
				if (intArr[j] > intArr[j + 1]) { // 정렬 기준
					tmp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = tmp;
				}
			}
		}
	}
}
