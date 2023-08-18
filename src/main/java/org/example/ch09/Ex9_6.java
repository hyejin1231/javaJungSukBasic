package org.example.ch09;

/**
 * ch09. StringJoiner, 문자열과 기본형 반환
 * join() : 여러 문자열 사이에 구분자를 넣어 결합한다.
 */
public class Ex9_6 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] split = animals.split(",");
        String join = String.join("-", split);
        System.out.println("join = " + join);

        System.out.println();
        System.out.println("숫자를 문자열로 바꾸는 방법");
        int i = 100;
        String s = i + "";
        String s1 = String.valueOf(i); // 이 방법이 조금 더 빠르다고 함

        System.out.println();
        System.out.println("문자열을 숫자로 변경하는 방법");
        int i1 = Integer.parseInt("100");
        Integer integer = Integer.valueOf("100");
    }
}
