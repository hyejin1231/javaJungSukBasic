package code.test.ch07;

/**
 * Tree 말단노드까지의 가장 짧은 경로 DFS
 */
public class ShortestLengthToEndNode2
{
	Node root;
	
	public int DFS(int L, Node root)
	{
		if (root.lt == null && root.rt == null) { // 말단 node이라면 ?
			return L;
		}else
		{
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt)); // 자식 node가 하나만 있으면 에러난다.
		}
	}
	public static void main(String[] args)
	{
		ShortestLengthToEndNode2 tree = new ShortestLengthToEndNode2();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		int result = tree.DFS(0, tree.root);
		System.out.println(result);
	}
}
