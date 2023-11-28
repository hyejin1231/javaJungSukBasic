package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초) : 경로 탐색 (인접행렬)
 */
public class RouteNavigation2
{
	static int n, m, cnt = 0;
	static int[] ch ;
	static int[][] graph;
	
	public int DFS(int val)
	{
		if (val == n) { // 정점 노드
			cnt++; // 정점 노드까지 왔으면 +1 해줘야 함
		}else {
			for (int i = 1; i <= n; i++)
			{
				if (graph[val][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args)
	{
		RouteNavigation2 routeNavigation2 = new RouteNavigation2();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		graph = new int[n + 1][n + 1];
		ch = new int[n + 1];
		
		for (int i = 0; i < m; i++)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			graph[a][b] = 1;
		}
		
		ch[1] = 1;
		int result = routeNavigation2.DFS(1);
		System.out.println(result);
		
	}
}
