package org.example.ch12;

import java.util.ArrayList;

/**
 * ch12. 제한된 지네릭 클래스, 지네릭스의 제약
 * : 지네릭 타입에 'extends'를 사용하면 특정 타입의 자손들만 대입할 수 있게 제한할 수 있다.
 *
 * 지네릭스 제약
 * 1. 타입 변수에 대입은 인스턴스 별로 다르게 가능
 * 2. static 멤버에 타입 변수 사용 불가
 * 3. 배열 생성할 때 타입 변수 사용 불가, 타입 변수로 배열 선언은 가능
 */
public class Ex12_5 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<>();
//        FruitBox<Grape> grapeFruitBox1 = new FruitBox<Apple>(); // error 타입 불일cl
//        FruitBox<Toy> toyFruitBox = new FruitBox<Toy>(); // error

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleFruitBox.add(new Apple());
//        appleFruitBox.add(new Grape()); // error ! Grape는 Apple의 자손이 아님

    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
}

class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class Toy {

}

interface Eatable {

}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
