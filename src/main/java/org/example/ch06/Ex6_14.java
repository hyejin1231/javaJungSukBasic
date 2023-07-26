package org.example.ch06;

import org.example.ch06.tmp.Car;

/**
 * ch06.변수의 초기화, 멤버변수의 초기화
 */
public class Ex6_14 {
    int x;
    int y = x;

     int door = 4; // 기본형(primitive type) 변수의 초기화
    Car car = new Car(); // 참조형(reference type) 변수의 초기화
    Car car2; // 이건 참조형 변수의 초기화가 아니다.!!! 객체를 넣어준게 아니기 때문이다.

    void init() {
        int a;
//        int b= a; error ! 지역 변수는 반드시 사용전에 수동 초기화해야한다.
    }
}
