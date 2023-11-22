package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 부분집합 구하기 (DFS)
 *
 * 설명
 * 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 *
 * 입력 설명
 * 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 *
 * 출력 설명
 * 첫 번째 줄부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
 * 단 공집합은 출력하지 않습니다.
 *
 * 입력 예제 1
 * 3
 *
 * 출력 예제 1
 * 1 2 3
 * 1 2
 * 1 3
 * 1
 * 2 3
 * 2
 * 3
 *
 */
public class FindingASubset
{
	static int n; // 집합 원소의 개수
	static int[] ch; // 부분집합으로 사용한다, 하지 않는다 체크하기 위해서
	
	public void DFS(int L)
	{
		if (L == n + 1) {
			for (int i = 0; i < ch.length; i++)
			{
				if (ch[i] != 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}else {
			ch[L] = 1;
			DFS(L + 1); // 트리의 왼쪽 (사용한다)
			ch[L] = 0;
			DFS(L + 1); // 트리의 오른쪽 (사용하지 않는다.)
		}
	}
	public static void main(String[] args)
	{
		FindingASubset findingASubset = new FindingASubset();
		Scanner scanner = new Scanner(System.in);
		int L = scanner.nextInt();
		n = L;
		ch = new int[n + 1];
		findingASubset.DFS(1);
	}
}
