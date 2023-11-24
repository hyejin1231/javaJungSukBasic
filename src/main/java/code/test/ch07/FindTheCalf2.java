package code.test.ch07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 송아지 찾기 1 - 강사님 풀이
 */
public class FindTheCalf2
{
	int[] dis = { 1, -1, 5 };
	int[] ch; // 한번 방문한 것은 Q에 넣지 않기 위해서
	
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e)
	{
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0; // root node level
		
		while (!Q.isEmpty())
		{
			int len = Q.size(); // level에 있는 원소의 개수
			
			for (int i = 0; i < len; i++)
			{
				int x = Q.poll();
				for (int j = 0; j < dis.length; j++)
				{
					int nx = x + dis[j]; // 자식 노드
					if (nx == e) return L + 1; // 현재 L은 부모 노드의 레벨이므로 nx의 레벨로 해주기 위해 +1 를 해준다.
					if (nx >= 1 && nx <= 10000 && ch[nx] == 0) { // 방문 x
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		
		return L;
	}
	
	public static void main(String[] args)
	{
		FindTheCalf2 findTheCalf2 = new FindTheCalf2();
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt(); // 현수의 위치
		int e = scanner.nextInt(); // 송아지의 위치
		
		int result = findTheCalf2.BFS(s, e);
		System.out.println(result);
	}
}
