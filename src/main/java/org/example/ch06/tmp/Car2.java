package org.example.ch06.tmp;

/**
 * ch06. 생성자 this() -> 코드 중복을 제거할 때 사용
 * : 생성자에서 다른 생성자 호출할 때 사용
 * 다른 생성자 호출 시 첫 줄에서만 사용 가능
 *
 * 참조변수 this : 인스턴스 자신을 가리키는 참조변수로 인스턴스의 주소가 저장되어 있다.
 * -> 인스턴스 메서드와 생성자에서만 사용할 수 있고 클래스 메서드에서는 사용 불가 !!
 */
public class Car2 {

    String color; // this.color
    String gearType; // this.gearType
    int door; // this.door

    Car2() {
        // this() 를 사용함으로써 코드의 중복 제거
//        color = "white";
//        gearType = "auto";
//        door = 4;
        this("white", "auto", 4);
    }

    public Car2(String color) {
        this(color, "auto", 2);
    }

    public Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
