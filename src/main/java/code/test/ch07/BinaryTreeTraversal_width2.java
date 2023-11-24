package code.test.ch07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 이진 트리 순회 _ BFS(Breadth-First Search) 너비 우선 탐색 연습
 */
public class BinaryTreeTraversal_width2
{
	Node4 root;
	
	public void DFS(Node4 root)
	{
		Queue<Node4> Q = new LinkedList<>();
		int L = 0;
		Q.offer(root);
		
		while (!Q.isEmpty())
		{
			int len = Q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++)
			{
				Node4 cur = Q.poll();
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
		BinaryTreeTraversal_width2 tree = new BinaryTreeTraversal_width2();
		tree.root = new Node4(1);
		tree.root.lt = new Node4(2);
		tree.root.rt = new Node4(3);
		tree.root.lt.lt = new Node4(4);
		tree.root.lt.rt = new Node4(5);
		tree.root.rt.lt = new Node4(6);
		tree.root.rt.rt = new Node4(7);
		tree.DFS(tree.root);
	}
}

class Node4 {
	int data;
	Node4 lt, rt;
	
	public Node4(int val)
	{
		data = val;
		lt = rt = null;
	}
}
