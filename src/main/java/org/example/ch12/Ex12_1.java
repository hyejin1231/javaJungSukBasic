package org.example.ch12;

import java.util.ArrayList;

/**
 * ch12. 지네릭스란 ?
 * : 컴파일시 타입을 체크해주는 기능 (compile-time type check) - jdk1.5
 * 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌
 * -> 런타임 에러 대신 컴파일 에러로 끌고 오기 위해서 등장 !
 *
 * 장점 1. 타입 안정성을 제공한다.
 *     2. 타입 체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.
 */
public class Ex12_1 {
    public static void main(String[] args) {
        // 지네릭스 도입 이전
        ArrayList arrayList = new ArrayList(); // 숫자만 넣고 싶은 arraylist
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add("30");


        Integer integer = (Integer) arrayList.get(2); // error ! 형변환 에러 (실행 시 발생하는 에러) // -> 컴파일에는 문제가 없음 -> 컴파일의 한계

        System.out.println("arrayList = " + arrayList);

        // 지네릭스 도입 후
        ArrayList<Integer> arrayList1 = new ArrayList<>(); // 지네릭스 사용, 실행 시 에러 나는 것을 방지시켜줌
        arrayList1.add(10);
        arrayList1.add(20);
//        arrayList1.add("30"); // 컴파일 에러 ! , 지네릭스 덕분에 타입 체크 강화됨 !

        Integer integer1 = arrayList1.get(2); // 형변환 생략 가능
    }
}
