package org.example.ch08;

/**
 * ch08. 예외 선언하기, finally 블럭
 * 예외를 처리하는 방법
 * 1. try-catch문
 * 2. 예외 선언하기 -> 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
 * 3. 예외 덮기(은폐) -> catch 블럭에 아무것도 안넣는법
 */
public class Ex8_7 {
    public static void main(String[] args) throws Exception {
        method1(); // 예외처리를 하지 않아서 비정상 종료됨
    }

    static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception { // 예외 선언하기
        throw new Exception();
    }
}
