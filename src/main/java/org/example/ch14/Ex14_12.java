package org.example.ch14;

import java.util.Optional;

/**
 * ch14. Optional
 * -> null을 직접 다루는 것은 위험하기 때문에 -> 간접적으로 null 다루기 위해 Optional 사용 !
 * -> NPE 발생 줄어들고, 널 체크 안해도 됨 !
 */
public class Ex14_12 {
    public static void main(String[] args) {
        // Optional<T> 객체를 생성하는 다양한 방법
        String str = "abc";
        Optional<String> optVal = Optional.of(str);
        Optional<String> optVal1 = Optional.of("abc");
//        Optional<Object> optVal2 = Optional.of(null); // NPE 발생 !
        Optional<Object> optVal3 = Optional.ofNullable(null); // ok

        // null 대신 빈 Option<T> 객체로 사용하기 !
        Optional<String> optVal4 = Optional.empty();
        System.out.println("optVal4 = " + optVal4);
//        String s = optVal4.get(); // error 발생

        // Optional 객체의 값 가져오기 - get(), orElse(), orElseGet(), orElseThrow()
        String str1 = optVal.get(); // null이면 예외 발생
        String str2 = optVal.orElse(""); // null일때 "" 반환
        String str3 = optVal.orElseGet(String::new); // 람다식 사용 가능 () -> new String()
        String str4 = optVal.orElseThrow(NullPointerException::new); // null 이면 예외 발생

        // isPresent() : Optional 객체가 null 이면 false, 아니면 true
        if (Optional.ofNullable(str).isPresent()) {
            System.out.println("str = " + str);
        }


    }
}
