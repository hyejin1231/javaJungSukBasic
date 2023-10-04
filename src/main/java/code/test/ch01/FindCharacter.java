package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 문자 찾기
 * 설명
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 *
 *
 * 입력
 * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 *
 */
public class FindCharacter {

    public static void main(String[] args) {
        FindCharacter findCharacter = new FindCharacter();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char inputChar = scanner.next().charAt(0);

        int result = findCharacter.solution(inputString, inputChar);
        System.out.println(result);
    }


    public int solution(String input, char character) {
        int result = 0;
        char[] chars = input.toLowerCase().toCharArray();
        character = Character.toLowerCase(character);
        for (char aChar : chars) {
            if (aChar == character) result ++;
        }
        return result;
    }

    public int solution2(String input, char character) {
        int answer = 0;
        input = input.toUpperCase();
        character = Character.toLowerCase(character);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) answer++;
        }
        return answer;
    }
}
