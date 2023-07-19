package org.example.ch04;

/**
 * ch04. 반복문 while 예제
 */
public class Ex4_15 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.printf("%d - %d %n", i, sum);
            sum += ++i;
        }
    }
}
