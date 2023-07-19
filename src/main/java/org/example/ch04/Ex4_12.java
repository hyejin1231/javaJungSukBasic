package org.example.ch04;

/**
 * ch04. 중첩 for 문
 * 별찍기 예제
 */
public class Ex4_12 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
