package org.example.ch06.tmp;

/**
 * ch06. 생성자, 기본 생성자, 매개변수가 있는 생성자
 */
public class Car {
    String color;
    String gearType;
    int door;

    public Car() { // 기본 생성자
    }

    public Car(String color, String gearType, int door) { // 매개변수가 있는 생성자
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
