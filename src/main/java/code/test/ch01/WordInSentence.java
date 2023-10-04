package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 문장 속 단어
 *
 * 설명
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
 * 단어를 답으로 합니다.
 *
 * 예시 입력 1
 * it is time to study
 *
 * 예시 출력 1
 * study
 */
public class WordInSentence {
    public static void main(String[] args) {
        WordInSentence wordInSentence = new WordInSentence();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String result = wordInSentence.solution(input);
        String result2 = wordInSentence.solution2(input);
        String result3 = wordInSentence.solution3(input);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    public String solution(String input) {
        String answer = "";
        String[] split = input.split(" ");

        for (String word : split) {
            if (word.length() > answer.length()) {
                answer = word;
            }
        }

        return answer;
    }

    // split 사용
    public String solution2(String input) {
        String answer = "";
        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        String[] s = input.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    // indexOf, subString 사용
    public String solution3(String input) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = input.indexOf(' ')) != -1) {
            String tmp = input.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            input = input.substring(pos + 1);
        }
        if (input.length() > m ) answer = input; // 마지막 단어 처리 해줘야 함 !!

        return answer;
    }
}
