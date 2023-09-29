package org.example.ch14;

import java.io.File;
import java.util.stream.Stream;

/**
 * ch14. 스트림의 중간연산 (2)
 * map() : 스트림의 요소 변환하기
 * peek() : 스트림의 요소를 소비하지 않고 엿보기 -> 디버깅 용도로 자주 사용함
 * flatMap() : 스트림의 스트림을 스트림으로 변환
 */
public class Ex14_10 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
                new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        Stream<String> stringStream = fileStream.map(File::getName);
        stringStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것은 제외
                .peek(s -> System.out.printf("filename=%s%n", s))
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .map(String::toUpperCase) // 모두 대문자로 변환
                .peek(s -> System.out.printf("extension=%s%n", s))
                .distinct() // 중복 제거
                .forEach(System.out::print); // 출력

        System.out.println();
    }
}
