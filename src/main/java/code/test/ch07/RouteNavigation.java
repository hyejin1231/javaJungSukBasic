package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초) : 경로 탐색 (인접행렬)
 *
 * 설명 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요. 아래 그래프에서 1번
 * 정점에서 5번 정점으로 가는 가지 수는 1 2 3 4 5 1 2 5 1 3 4 2 5 1 3 4 5 1 4 2 5 1 4 5 총 6
 * 가지입니다.
 *
 * 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
 *
 * 입력 설명 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 *
 * 출력 설명 총 가지수를 출력한다.
 *
 * 입력 예제 1 5 9 1 2 1 3 1 4 2 1 2 3 2 5 3 4 4 2 4 5
 *
 * 출력 예제 1 6
 */
public class RouteNavigation
{
	static int n, m, cnt = 0;
	static int[][] graph;
	static int[] ch;
	
	public int DFS(int v)
	{
		if (v == n) {
			cnt++;
		}else {
			for (int i = 1; i <= n; i++)
			{
				if (graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0; // 빽한 시점에서는 0으로 바꿔줘야 함
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args)
	{
		RouteNavigation routeNavigation = new RouteNavigation();
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
		int result = routeNavigation.DFS(1);
		System.out.println(result);
		
	}
}
