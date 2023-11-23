package code.test.ch07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 이진트리 순회 (넓이우선탐색 : 레벨 탐색) BFS : Breadth-First Search
 *
 * 설명
 * 아래 그림과 같은 이진트리를 레벨탐색 연습해보세요.
 *
 *
 * 출력 예제 1
 * 레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
 *
 */
public class BinaryTreeTraversal_width
{
	Node3 root;
	
	public void BFS(Node3 root)
	{
		Queue<Node3> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty())
		{
			int len = Q.size(); // Queue의 원소 개수
			System.out.print(L + " : " );
			for (int i = 0; i < len; i++)
			{
				Node3 cur = Q.poll();
				System.out.print(cur.data + " ");
				if (cur.lt != null) Q.offer(cur.lt);
				if (cur.rt != null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		BinaryTreeTraversal_width tree = new BinaryTreeTraversal_width();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		tree.root.rt.lt = new Node3(6);
		tree.root.rt.rt = new Node3(7);
		tree.BFS(tree.root);
	}
}

class Node3 {
	int data;
	Node3 lt, rt;
	
	public Node3(int val)
	{
		data = val;
		lt = rt = null;
	}
}

