package org.example.ch04;

/**
 * ch04. 이름붙은 반복문
 * 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다.
 */
public class Ex4_21 {
    public static void main(String[] args) {
        Loop1 :
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) {
                    break Loop1;
//                     break; // 안쪽 for문만 빠져나온다.
                }
                System.out.println(i + "*" + j + "= " + (i * j));
            }
            System.out.println();
        }
    }
}
