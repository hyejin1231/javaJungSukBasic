package org.example.ch04;

/**
 * ch04. 중첩 for 문
 * : for 문 내에 또 다른 for 문을 포함시킬 수 있다.
 */
public class Ex4_11 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));

            }
            System.out.println();
        }
    }
}
