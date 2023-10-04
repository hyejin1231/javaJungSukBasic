package code.test.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 단어 뒤집기
 *
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 * 예시 입력 1
 * 3
 * good
 * Time
 * Big
 *
 * 예시 출력 1
 * doog
 * emiT
 * giB
 */
public class FilpWords {
    public static void main(String[] args) {
        FilpWords filpWords = new FilpWords();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] input = new String[length];
        for (int i = 0; i < length; i++) {
            input[i] =scanner.next();
        }

        System.out.println("solution1");
        String[] result = filpWords.solution(input);
        for (String s : result) {
            System.out.println(s);
        }

        System.out.println("solution2");
        ArrayList<String> result2 = filpWords.solution2(length, input);
        for (String s : result2) {
            System.out.println(s);
        }

        System.out.println("solution3");
        ArrayList<String> result3 = filpWords.solution2(length, input);
        for (String s : result3) {
            System.out.println(s);
        }
    }

    public String[] solution(String[] input) {
        String[] answer = new String[input.length];
        Arrays.fill(answer, "");
        for (int i = 0; i < input.length; i++) {
            String[] s = input[i].split("");
            for (int j = s.length - 1; j >= 0; j--) {
                answer[i] += s[j];
            }
        }
        return answer;
    }

    // StringBuilder 이용
    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    // lt, rt 사용
    public ArrayList<String> solution3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt ++;
                rt--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }
        return answer;
    }
}
