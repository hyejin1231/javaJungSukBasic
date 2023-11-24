package code.test.ch07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 송아지 찾기 1 (BFS : 상대트리탐색)
 *
 * 설명
 * 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
 * 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
 * 송아지는 움직이지 않고 제자리에 있다.
 * 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
 * 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
 *
 * 출력
 * 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재합니다.
 *
 * 예시 입력 1
 * 5 14
 *
 * 예시 출력 1
 * 3
 *
 */
public class FindTheCalf
{
	static int[] ch; // 갔던 좌표인지 확인하기 위한 배열
	static int[] jump = { -1, 1, 5 }; // jump -1, 1, 5
	
	public int  BFS(int s, int e) // L 은 현재 위치
	{
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		int L = 1; // 점프 횟수
		Q.offer(s);
		
		while (!Q.isEmpty())
		{
			int len = Q.size();
			for (int j = 0; j < len; j++)
			{
				Integer cur = Q.poll();
				for (int i = 0; i < jump.length; i++)
				{
					if (cur + jump[i] > 0)
					{
						if(cur + jump[i] == e)
						{
							return L;
						}
						else if (ch[cur + jump[i]] == 0)
						{
							Q.offer(cur + jump[i]);
							ch[cur + jump[i]] = 1;
						}
					}
				}
			}
			L++; // 한 번 더 점프
		}
		
		return L;
	}
	
	public static void main(String[] args)
	{
		FindTheCalf findTheCalf = new FindTheCalf();
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt(); // 현수의 위치
		int e = scanner.nextInt(); // 송아지의 위치
		ch = new int[10000];
		
		int result = findTheCalf.BFS(s, e);
		System.out.println(result);
	}
}
