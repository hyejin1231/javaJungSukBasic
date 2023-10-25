package code.test.ch04;

import java.util.*;
import java.util.stream.Collectors;

/**
 * ch04. HashMap, TreeSet (해쉬, 정렬지원 Set)
 * : K번째 큰 수
 *
 * 설명
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 *
 * 출력
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 *
 * 예시 입력 1
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 *
 * 예시 출력 1
 * 143
 */
public class KstLargestNumber {
    public static void main(String[] args) {
        KstLargestNumber kstLargestNumber = new KstLargestNumber();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = kstLargestNumber.solution(n, k, arr);
        System.out.print(result);

        System.out.println();
        int result2 = kstLargestNumber.solution2(arr, n, k);
        System.out.println("result2 = " + result2);

        System.out.println();
        kstLargestNumber.solution3(arr, n, k);
    }

    public int solution(int n, int k, int[] arr) {
        int answer;
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int x = j + 1; x < n; x++) {
                    set.add(arr[i] + arr[j] + arr[x]);
                }
            }
        }
        if (set.size() < k) {
            return -1;
        }

        answer =  set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(k - 1);

        return answer;
    }

    public int solution2(int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (Integer integer : treeSet) {
            cnt++;
            if (cnt == k) return integer;
        }

        return answer;
    }

    public void solution3(int[] arr, int n, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        System.out.println("treeSet.size() = " + treeSet.size());
        treeSet.remove(143);
        System.out.println("treeSet.size() = " + treeSet.size());
        System.out.println("treeSet = " + treeSet);
        System.out.println("treeSet.first() = " + treeSet.first()); // 제일 앞의 수를 출력
        System.out.println("treeSet.last() = " + treeSet.last()); // 제일 마지막의 수를 출력
    }
}
