package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 재귀 함수 : 자기 자신을 호출하는 함수
 *
 * 설명
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.
 *
 * 입력 예제 1
 * 3
 *
 * 출력 예제 1
 * 1 2 3
 */
public class FindTheCalf
{
	public static void main(String[] args)
	{
		FindTheCalf findTheCalf = new FindTheCalf();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		findTheCalf.DFS(n);
	}
	
	// 재귀 함수는 IF-ELSE로 문제 풀어주기 !
	public void DFS(int n)
	{
		if (n == 0) {
			return;
		}else {
			DFS(n-1);
			System.out.print(n + " "); // 1 2 3
		}
	}
	
	public void DFS2(int n)
	{
		if (n == 0) {
			System.out.println();
			return;
		}else {
			System.out.print(n + " "); // 3 2 1
			DFS(n-1);
			System.out.print(n + " "); // 1 2 3
		}
	}
	
}
