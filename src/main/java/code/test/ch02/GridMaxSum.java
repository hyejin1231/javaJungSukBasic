package code.test.ch02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ch02. Array(1, 2차원 배열)
 * : 격자판 최대합
 *
 * 설명
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력
 * 최대합을 출력합니다.
 *
 * 예시 입력 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 *
 * 예시 출력 1
 * 155
 */
public class GridMaxSum {
    public static void main(String[] args) {
        GridMaxSum gridMaxSum = new GridMaxSum();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = scanner.nextInt();
            }
        }

        int result = gridMaxSum.solution(n, num);
        System.out.print(result);

        System.out.println();
        int result2 = gridMaxSum.solution2(n, num);
        System.out.println("result2 = " + result2);
    }

    public int solution(int n, int[][] num) {
        ArrayList<Integer> tmp = new ArrayList<>();

        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            int sum2 = 0;
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
                sum2 += num[j][i];
            }
            sum3 += num[i][i];
            sum4 += num[i][n-1 - i];
            tmp.add(sum);
            tmp.add(sum2);
            tmp.add(sum3);
            tmp.add(sum4);
        }

        return tmp.stream().max(Integer::compareTo).get();
    }

    public int solution2(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;  // sum1 행의 합, sum2 열의 합
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
