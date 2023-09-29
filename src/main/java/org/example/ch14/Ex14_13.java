package org.example.ch14;

import java.util.Optional;
import java.util.OptionalInt;

/**
 * ch14. Optional
 */
public class Ex14_13 {
    public static void main(String[] args) {
        // OptionalInt, OptionaLong, OptionalDouble : 기본형 값을 감싸는 래퍼클래스 -> 성능 올리기 위해 사용

        OptionalInt optionalInt = OptionalInt.of(0);
        int asInt = optionalInt.getAsInt();
        System.out.println("asInt = " + asInt);
        OptionalInt empty = OptionalInt.empty();

        System.out.println("optionalInt = " + optionalInt.isPresent()); // true
        System.out.println("empty.isPresent() = " + empty.isPresent()); // false

    }
}
