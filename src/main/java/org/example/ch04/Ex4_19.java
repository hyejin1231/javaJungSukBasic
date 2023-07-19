package org.example.ch04;

/**
 * ch04. 반복문 continue
 * : 자신이 포함된 반복뭉늬 끝으로 이동 -> 다음 반복으로 넘어감
 * 전체 반복 중에서 특정 조건시 반복을 건너뛸 대 유용하다.
 */
public class Ex4_19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
