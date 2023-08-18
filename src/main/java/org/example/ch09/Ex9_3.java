package org.example.ch09;

/**
 * ch09. String 클래스, 문자열 비교, 빈 문자열
 * String 클래스 = 데이터 (char[]) + 메서드 (문자열 관련)
 * 내용을 변경할 수 없는 불변 클래스 immutable -> 덧셈 연산자를 이용한 문자열 결합은 성능이 떨어짐
 * 따라서 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용하는게 좋다.
 *
 * 문자열 리터럴은 프로그램 실행 시 자동으로 생성된다. (constant pool 에 저장) -> 따라서 같은 내용의 문자열 리터럴은 하나만 만들어진다.
 */
public class Ex9_3 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "efg";

         a = a + b; // 새로운 문자열이 만들어짐

        String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1 에 저장됨
        String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2 에 저장됨

        String str3 = new String("abc"); // 새로운 String 인스턴스 생성
        String str4 = new String("abc"); // 새로운 String 인스턴스 생성

        System.out.println("(str1 == str2) = " + (str1 == str2)); // true
        System.out.println("(str3 == str4) = " + (str3 == str4));  // false
        System.out.println("str3.equals(str4) = " + str3.equals(str4)); // true

    }
}
