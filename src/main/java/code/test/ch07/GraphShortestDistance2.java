package code.test.ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 그래프 최단거리 (BFS) - 강사님 풀이 (배열 활용)
 */
public class GraphShortestDistance2
{
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v)
	{
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		
		while (!queue.isEmpty())
		{
			int cv = queue.poll();
			for (int nv : graph.get(cv))
			{
				if (ch[nv] == 0) { // 방문 안했는가 ?
					ch[nv] = 1;
					queue.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		GraphShortestDistance2 graphShortestDistance2 = new GraphShortestDistance2();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		graph = new ArrayList<>();
		
		for (int i = 0; i <= n; i++)
		{
			graph.add(new ArrayList<>());
		}
		ch = new int[n + 1];
		dis = new int[n + 1];
		
		for (int i = 0; i < m; i++)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			graph.get(a).add(b);
		}
		
		graphShortestDistance2.BFS(1);
		
		for (int i = 2; i<= n; i++)
		{
			System.out.println(i + " : " + dis[i]);
		}
		
	}
}
