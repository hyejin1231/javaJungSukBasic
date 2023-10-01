package org.example.ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ch14. 스트림의 최종 연산
 */
public class Ex14_16 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "IntStream", "count", "sum"
        };

        System.out.println("ForEach() 직렬 ");
        Stream.of(strArr).forEach(System.out::println);
        System.out.println("ForEach 병렬");
        Stream.of(strArr).parallel().forEach(System.out::println);

        System.out.println();
        boolean noneMatch = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        System.out.println("noneMatch = " + noneMatch);

        Optional<String> first = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst(); // 조건에 맞는 값 하나 가져옴
        System.out.println("first = " + first.get());

        System.out.println();
        // mapToInt -> Stream<Integer> 대신 기본형 스트림으로 사용
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        int max = intStream3.reduce(0, (a, b) -> a > b ? a : b);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("max = " + max);
        System.out.println("min = " + min.getAsInt());
    }
}
