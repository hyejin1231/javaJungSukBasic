package code.test.ch07;

import java.util.Scanner;

/**
 * ch07.섹션 7. Recursive, Tree, Graph(DFS, BFS 기초)
 * : 팩토리얼
 *
 * 설명
 * 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.
 * 예를 들어 5! = 5*4*3*2*1=120입니다.
 *
 * 입력 설명
 * 첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.
 *
 * 출력 설명
 * 첫 번째 줄에 N팩토리얼 값을 출력합니다.
 *
 * 입력 예제 1
 * 5
 *
 * 출력 예제 1
 * 120
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = factorial.DFS(n);
        System.out.println(result);

    }

    public int DFS(int n) {
        if (n != 1) {
            return n * DFS(n - 1);
        }else {
            return 1;
        }
    }
}
