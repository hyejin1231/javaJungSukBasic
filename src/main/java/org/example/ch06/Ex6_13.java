package org.example.ch06;

import org.example.ch06.tmp.Car;

/**
 * ch06. 생성자, 기본 생성자
 * 생성자가 하나도 없을 때만 컴파일러가 기본 생성자를 자동으로 추가해준다.
 */
class Data_1 {
    // 생성자가 하나도 없기 때문에 컴파일러가 기본 생성자를 추가해줌
    int value;
}

class Data_2 {
    int value;

    Data_2() {

    }

    public Data_2(int value) { // 매개변수가 있는 생성자
        this.value = value;
    }
}


public class Ex6_13 {
    public static void main(String[] args) {
        Data_1 data_1 = new Data_1();
//        Data_2 data_2 = new Data_2(); // compile error 발생 (기본 생성자가 없어서 에러)
        Data_2 data_2 = new Data_2(); // 기본 생성자 추가해줘야 함

        Car car = new Car("white", "auto", 4);
    }
}
