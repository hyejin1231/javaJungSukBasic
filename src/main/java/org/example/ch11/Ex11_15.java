package org.example.ch11;

import java.util.Set;
import java.util.TreeSet;

/**
 * ch11. TreeSet (1) ~ (2)
 * : 이진 탐색 트리 (binary search tree) 로 구현, 범위 탐색과 정렬에 유리
 * 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
 * 각 요소 node 가 나무 tree 형태로 연결 (LinkedList 의 변형)
 *-> HashSet은 add 할 때 equals(), hashCode() 비교하고, TreeSet은 compare() 호출해서 비교한다.
 *
 * 이진 탐색 트리 binary search tree
 * : 부모보다 작은 값은 왼쪽, 큰 값은 오른쪽
 * 데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림 (비교 횟수 증가)
 */
public class Ex11_15 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println("set = " + set); // TreeSet 은 정렬 필요 없음
    }
}
