package code.test.ch02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ch02. Array(1, 2차원 배열)
 * : 등수 구하기
 *
 * 설명
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 *
 * 입력
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 *
 * 출력
 * 입력된 순서대로 등수를 출력한다.
 *
 * 예시 입력 1
 * 5
 * 87 89 92 100 76
 *
 * 예시 출력 1
 * 4 3 2 1 5
 */
public class FindTheRatio {
    public static void main(String[] args) {
        FindTheRatio findTheRatio = new FindTheRatio();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int[] result = findTheRatio.solution(n, scores);
        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();
        int[] result2 = findTheRatio.solution2(n, scores);
        for (int i : result2) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(int n, int[] scores) {
        int[] answer = new int[n];
        int[] tmp = Arrays.copyOf(scores, n);
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if (scores[i] == tmp[j]) {
                    answer[i] = n - j;
                    break;
                }
            }
        }
        return answer;
    }

    public int[] solution2(int n, int[] scores) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int  cnt = 1;
            for (int j = 0; j < n; j++) {
                if (scores[j] > scores[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }
}
