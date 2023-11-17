package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 이진수 출력
 *
 * 설명
 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단 재귀함수를 이용
 * 해서 출력해야 합니다.
 *
 * 입력 설명
 * 첫 번째 줄에 10진수 N(1<=N<=1,000)이 주어집니다.
 *
 * 출력 설명
 * 첫 번째 줄에 이진수를 출력하세요.
 *
 * 입력 예제 1
 * 11
 *
 * 출력 예제 1
 * 1011
 */
public class BinaryInput
{
	public static void main(String[] args)
	{
		BinaryInput binaryInput = new BinaryInput();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		binaryInput.DFS(n);
	}
	
	public void DFS(int n)
	{
		if (n == 0) {
			return;
		}else {
			DFS(n / 2);
			System.out.print(n % 2+"");
		}
	}
}
