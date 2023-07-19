package org.example.ch04;

import java.util.Scanner;

/**
 * ch04. continue, break 예제
 */
public class Ex4_20 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square ");
            System.out.println("(2) square root ");
            System.out.println("(3) log");
            System.out.print(" 원하는 메뉴 (1~3) 을 선택하세요, (종료 : 0) >");

            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3) ){
                System.out.println("메뉴를 잘못선택하셨습니다.");
                continue;
            }
            System.out.println("선택하신 메뉴는 " + menu + "입니다.");
        }
    }
}
