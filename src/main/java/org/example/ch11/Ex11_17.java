package org.example.ch11;

import java.util.TreeSet;

/**
 * ch11. TreeSet (2) -> 범위 검색에 유리하다.
 */
public class Ex11_17 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i : score) {
            set.add(i);
        }

        // headSet() : 지정된 객체보다 작은 값의 객체들을 반환한다.
        System.out.println("set.headSet(50) = " + set.headSet(50)); // 50보다 작은 값

        // tailSet() : 지정된 객체보다 큰 값의 객체들을 반환한다.
        System.out.println("set.tailSet(50) = " + set.tailSet(50)); // 50보다 큰 값

        // subSet() : 범위 검색의 결과를 반환 (from ~ to)
        System.out.println("set.subSet(40, 80) = " + set.subSet(40, 80)); // 40 ~ 80 사이의 값
    }
}
