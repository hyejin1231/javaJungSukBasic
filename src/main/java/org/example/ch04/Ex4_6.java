package org.example.ch04;

import java.util.Scanner;

/**
 * ch04. switch문
 * : 처리해야하는 경우의 수가 많을 때 유용한 조건문
 * swithc문의 조건식은 결과값이 반드시 정수 or 상수 or 문자열이어야 하고, 중복되지 않아야 한다.
 *
 */
public class Ex4_6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break; // break 문 작성하는거 까먹지 말기 !
            case 6: case 7:
            case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }
}
