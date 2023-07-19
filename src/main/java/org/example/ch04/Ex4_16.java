package org.example.ch04;

import java.util.Scanner;

/**
 * ch04. 반복문 while 예제2. 각자리수의 합
 */
public class Ex4_16 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요. (예: 12345) > ") ;
        Scanner scanner = new Scanner(System.in);
         num = scanner.nextInt();

        while (num != 0) {
            sum += num % 10;

            num /= 10;
        }
        System.out.println("각 자리수의 합 : " + sum);
    }
}
