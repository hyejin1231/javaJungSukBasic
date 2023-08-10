package org.example.ch08;

/**
 * ch08. 사용자 정의 예외 만들기, 예외 되던지기
 * 예외 되던지기
 * : 예외를 처리한 후에 다시 예외를 발생시키는 것
 * 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외 처리하는 것
 */
public class Ex8_8 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main 메서드에서 예외가 처리 됐습니다.");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1의 예외가 처리됐습니다.");
            throw e;
        }
    }
}
