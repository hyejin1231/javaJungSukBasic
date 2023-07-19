package org.example.ch04;

/**
 * ch04. 반복문 while
 * : 조건식을 만족하는 동안 {} 반복하는데, 반복 횟수를 모를 때 사용
 * for문과 while문은 서로 변경가능하다.
 */
public class Ex4_14 {
    public static void main(String[] args) {
        int i = 5;
        while (i-- != 0) {
            System.out.println(i + " - I can do it !! ");
        }
    }
}
