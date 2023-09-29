package org.example.ch14;

import java.io.ObjectOutput;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * ch14. Optional
 */
public class Ex14_14 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);

        System.out.println("optStr = " + optStr.get()); // abcde
        System.out.println("optInt = " + optInt.get()); // 5

        int result = Optional.of("123").filter(x -> x.length() > 0).map(Integer::parseInt).get();
        System.out.println("result = " + result); // 123

        int result2 = Optional.of("").filter(x -> x.length() > 0).map(Integer::parseInt).orElse(-1);
        System.out.println("result2 = " + result2); // -1

        Optional.of("456").map(Integer::parseInt).ifPresent(x -> System.out.printf("reslut3 = %d%n", x)); // 456

        OptionalInt optionalInt1 = OptionalInt.of(0);
        OptionalInt optionalInt2 = OptionalInt.empty();

        System.out.println("optionalInt1.isPresent() = " + optionalInt1.isPresent()); // true
        System.out.println("optionalInt2.isPresent() = " + optionalInt2.isPresent()); // false

        System.out.println("optionalInt1.getAsInt() = " + optionalInt1.getAsInt()); // 0
//        System.out.println("optionalInt2.getAsInt() = " + optionalInt2.getAsInt()); // error 발생
        System.out.println("optionalInt1 = " + optionalInt1);
        System.out.println("optionalInt2 = " + optionalInt2);
        System.out.println("optionalInt1.equals(optionalInt2) = " + (optionalInt1.equals(optionalInt2))); // false
    }
}
