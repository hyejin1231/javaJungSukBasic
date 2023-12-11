package code.test.ch08;

import java.util.Scanner;

/**
 * ch08. DFS, BFS 활용
 * : 중복순열 구하기
 */
public class FindingDuplicatePermutations2
{
	static int[] pm;
	static int n, m;
	
	public void DFS(int L)
	{
		if (L == m) {
			for (int i : pm)
			{
				System.out.print(i + " ");
			}
				System.out.println();
		}else {
			for (int i = 1; i <= n; i ++ )
			{
				pm[L] = i;
				DFS(L + 1);
			}
		}
	}
	public static void main(String[] args)
	{
		FindingDuplicatePermutations2 findingDuplicatePermutations2 = new FindingDuplicatePermutations2();
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		pm = new int[m];
		
		findingDuplicatePermutations2.DFS(0);
	}
}
