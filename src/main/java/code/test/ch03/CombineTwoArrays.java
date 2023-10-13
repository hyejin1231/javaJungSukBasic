package code.test.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ch03. Two Pointers, Sliding Window [효율성 : O(n^2) --> O(n)]
 * : 두 배열 합치기
 *
 * 설명
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 *
 * 예시 입력 1
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 *
 * 예시 출력 1
 * 1 2 3 3 5 6 7 9
 */
public class CombineTwoArrays
{
	public static void main(String[] args)
	{
		CombineTwoArrays combineTwoArrays = new CombineTwoArrays();
		Scanner scanner = new Scanner(System.in);
		int aLen = scanner.nextInt();
		int[] a = new int[aLen];
		for (int i = 0; i < aLen; i++)
		{
			a[i] = scanner.nextInt();
		}
		
		int bLen = scanner.nextInt();
		int[] b = new int[bLen];
		for (int i = 0; i < bLen; i++)
		{
			b[i] = scanner.nextInt();
		}
		
		int[] result = combineTwoArrays.solution(a, b);
		for (int i : result)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		ArrayList<Integer> result2 = combineTwoArrays.solution2(aLen, a, bLen, b);
		System.out.println("result2 = " + result2);
		
		
	}
	
	public int[] solution(int[] a, int[] b)
	{
		int[] answer = new int[a.length + b.length];
		
		System.arraycopy(a, 0, answer, 0, a.length);
		System.arraycopy(b, 0, answer, a.length, b.length);
		
		Arrays.sort(answer);
		
		return answer;
	}
	
	public ArrayList<Integer> solution2(int n, int[] a, int m, int[] b)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m)
		{
			if (a[p1] < b[p2]) {
				answer.add(a[p1++]);
			} else {
				answer.add(b[p2++]);
			}
		}
		
		while (p1 < n)
		{
			answer.add(a[p1++]);
		}
		
		while (p2 < m )
		{
			answer.add(b[p2++]);
		}
		
		return answer;
	}
}
