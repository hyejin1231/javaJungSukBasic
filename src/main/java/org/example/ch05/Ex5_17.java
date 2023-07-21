package org.example.ch05;

import java.util.Arrays;

/**
 * ch05. Arrays로 배열 다루기
 * equals(), deepToEquals()
 * toString(), deepToString()
 * copy(), copyOfRange()
 * sort()
 */
public class Ex5_17
{
	public static void main(String[] args)
	{
		// 1) 배열의 비교와 출력 equals(), deepEquals() -> 다차원 비교, 비교시 == 등가 비교 사용하면 안됨 !! (등가 비교는 참조변수 값 비교하는 거임!)
		// 					  toString(), deepToString() -> 다차원 출력
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("[배열의 비교와 출력]");
		System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
		System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));
		
		System.out.println("Arrays.equals(arr, arr) = " + Arrays.equals(arr, arr));
		System.out.println("Arrays.deepEquals(arr2D, arr2D) = " + Arrays.deepEquals(arr2D, arr2D));
		System.out.println();
		
		// 2) 배열의 복사 - copyOf(), copyOfRange()
		System.out.println("[배열의 복사]");
		int[] copyArr = Arrays.copyOf(arr, arr.length); // arr과 동일하게 복사
		System.out.println("Arrays.toString(copyArr) = " + Arrays.toString(copyArr));
		
		int[] copyArr2 = Arrays.copyOf(arr, 3);
		System.out.println("Arrays.toString(copyArr2) = " + Arrays.toString(copyArr2));
		
		int[] copyOfRangeArr = Arrays.copyOfRange(arr, 0, 3);
		System.out.println("Arrays.toString(copyOfRangeArr) = " + Arrays.toString(copyOfRangeArr)); // 0 ~ 2까지
		
		int[] copyOfRangeArr2 = Arrays.copyOfRange(arr, 0, 7);
		System.out.println("Arrays.toString(copyOfRangeArr2) = " + Arrays.toString(copyOfRangeArr2));
		System.out.println();
		
		// 3) 배열의 정렬 - sort() 오름차순 정렬
		int[] sortArr = { 0, 4, 2, 3, 1 };
		Arrays.sort(sortArr);
		System.out.println("[배열의 정렬]");
		System.out.println("Arrays.toString(Arrays.sort(sortArr);) = " + Arrays.toString(sortArr));
	}
}
