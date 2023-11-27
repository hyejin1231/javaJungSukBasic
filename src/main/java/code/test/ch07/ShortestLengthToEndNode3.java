package code.test.ch07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : Tree 말단 노드까지의 가장 짧은 경로 (BFS)
 *
 * 설명
 * 아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를
 * 구하는 프로그램을 작성하세요.
 *
 * 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를
 * 길이로 하겠습니다.
 *
 * 출력
 * 가장 짧은 길이는 3번 노느까지의 길이인 1이다.
 */
public class ShortestLengthToEndNode3
{
	Node root;
	
	public int BFS(Node root)
	{
		int L = 0;
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		
		while (!Q.isEmpty())
		{
			int len = Q.size();
			for (int i = 0; i < len; i++)
			{
				Node cur = Q.poll();
				if (cur.lt != null) {
					Q.offer(cur.lt);
				}else {
					return L;
				}
				
				if (cur.rt != null)
				{
					Q.offer(cur.rt);
				}else {
					return L;
				}
			}
			
			L++;
		}
		
		return L;
	}
	
	public static void main(String[] args)
	{
		ShortestLengthToEndNode3 tree = new ShortestLengthToEndNode3();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		int result = tree.BFS(tree.root);
		System.out.println(result);
	}
}
