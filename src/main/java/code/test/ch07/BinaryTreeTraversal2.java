package code.test.ch07;

// 이진 트리 탐색 -> 전위, 중위, 후위 순위 연습
public class BinaryTreeTraversal2
{
	Node2 root;
	
	public void DFS(Node2 root)
	{
		if (root == null) {
			return;
		}else {
			System.out.print(root.data + " "); // 전위 순회
			DFS(root.lt);
//			System.out.print(root.data + " "); // 중위 순회
			DFS(root.rt);
//			System.out.print(root.data + " "); // 후위 순회
		}
	}
	public static void main(String[] args)
	{
		BinaryTreeTraversal2 tree = new BinaryTreeTraversal2();
		tree.root = new Node2(1); // 최상위 노드
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		
		tree.DFS(tree.root);
	}
}

class Node2 {
	int data;
	Node2 lt, rt;
	
	public Node2(int val)
	{
		data = val;
		lt = rt = null;
	}
}
