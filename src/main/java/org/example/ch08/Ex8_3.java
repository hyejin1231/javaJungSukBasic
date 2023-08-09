package org.example.ch08;

/**
 * ch08. printStackTrace() 와 getMessage()
 * printStackTrace()
 * : 예외 발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
 *
 * getMessage()
 * : 발생한 예외 클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
 */
public class Ex8_3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) { // 참조변수 e를 통해서 생성된 ArithmeticException 인스턴스에 접근할 수 있다.
            e.printStackTrace();
            System.out.println("예외 메시지 : " + e.getMessage());
        }

        System.out.println(5);
    }
}
