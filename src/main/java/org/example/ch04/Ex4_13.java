package org.example.ch04;

/**
 * ch04. 중첩 for 문
 * 별찍기 예제2
 */
public class Ex4_13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
