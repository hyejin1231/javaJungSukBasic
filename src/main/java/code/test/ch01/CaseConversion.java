package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 대소문자 변환
 *설명
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 */
public class CaseConversion {
    public static void main(String[] args) {
        CaseConversion caseConversion = new CaseConversion();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = caseConversion.solution(input);
        String result2 = caseConversion.solution3(input);
        System.out.println(result);
        System.out.println(result2);
    }

    public String solution(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z') {
                result.append(Character.toUpperCase(aChar));
            }else {
                result.append(Character.toLowerCase(aChar));
            }
        }
        return result.toString();
    }

    public String solution2(String input) {
        StringBuilder answer = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }else {
                answer.append(Character.toLowerCase(c));
            }
        }
        return answer.toString();
    }

    public String solution3(String input) {
        StringBuilder answer = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c >= 97 && c <= 122) answer.append((char) (c - 32));
            else answer.append((char) (c + 32));
        }
        return answer.toString();
    }
}
