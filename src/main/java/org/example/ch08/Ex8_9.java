package org.example.ch08;

/**
 * ch08. finally 블럭
 * : 예외 발생 여부와 관계없이 수행되어야 하는 코드를 넣는다.
 */
public class Ex8_9 {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {

        }finally {
            // 예외의 발생 여부와 관계없이 항상 수행되어야 하는 문장들을 넣는다.
            // try-catch 문의 맨 마지막에 위치해야 한다.
        }
    }
}
