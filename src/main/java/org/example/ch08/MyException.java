package org.example.ch08;

/**
 * ch08. 사용자 정의 예외 만들기, 예외 되던지기
 * 예외 되던지기
 * : 예외를 처리한 후에 다시 예외를 발생시키는 것
 */
public class MyException extends Exception{ // Exception, RuntimeException 중에 선택
    public MyException(String msg) { // 매개변수가 있는 생성자를 넣어줘야 함 !
        super(msg);
    }
}
