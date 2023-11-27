package code.test.ch07;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : Tree 말단 노드까지의 가장 짧은 경로 (DFS)
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
 *
 */
public class ShortestLengthToEndNode
{
	Node5 root;
	static int minLen = 1;
	
	// 사실 최단 거리는 BFS 로 푸는 게 맞지만, 지금 우리는 배우는 입장이기 때문에 DFS도 풀어보는 것임
	public int DFS(Node5 root, int len)
	{
		
		if (root.lt == null && root.rt == null) {
			if (minLen >= len) {
				minLen =  len;
			}
		}else {
			DFS(root.lt, len + 1);
			DFS(root.rt, len + 1);
		}
		
		return minLen;
	}
	
	public static void main(String[] args)
	{
		ShortestLengthToEndNode tree = new ShortestLengthToEndNode();
		tree.root = new Node5(1);
		tree.root.lt = new Node5(2);
		tree.root.rt = new Node5(3);
		tree.root.lt.lt = new Node5(4);
		tree.root.lt.rt = new Node5(5);
		
		int result = tree.DFS(tree.root, 0);
		System.out.println(result);
	}
}

class Node5 {
	int data;
	Node5 lt, rt;
	
	public Node5(int val)
	{
		data = val;
		lt = rt = null;
	}
}
