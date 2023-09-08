package org.example.ch12;

import java.util.ArrayList;

/**
 * ch12. 와일드 카드, 지네릭 메서드
 * : 하나의 참조변수로 대입된 타입이 다른 객체를 참조 가능
 * <? extends T> : 와일드 카드의 상한 제한, T와 그 자손들만 가능
 * <? super T> :  와일드 카드의 하한 제한, T와 그 조상들만 가능
 * <?>  : 제한 없음 ! 모든 타입이 가능 <? extends Object> 와 동일
 */
public class Ex12_6 {
    public static void main(String[] args) {

        // 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
        ArrayList<? extends Product> list = new ArrayList<Tv2>(); // ok
        ArrayList<? extends Product> list1 = new ArrayList<Audio2>(); // ok
//        ArrayList<Product> list2 = new ArrayList<Tv2>(); // error 대입된 타입 불일치

        // 메서드 매개변수에 와일드 카드를 사용
        makeJuice(new FruitBox<Fruit>());
        makeJuice(new FruitBox<Apple>()); // ok
    }

    static void makeJuice(FruitBox<? extends Fruit> fruitBox) { // Fruit와 그 자손들 가능

    }
}
