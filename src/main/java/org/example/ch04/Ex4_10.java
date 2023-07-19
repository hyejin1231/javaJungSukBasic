package org.example.ch04;

/**
 * ch04. for문 예제
 */
public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum); // 1 + 2 + 3 + 4 + 5
    }
}
