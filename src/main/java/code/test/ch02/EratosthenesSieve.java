package code.test.ch02;

import java.util.Scanner;

/**
 * ch02. Array(1, 2차원 배열)
 * : 소수 (에라토스테네스 체)
 *
 * 설명
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 *
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 *
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 *
 * 예시 입력 1
 * 20
 *
 * 예시 출력 1
 * 8
 */
public class EratosthenesSieve
{
	public static void main(String[] args)
	{
		EratosthenesSieve eratosthenesSieve = new EratosthenesSieve();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int result = eratosthenesSieve.solution(num);
		System.out.print(result);
	}
	
	// time limit error 걸림 ㅜ
	public int solution(int num)
	{
		int answer = 0;
		
		for (int i = 2; i <= num; i++)
		{
			int cnt = 0;
			for (int j = 1; j <= i; j++)
			{
				if (i % j == 0)
				{
					cnt++;
				}
			}
			if (cnt <= 2)
			{
				answer ++;
			}
		}
		
		return answer;
	}
	
	public int solution2(int n)
	{
		int answer = 0;
		int[] ch = new int[n + 1];
		
		for (int i = 2; i<= n; i++)
		{
			if (ch[i] == 0)
			{
				answer++;
				for (int j = i; j<= n; j = j+ i)
				{
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}
}
