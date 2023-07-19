package org.example.ch04;

/**
 * ch04. 반복문 break
 * : 자신이 포함된 가장 가까운 반복문을 벗어난다.
 */
public class Ex4_18 {
    public static void main(String[] args) {
        int sum = 0, i  = 0;

        while (true) { // 무한 반복문 for(;;)
            if (sum > 100) {
                break; // 자신이 속한 하나의 반복문을 벗어난다.
            }
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
