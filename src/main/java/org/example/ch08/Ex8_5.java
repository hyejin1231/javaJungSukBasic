package org.example.ch08;

/**
 * ch08. 예외 발생시키기
 */
public class Ex8_5 {
    public static void main(String[] args) {
        try {
            // 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
            Exception exception = new Exception();

            // 2. 키워드 throw 를 이용해서 예외를 발생시킨다.
            throw exception;
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램이 정상적으로 종료됐음!!");

    }
}
