package code.test.ch07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Tree 말단 노드까지의 가장 짧은 경로 (BFS)
 */
public class ShortestLengthToEndNode4
{
	
	Node root;
	
	public int BFS(Node root)
	{
		Queue<Node> Q = new LinkedList<>();
		int L = 0;
		Q.offer(root);
		
		while (!Q.isEmpty())
		{
			int len = Q.size();
			for (int i = 0; i < len; i++)
			{
				Node cur = Q.poll();
				if (cur.lt == null && cur.rt == null) return L;
				if (cur.lt != null) Q.offer(cur.lt);
				if (cur.rt != null) Q.offer(cur.rt);
			}
			L++;
		}
		
		return L;
		
	}
	
	public static void main(String[] args)
	{
		ShortestLengthToEndNode4 tree = new ShortestLengthToEndNode4();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		int result = tree.BFS(tree.root);
		System.out.println(result);
		
	}
}
