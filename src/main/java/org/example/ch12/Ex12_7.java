package org.example.ch12;

/**
 * ch12. 와일드 카드, 지네릭 메서드
 * 지네릭 메서드 : 지네릭 타입이 선언된 메서드 (타입변수는 메서드 내에서만 유효하다.)
 * 클래스의 타입 매개변수 <T> 와 메서드의 타입 매개변수 <T> 는 별개
 *
 * 와일드 카드 : 하나의 참조변수로 서로 다른 타입이 대입된 여러 지네릭 객체를 다루기 위한 것
 * 지네릭 메서드 : 호출할 때 마다 다른 타입을 대입할 수 있게 한 것 !
 */
public class Ex12_7 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();

        // 메서드를 호출할 때 마다 타입을 대입해야 하는데 대부분 생략 가능하다.
        Ex12_7.<Fruit>makeJuice2(fruitBox);

        makeJuice2(fruitBox);
        makeJuice2(appleFruitBox);
    }

    // 지네릭 메서드 : Fruit 하고 그 자손만 올 수 있다.
    static <T extends Fruit> void makeJuice2(FruitBox<T> box) {

    }

    // 와일드 카드
    static void makeJuice3(FruitBox<? extends Fruit> box) {

    }
}
