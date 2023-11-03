package code.test.ch06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ch06. Sorting and Searching(정렬, 이분검색과 결정알고리즘)
 * : 선택 정렬
 *
 * 설명
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 선택정렬입니다.
 *
 * 입력
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 *
 * 출력
 * 오름차순으로 정렬된 수열을 출력합니다.
 *
 * 예시 입력 1
 * 6
 * 13 5 11 7 23 15
 *
 * 예시 출력 1
 * 5 7 11 13 15 23
 */
public class SelectSort
{
	public static void main(String[] args)
	{
		SelectSort sort = new SelectSort();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++)
		{
			arr[i] = scanner.nextInt();
		}
		

		int[] result = sort.solution(n, arr);
		for (int i : result)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] result2 = sort.solution2(n, arr);
		System.out.println("Arrays.toString(result2) = " + Arrays.toString(result2));
		
	}
	
	public int[] solution(int n, int[] arr)
	{
		for (int i = 0; i < n; i++)
		{
			int idx = 0;
			int min = Integer.MAX_VALUE;
			for (int j = i ; j < n; j++)
			{
				if (arr[j] < min) {
					min = arr[j];
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = min;
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
	public int[] solution2(int n, int[] arr)
	{
		for (int i = 0; i < n - 1; i++)
		{
			int idx = i;
			for (int j = i + 1; j < n; j++)
			{
				if (arr[j] < arr[idx]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
}
