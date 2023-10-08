package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 문자열 압축
 *
 * 설명
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 *
 * 예시 입력 1
 * KKHSSSSSSSE
 *
 * 예시 출력 1
 * K2HS7E
 *
 * 예시 입력 2*
 * KSTTTSEEKFKKKDJJGG
 *
 * 예시 출력 2
 * KST3SE2KFK3DJ2G2
 */
public class StringCompression {
    public static void main(String[] args) {
        StringCompression stringCompression = new StringCompression();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = stringCompression.solution(input);

        System.out.print(result);

        System.out.println();
        String result2 = stringCompression.solution2(input);
        System.out.println("result2 = " + result2);
    }

    public String solution(String input) {
        String answer = "";
        char[] chars = input.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    sum++;
                } else {
                    break;
                }
            }
            answer += chars[i];
            if (sum != 1) {
                answer += sum;
            }
            i = i + sum - 1 ;
            sum = 0;
        }

        return answer;
    }

    public String solution2(String input) {
        String answer = "";
        input += " ";
        int cnt = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                cnt++;
            } else {
                answer += input.charAt(i);
                if (cnt > 1) {
                    answer += cnt;
                }
                cnt = 1;
            }
        }

        return answer;
    }
}
