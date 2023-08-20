package org.example.ch09;

/**
 * ch09. StringBuilder 클래스, Math 클래스
 * : StringBuffer는 동기화(데이터 보호)되어 있다. 멀티쓰레드에 안전 (thread safe)
 * -> StringBuilder 는 동기화 x
 * 싱글 스레드 : 한번에 1개의 작업만 가능
 * 멀티 스레드 : 한번에 n개의 작업 ex) 파일 다운르드하면서 채팅 이어가기 -> 데이터 공유
 *
 * 멀티 스레드 프로그램이 아닌 경우에는 동기화는 불필요한 성능 저하를 일으킨다.
 * -> 이럴 때는 StringBuffer 대신 StringBuilder 를 사용하면 성능 향상 !
 *
 *  Math 클래스 : 수학 관련 static 메서드 집합
 */
public class Ex9_9 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("Math.PI = " + Math.PI);
        double num = 90.7552;
        num = num * 100; // 9075.52
        num = Math.round(num); // 9076
        num = num / 100.0; // 90.76
        System.out.println("num = " + (int)num); // 90

        // abs : 주어진 값의 절대값을 반환한다.
        System.out.println("Math.abs(-10) = " + Math.abs(-10)); // 10

        // ceil : 주어진 값을 올림하여 반환한다.
        System.out.println("Math.ceil(-10.1) = " + Math.ceil(-10.1)); // -10.0

        // floor : 주어진 값을 버림하여 반환한다.
        System.out.println("Math.floor(-10.1) = " + Math.floor(-10.1)); // -11.0

        // max : 주어진 두 값을 비교하여 큰 쪽 반환
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20)); // 20

        // min : 주어진 두 값을 비교하여 작은 쪽 반환
        System.out.println("Math.min(10, 20) = " + Math.min(10, 20)); // 10

        // random : 0.0 ~ 1.0 범위의 임의의 double 값 반환
        int random = (int) (Math.random() * 10) + 1; // 1 ~ 10 사이의 값
        System.out.println("random = " + random);

        // rint : 주어진 double 값과 가장 가까운 정수값 double 형으로 반환한다. -> 쓸 일은 별로 없음
        System.out.println("Math.rint(1.2) = " + Math.rint(1.2)); // 1.0

        // round : 소수점 첫째자리에서 반올림한 정수값 반환
        System.out.println("Math.round(1.2) = " + Math.round(1.2)); // 1




    }
}
