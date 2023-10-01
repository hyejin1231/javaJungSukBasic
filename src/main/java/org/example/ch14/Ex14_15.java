package org.example.ch14;

import java.util.stream.IntStream;

/**
 * ch14. 스트림의 최종연산
 * : 1번만 사용가능, 스트림 요소를 소모하기 때문, Stream 을 반환하지 않음
 * forEach(), allMatch(), anyMathc(), noneMatch(), reduce(), findFirst(), findAny(), collect()
 */
public class Ex14_15 {
    public static void main(String[] args) {

        // forEach(), forEachOrdered() : 스트림의 모든 요소에 지정된 작업을 수행
        IntStream.range(1, 10).sequential().forEach(System.out::print); // sequential() : 직렬 스트림 123456789
        System.out.println();
        IntStream.range(1, 10).parallel().forEach(System.out::print); // parallel() : 병렬 스트림 657249318 (병렬이라 순서 보장 x)
        System.out.println();
        IntStream.range(1, 10).parallel().forEachOrdered(System.out::print); // 123456789 병렬 스트림을 사용해서 forEachOrdered 를 사용하면 순서 보장

        // 조건 검사 : allMatch(), anyMatch(), noneMatch()

        // 조건에 일치하는 요소 찾기 : findFirst(), findAny()

        // reduce() : 스트림의 요소를 하나씩 줄여가며 누적 연산 수행
        // collect() : 그룹별로 reduce!! , Collector 를 매개변수로 하는 스트림의 최종 연산
        // Collector : 인터페이스, collect에 필요한 메서드를 정의해 놓은 인터페이스
        // Collectors : 클래스ㅡ 다양한 기능의 Collector 를 구현한 클래스 제공





    }
}
