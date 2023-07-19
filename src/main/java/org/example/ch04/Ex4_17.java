package org.example.ch04;

import java.util.Scanner;

/**
 * ch04. 반복문 do-while문
 * 블록{} 을 최소한 한 번 이상 반복 : 사용자의 입력을 받을 때 유용하다.
 * do {
 *
 * }while(조건식);
 */
public class Ex4_17 {
    public static void main(String[] args) {
        int input = 0, answer = 0;
        answer = (int) (Math.random() * 100) + 1; // 1 ~ 100 사이
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100 사이의 정수를 입력하세요. > ");
            input = scanner.nextInt();

            if (input > answer) {
                System.out.println("더 적은 수로 다시 시도해보세요");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }

        } while (input != answer);

        System.out.println("정답입니다!!");
    }
}
