package code.test.ch06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ch06. Sorting and Searching(정렬, 이분검색과 결정알고리즘)
 * : 삽입 정렬
 *
 * 설명
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 삽입정렬입니다.
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
 * 11 7 5 6 10 9
 *
 * 예시 출력 1
 * 5 6 7 9 10 11
 */
public class InsertionSort
{
	public static void main(String[] args)
	{
		InsertionSort insertionSort = new InsertionSort();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i< n; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		int[] result = insertionSort.solution(n, arr);
		for (int i : result)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] result2 = insertionSort.solution2(n, arr);
		System.out.println("Arrays.toString(result2) = " + Arrays.toString(result2));
	}
	
	//6
	//11 7 5 6 10 9
	// 7 11 5 6 10 9
	public int[] solution(int n, int[] arr)
	{
		for (int i = 1; i < n; i++)
		{
			int key = i;
			for (int j = i-1; j >= 0; j--)
			{
				if (arr[key] < arr[j]) {
					int tmp = arr[key];
					arr[key] = arr[j];
					arr[j] = tmp;
				}
				key--;
			}
		}
		
		return arr;
	}
	
	public int[] solution2(int n, int[] arr)
	{
		for (int i = 1; i < n; i++)
		{
			int tmp = arr[i], j;
			for ( j = i - 1; j >= 0; j--)
			{
				if (arr[j] > tmp)
				{
					arr[j + 1] = arr[j];
				}
				else
				{
					break;
				}
			}
			arr[j + 1] = tmp;
		}
		
		return arr;
	}
}
