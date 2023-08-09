package org.example.ch08;

/**
 * ch08. 멀티 catch 블럭
 * : 내용이 같은 catch 블럭을 하나로 합친 것 (jdk1.7부터)
 * 이때 하나의 예외에만 속한 예외 메서드를 호출하면 안된다 !! (그 외의 예외에는 해당 메서드가 없을 수 있기 때문이다.)
 */
public class Ex8_4 {
    public static void main(String[] args) {
        try {

//        } catch (ArithmeticException | Exception exception) { // compile error 부모 예외 클래스와 같이 사용하면 안된다.
        } catch (ArithmeticException | ClassCastException exception) {
            // ArithmeticException, ClassCastException 공통 메서드만 호출 가능
            exception.printStackTrace();

            if (exception instanceof ArithmeticException) {
                // 개별 메서드 호출하고 싶다면 형변환해서 사용하기
                ArithmeticException arithmeticException = (ArithmeticException) exception;
            }
        }
    }
}
