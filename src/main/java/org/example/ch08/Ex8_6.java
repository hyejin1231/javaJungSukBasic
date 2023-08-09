package org.example.ch08;

/**
 * ch08.checked 예외, unchecked 예외
 * checked 예외 : 컴파일러가 예외 처리 여부를 체크 (예외 처리 필수) -> Exception 클래스들
 * unchecked 예외 : 컴파일러가 예외 처리 여부를 체크 하지 않음 (예외 처리 선택) -> RuntimeException 클래스들
 */
public class Ex8_6 {
    public static void main(String[] args) {

        try {
            // checked 예외 : 컴파일러가 예외 처리 여부를 체크 , try-catch 필수
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // unchecked 예외 : 컴파일러가 예외 처리 여부를 체크하지 않음
        throw new RuntimeException();
    }
}
