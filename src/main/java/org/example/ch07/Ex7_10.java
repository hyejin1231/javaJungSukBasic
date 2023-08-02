package org.example.ch07;

/**
 * ch07. 인터페이스의선언, 상속, 구현
 * 인터페이스
 * - 추상 메서드의 집합
 * - 구현된 것이 전혀 없는 설계도, 껍데기 (모든 메서드가 public)
 *
 * 인터페이스 vs 추상 클래스
 * 추상 클래스는 추상 메서드를 가진 클래스라 생성자, iv 멤버변수를 가질 수 있지만
 * 인터페이스는 아무것도 구현된 것이 없는 클래스
 *
 * 인터페이스 조상은 인터페이스만 가능, Object 가 최고 조상이 아님 !!
 * 다중 상속이 가능하다. (추상 메서드는 충돌해도 문제가 없음)
 *
 * 인터페이스 구현
 * 인터페이스에 정의된 추상 메서드를 완성하는 것
 */
public interface Ex7_10 {
    // public static final 생략 가능 (항상 상수이기 때문에 생략 가능 !!)
    public static final int NUMBER = 100; // 변수, iv, cv 안되고 상수만 가능

    // public, abstract 생략 가능 -> 항상 인터페이스의 메서드는 public 이고 absctract 여서
    public abstract int printNumber(int number);
}
