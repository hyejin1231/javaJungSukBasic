package org.example.ch06;

/**
 * ch06. 변수의 초기화, 멤버변수 초기화
 * 클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번
 * 인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
 *
 * 클래스 변수 먼저 초기화되고 인스턴스 변수가 다음에 초기화된다.
 * 초기화 순서 : 자동 -> 간단 -> 복잡
 */
public class Ex6_15 {
    static int[] arr = new int[10]; // 명시적 초기화, 간단 초기화
    int iv = 10; // 명시적 초기화, 간단 초기화

    static { // cv 복잡 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }
    }

    Ex6_15() { // 생성자, 복잡 초기화
        iv = 3;
    }
}
