package org.example.ch07;

/**
 * ch07. 인터페이스의 선언, 상속, 구현
 * 인터페이스 구현
 * : 인터페이스에 정의된 추상 메서드를 완성하는 것
 */
public class Ex7_10_impl implements Ex7_10{
    @Override
    public int printNumber(int number) {
        return number;
    }
}
