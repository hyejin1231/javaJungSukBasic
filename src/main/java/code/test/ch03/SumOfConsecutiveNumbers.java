package code.test.ch03;

import java.util.Scanner;

/**
 * ch03. Two Pointers, Sliding Window [효율성 : O(n^2) --> O(n)]
 * : 연속된 자연수의 합
 *
 * 설명
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 * 와 같이 총 3가지의 경우가 존재한다.
 *
 * 입력
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 *
 * 출력
 * 첫 줄에 총 경우수를 출력합니다.
 *
 * 예시 입력 1
 * 15
 *
 * 예시 출력 1
 * 3
 */
public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        SumOfConsecutiveNumbers sumOfConsecutiveNumbers = new SumOfConsecutiveNumbers();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = sumOfConsecutiveNumbers.solution(n);
        System.out.print(result);

        System.out.println();
        int result2 = sumOfConsecutiveNumbers.solution2(n);
        System.out.println("result2 = " + result2);

        int result3 = sumOfConsecutiveNumbers.solution3(n);
        System.out.println("result3 = " + result3);
    }

    public int solution(int n) {
        int answer = 0, sum;
        for (int i = 1; i <= n; i++) {
            sum = i;
            for (int j = i + 1; j <= n - i; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 0, sum =0;
        int lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];

                if (sum == n) {
                    answer++;
                }
            }
        }


        return answer;
    }

    // 수학적 방법으로 풀어보기
    public int solution3(int n) {
        int answer = 0, cnt = 1; // cnt는 연속된 수의 개수
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;
        }

        return answer;
    }
}
