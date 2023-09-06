package org.example.ch11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static java.util.Collections.*;

/**
 * ch11. Collecions 클래스, 컬렉션 클래스 요약
 * : 컬렉션을 위한 메서드 static 제공
 */
public class Ex11_21 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println("list = " + list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println("list = " + list); // list = [1, 2, 3, 4, 5]

        rotate(list, 2); // 오른쪽으로 두 칸씩 이동, 반 시계 방향으로 두번 회전
        System.out.println("list = " + list); // list = [4, 5, 1, 2, 3]

        swap(list, 0, 2); // 1번째와 3번째를 교환
        System.out.println("list = " + list); // list = [1, 5, 4, 2, 3]

        shuffle(list); // 저장된 요소의 위치를 임의로 변경
        System.out.println("list = " + list);  // list = [1, 4, 3, 5, 2]

        sort(list, reverseOrder()); // 역순 정렬
        System.out.println("list = " + list);  // list = [5, 4, 3, 2, 1]

        sort(list); // 오름차순 정렬
        System.out.println("list = " + list); // list = [1, 2, 3, 4, 5]

        int index = binarySearch(list, 3);
        System.out.println("index = " + index); // 2

        System.out.println("max(list) = " + max(list)); // 5
        System.out.println("min(list) = " + min(list)); // 1

        fill(list, 9);
        System.out.println("list = " + list); // list = [9, 9, 9, 9, 9]

        List<Integer> newList = nCopies(list.size(), 2); // list와 같은 크기의 새로운 list 만들고 2로 채운다.
        System.out.println("newList = " + newList);  // newList = [2, 2, 2, 2, 2]

        // 공통 요소가 없으면 true 있으면 false 반환
        System.out.println("disjoint(list, newList) = " + disjoint(list, newList)); // true

        copy(list, newList); // newList의 값을 list 로 복사
        System.out.println("list = " + list); // list = [2, 2, 2, 2, 2]

        replaceAll(list, 2, 1);
        System.out.println("list = " + list); // list = [1, 1, 1, 1, 1]

        Enumeration enumeration = enumeration(list); // enumeration 은 iterator 구버전
        ArrayList list2 = list(enumeration);
        System.out.println("list2 = " + list2); // list2 = [1, 1, 1, 1, 1]

    }
}
