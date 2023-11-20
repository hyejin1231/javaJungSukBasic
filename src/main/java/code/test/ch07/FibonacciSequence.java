package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 피보나치 재귀 (메모이제이션)
 * -> 탄탄한 중소기업에서 코테로 많이 풀게 하는데 배열로, for문으로, 재귀함수로 한번 풀어보라고 한다.
 * 그리고 이 중에서 가장 성능이 좋은 코드는 뭐냐?!라고 묻는데 당연.. for문과 배열이다.
 * 재귀는 스택 프레임에 계속 쌓이기 때문에 성능이 좋지는 않다.
 *
 * 설명
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력 예제 1
 * 10
 *
 * 출력 예제 1
 * 1 1 2 3 5 8 13 21 34 55
 */
public class FibonacciSequence
{
	static int[] fibo;
	static int[] fibo2;
	public static void main(String[] args)
	{
		FibonacciSequence fibonacciSequence = new FibonacciSequence();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		fibo = new int[n + 1];
		fibo2 = new int[n + 1];
		
		int result = fibonacciSequence.DFS(n);
		System.out.println(result);
		
		long start = System.currentTimeMillis();
		System.out.println("== for문 활용 =="); // ex) n = 45 이다? 그럼 엄청 시간이 걸릴 것이다..;; 점점 느려짐 (n의 값이 커질수록 오래 걸림)
		for (int i = 1; i <= n; i++)
		{
			System.out.print(fibonacciSequence.DFS2(i) + " " );
		}
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("걸린 시간 : "  + (end - start) + "(ms)");
		
		start = System.currentTimeMillis();
		fibonacciSequence.DFS3(n);
		System.out.println("== static 배열 활용 (1) ==");
		for (int i= 1; i<= n; i++)
		{
			System.out.print(fibo[i] + " ");
		}
		end = System.currentTimeMillis();
		System.out.println();
		System.out.println("걸린 시간 : " + (end - start) + "(ms)");
		
		start = System.currentTimeMillis();
		fibonacciSequence.DFS4(n);
		System.out.println("== static 배열 활용 (2) : 메모이제이션 활용 ==");
		for (int i= 1; i<= n; i++)
		{
			System.out.print(fibo2[i] + " ");
		}
		end = System.currentTimeMillis();
		System.out.println();
		System.out.println("걸린 시간 : " + (end - start) + "(ms)");
	}
	
	// 나의 풀이
	public int DFS(int n)
	{
		if (n >= 3)
		{
			return DFS(n - 2) + DFS(n - 1);
		}else {
			return 1;
		}
	}
	
	// 강사님 풀이 1 : for 문을 활용한 풀이
	public int DFS2(int n)
	{
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return DFS2(n - 2) + DFS2(n - 1);
	}
	
	// 강사님 풀이 2 : static 배열을 활용한 풀이
	public int DFS3(int n)
	{
		if (n == 1) return  fibo[n] =1;
		else if (n == 2) return fibo[n] = 1;
		else return fibo[n] = DFS3(n-2) + DFS3(n-1);
	}
	
	// 강사님 풀이 3 : 메모이제이션을 활용한 풀이 (시간복잡도를 확 줄여봄)
	public int DFS4(int n)
	{
		if (fibo2[n] > 0) {
			return fibo2[n];
		}
		else if (n == 1) {
			return fibo2[n] = 1;
		}
		else if (n == 2) {
			return fibo2[n] = 1;
		}else {
			return fibo2[n] = DFS4(n-2) + DFS4(n-1);
		}
	}
}