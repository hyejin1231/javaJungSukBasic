package code.test.ch07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초) : 경로 탐색 (인접리스트)
 */
public class RouteNavigation_list
{
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;

	public int DFS(int v) {

		if (v == n) {
			answer++;
		}else {
			for (int nv : graph.get(v)) {
				if (ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args)
	{
		RouteNavigation_list routeNavigationList = new RouteNavigation_list();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		graph = new ArrayList<>();
		for (int i = 0; i <= n; i++) { // get(5) 까지 하기 위해서 n까지 반복
			graph.add(new ArrayList<>()); // 정수를 저장하기 위한 Arraylist 객체 저장
		}
		ch = new int[n+1];

		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			graph.get(a).add(b);
		}

		ch[1] = 1;
		int result = routeNavigationList.DFS(1);
		System.out.println(result);
	}
}
