package code.test.ch02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ch02. Array(1, 2차원 배열)
 * : 피보나치 수열
 *
 * 설명
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력
 * 첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 예시 입력 1
 * 10
 *
 * 예시 출력 1
 * 1 1 2 3 5 8 13 21 34 55
 */
public class Fibonacci
{
	public static void main(String[] args)
	{
		Fibonacci fibonacci = new Fibonacci();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] result = fibonacci.solution(num);
		for (int i : result)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] result2 = fibonacci.solution2(num);
		System.out.println(Arrays.toString(result2));
		
		fibonacci.solution3(num);
	}
	
	public int[] solution(int num)
	{
		int[] answer = new int[num];
		answer[0] = 1;
		answer[1] = 1;
		
		for (int i = 2; i< num; i++)
		{
			answer[i] = fibo(answer[i - 2], answer[i-1]);
		}
		
		return answer;
	}
	
	public int fibo(int prev, int next)
	{
		return prev + next;
	}
	
	public int[] solution2(int n)
	{
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		
		for (int i = 2; i< n; i++)
		{
			answer[i] = answer[i - 2] + answer[i - 1];
		}
		
		return answer;
	}
	
	public void solution3(int n)
	{
		int a = 1, b= 1, c = 0;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i< n; i++)
		{
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	
	
}
