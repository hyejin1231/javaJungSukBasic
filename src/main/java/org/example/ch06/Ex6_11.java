package org.example.ch06;

/**
 * ch06. static 메서드와 인스턴스 메서드
 * : 메서드에 static을 붙일지 고민할 때는 iv(인스턴스 변수)를 사용하는가를 고려해보자.
 *
 * static 메서드
 * : 인스턴스 멤버 (iv, im) 사용 불가
 *
 * static 을 언제 붙일까?
 * : 속성 중에서 공통 속성에 static 을 붙인다.
 * : 인스턴스 멤버(iv, im) 을 사용하지 않는 메서드에 static을 붙인다.
 */
public class Ex6_11 {
    long a, b; // 인스턴스 변수
    static long c; // 클래스 변수

    long add() { // 인스턴스 메서드
        return a + b; // 인스턴스 변수
    }

    static long add(long a, long b) { // 클래스 메서드, static 메서드
        return a + b; // a, b 지역변수임
    }

    void instanceMethod() {
        System.out.println("a = " + a);
        System.out.println("c = " + c);
    }

    static void staticMethod() {
//        System.out.println("a = " + a); // static 메서드에서는 인스턴스 변수 사용 못함 -> 인스턴스 변수는 객체 생성 후 사용해야 하기 때문
        System.out.println("c = " + c);
    }

    static void staticMethod2() {
//        instanceMethod();  // 인스턴스 메서드 호출 불가능 (인스턴스 메서드도 객체 생성이 필요하기 때문)
        staticMethod(); // static 메서드는 호출 가능
    }

    public static void main(String[] args) {
        System.out.println(Ex6_11.add(200L, 100L)); // 클래스 메서드 호출 (객체 생성 x)
        Ex6_11 ex6_11 = new Ex6_11();
        ex6_11.a = 50L;
        ex6_11.b = 80L;

        System.out.println("ex6_11 = " + ex6_11.add()); // 인스턴스 메서드 호출
    }
}
