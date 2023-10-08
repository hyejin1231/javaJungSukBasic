package code.test.ch01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ch02. Array(1, 2차원 배열)
 * : 큰 수 출력하기
 *
 * 설명
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 *
 * 입력
 * 첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
 *
 * 출력
 * 자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
 *
 * 예시 입력 1
 * 6
 * 7 3 9 5 6 12
 *
 * 예시 출력 1
 * 7 9 6 12
 */
public class PrintLargeNumber {
    public static void main(String[] args) {
        PrintLargeNumber printLargeNumber = new PrintLargeNumber();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Integer> input = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            input.add(scanner.nextInt());
        }

        ArrayList<Integer> result = printLargeNumber.solution(num, input);
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

        System.out.println();
        ArrayList<Integer> result2 = printLargeNumber.solution2(num, input);
        for (Integer integer : result2) {
            System.out.print(integer + " ");
        }
    }

    public ArrayList<Integer> solution(int num, ArrayList<Integer> input) {
        ArrayList<Integer> answer = new ArrayList<>();
        int nowInt = 0;

        for (Integer integer : input) {
            if (integer > nowInt) {
                answer.add(integer);
            }
            nowInt = integer;
        }

        return answer;
    }

    public ArrayList<Integer> solution2(int n, ArrayList<Integer> arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr.get(0));

        for (int i = 1; i < n; i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                answer.add(arr.get(i));
            }
        }

        return answer;
    }
}
