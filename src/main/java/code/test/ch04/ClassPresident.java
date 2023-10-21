package code.test.ch04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ch04. HashMap, TreeSet (해쉬, 정렬지원 Set)
 * : 학급 회장
 *
 * 설명
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 *
 * 입력
 * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
 *
 * 출력
 * 학급 회장으로 선택된 기호를 출력합니다.
 *
 * 예시 입력 1
 * 15
 * BACBACCACCBDEDE
 *
 * 예시 출력 1
 * C
 */
public class ClassPresident {
    public static void main(String[] args) {
        ClassPresident classPresident = new ClassPresident();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = scanner.next();

        String answer = classPresident.solution(n, result);
        System.out.print(answer);

        System.out.println();
        char answer2 = classPresident.solution2(n, result);
        System.out.println("answer2 = " + answer2);
    }

    public String solution(int n, String result) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        String[] split = result.split("");
        for (String s : split) {
            Integer sum = map.getOrDefault(s, 1);
            map.put(s, sum + 1);
        }

        int max = Integer.MIN_VALUE;
        for (String s : map.keySet()) {
            Integer score = map.get(s);
            if (max < score) {
                answer = s;
                max = score;
            }
        }

        return answer;
    }

    public char solution2(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        // 추가로 HashMap 관련 메서드
        System.out.println("map.containsKey('A') = " + map.containsKey('A')); // true
        System.out.println("map.size() = " + map.size()); // 5
        System.out.println("map.remove('A') = " + map.remove('A')); // key A의 value 값 출력
        System.out.println("map.size() = " + map.size()); // 4

        return answer;
    }
}
