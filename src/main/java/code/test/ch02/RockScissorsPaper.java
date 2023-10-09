package code.test.ch02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ch02. Array(1, 2차원 배열)
 * : 가위 바위 보
 *
 * 설명
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 *
 * 예시 입력 1
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 *
 * 예시 출력 1
 * A
 * B
 * A
 * B
 * D
 */
public class RockScissorsPaper {
    public static void main(String[] args) {
        RockScissorsPaper rockScissorsPaper = new RockScissorsPaper();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] A = new int[num];
        int[] B = new int[num];

        for (int i = 0; i < num; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            B[i] = scanner.nextInt();
        }

        ArrayList<String> result = rockScissorsPaper.solution(num, A, B);
        for (String integer : result) {
            System.out.println(integer);
        }

        System.out.println("result2");
        String result2 = rockScissorsPaper.solution2(num, A, B);
        for (char c : result2.toCharArray()) {
            System.out.println(c);
        }
    }

    public ArrayList<String> solution(int num, int[] A, int[] B) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < num; i++) {
                if (A[i] == 1) { // 1 : 가위
                    if (B[i] == 1) {
                        answer.add("D");
                    } else if (B[i] == 2) {
                        answer.add("B");
                    } else {
                        answer.add("A");
                    }
                } else if (A[i] == 2) { // 2: 바위
                    if (B[i] == 1) {
                        answer.add("A");
                    } else if (B[i] == 2) {
                        answer.add("D");
                    }else {
                        answer.add("B");
                    }
                } else if (A[i] == 3) { // 3: 보
                    if (B[i] == 1) {
                        answer.add("B");
                    } else if (B[i] == 2) {
                        answer.add("A");
                    }else {
                        answer.add("D");
                    }
                }
            }

        return answer;
    }

    public String solution2(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if(a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }

        return answer;
    }
}
