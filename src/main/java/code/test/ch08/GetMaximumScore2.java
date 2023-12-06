package code.test.ch08;

import java.util.Scanner;

/**
 * ch08. DFS, BFS 활용
 * : 최대 점수 구하기 DFS
 */
public class GetMaximumScore2 {
    static int answer = Integer.MIN_VALUE, n, m;
    boolean flag = false;

    // ps : score, pt : time
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        }else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt); // 문제를 풀 때
            DFS(L + 1, sum, time, ps, pt); // 문제를 풀지 않을 때
        }
    }

    public static void main(String[] args) {
        GetMaximumScore2 getMaximumScore2 = new GetMaximumScore2();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        getMaximumScore2.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
