package code.test.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 그래프 최단거리 (BFS)
 *
 * 설명
 * 다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요.
 *
 * 입력 설명
 * 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다.
 * 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.
 *
 * 출력 설명
 * 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.
 *
 * 입력 예제 1
 * 6 9
 * 1 3
 * 1 4
 * 2 1
 * 2 5
 * 3 4
 * 4 5
 * 4 6
 * 6 2
 * 6 5
 *
 * 출력 예제 1
 * 2 : 3
 * 3 : 1
 * 4 : 1
 * 5 : 2
 * 6 : 2
 *
 */
public class GraphShortestDistance
{
	static int n, m = 0;
	static ArrayList<ArrayList<Integer>> graph;
	
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int v)
	{
		int L = 0; // root node level
		Q.offer(1);
		
		while (!Q.isEmpty())
		{
			int len = Q.size();
			for (int i = 0; i < len; i++)
			{
				int cur = Q.poll();
				if (cur == v) {
					return L;
				}else {
					for (int nv : graph.get(cur))
					{
						if (nv == v) {
							Q = new LinkedList<>();
							return L + 1;
						}
							Q.offer(nv);
					}
				}
			}
			L++;
		}
		
		return L;
	}
	
	public static void main(String[] args)
	{
		GraphShortestDistance graphShortestDistance = new GraphShortestDistance();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		graph = new ArrayList<>();
		
		for (int i = 0; i  <= n; i++)
		{
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			graph.get(a).add(b);
		}
		
		for (int i = 2; i<= n; i++)
		{
			int result = graphShortestDistance.BFS(i);
			System.out.println(i + " : " + result);
		}
	}
}
