package org.example.ch14;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * ch14. 스트림의 중간연산 (2)
 * flatMap(): 스트림의 스트림을 스트림으로 변환
 */
public class Ex14_11 {
    public static void main(String[] args) {
        Stream<String[]> stream = Stream.of(new String[]{"abc", "def", "jkl"}, new String[]{"ABC", "GHI", "JKL"});

//        Stream<Stream<String>> strArrStrm = stream.map(Arrays::stream);
        Stream<String> strArrStrm = stream.flatMap(Arrays::stream);
        strArrStrm.map(String::toLowerCase)
                .distinct().sorted().forEach(System.out::println);

        System.out.println();
        String[] lineArr = {"Belive or not It is true", "Do or do not Threr is no try"};

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // 하나 이상의 공백
                .map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);

    }
}
