package code.test.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ch03. Two Pointers, Sliding Window [효율성 : O(n^2) --> O(n)]
 * : 공통 원소 구하기
 *
 * 설명
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 *
 * 출력
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 *
 * 예시 입력 1
 * 5
 * 1 3 9 5 2
 * 5
 * 3 2 5 7 8
 *
 * 예시 출력 1
 * 2 3 5
 */
public class CommonElements {
    public static void main(String[] args) {
        CommonElements commonElements = new CommonElements();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        ArrayList<Integer> result = commonElements.solution(n, A, m, B);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

        System.out.println();
        ArrayList<Integer> result2 = commonElements.solution3(n, m, A, B);
        System.out.println("result2 = " + result2);
    }

    public ArrayList<Integer> solution(int n, int[] A, int m, int[] B) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (A[p1] == B[p2]) {
                result.add(A[p1++]);
                p2++;
            } else if (A[p1] < B[p2]) {
                p1++;
            }else {
                p2++;
            }
        }

        return result;
    }

    // time limit..
    public ArrayList<Integer> solution2(int n, int[] A, int m, int[] B) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i : A) {
            for (int i1 : B) {
                if (i == i1){
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }

    public ArrayList<Integer> solution3(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            }else {
                p2++;
            }
        }

        return answer;
    }
}
