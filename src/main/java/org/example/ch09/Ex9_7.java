package org.example.ch09;

/**
 * ch09. StringBuffer 클래스
 * : 문자열을 저장하고 다루기 위한 클래스
 * String 처럼 문자형 배열 char[] 을 내부적으로 가지고 있다.
 * String 과 다르게 내용을 변경할 수 있다. muutable
 * 배열의 길이는 변경 불가하다. 공간이 부족하면 새로운 배열을 생성해야 하고, StringBuufer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야 한다.
 * (버퍼의 크기를 지정하지 않으면 기본 크기는 16이다.)
 */
public class Ex9_7 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("abc");
        StringBuffer def = buffer.append("def"); // append 는 지정한 내용을 StringBuffer에 추가 후, StringBuffer 참조 반환


        System.out.println("buffer = " + buffer); // abcdef
        System.out.println("def = " + def); // abcdef

        // StringBuffer는 equals()를 오버라이딩 되어 있지 않고 주소 비교를 하기 때문에 String 으로 변환 후 비교해야 한다.
        StringBuffer stringBuffer1 = new StringBuffer("123");
        StringBuffer stringBuffer2 = new StringBuffer("123");

        System.out.println(stringBuffer1.equals(stringBuffer2)); // false

        String s1 = stringBuffer1.toString();
        String s2 = stringBuffer2.toString();
        System.out.println(s1.equals(s2)); // true

    }
}
