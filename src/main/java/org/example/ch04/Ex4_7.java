package org.example.ch04;

/**
 * ch04. Math.random() 임의의 정수 만들기
 */
public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0;

        // 괄호{} 안의 내용을 20번 반복한다.
        for (int i = 1; i <= 20; i++) {
//            System.out.print(Math.random() + " "); // 0.0 <= x < 1.0
//            System.out.print((int)(Math.random() * 10) +1 + " "); // 1 ~ 10 사이의 난수 20개 출력
            System.out.print((int)(Math.random() * 11) -5 + " "); // -5 ~ 5 사이의 난수 20개 출력
        }
    }
}
