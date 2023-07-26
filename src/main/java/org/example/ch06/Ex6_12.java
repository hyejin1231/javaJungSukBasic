package org.example.ch06;

/**
 * ch06. (메서드) 오버로딩
 * : 하는 작업이 같을 때 오버로딩을 한다.
 *
 * 오버로딩 성립 조건
 * - 메서드 이름이 같아야 한다.
 * - 매개변수의 개수 또는 타입이 달라야 한다.
 * - 반환 타입은 영향이 없다.
 */
public class Ex6_12 {
    int add(int a, int b) {
        System.out.println("Ex6_12.add(int a, int b)");
        return a + b;
    }

    long add(long a, long b) {
        System.out.println("Ex6_12.add(long a, long b)");
        return a + b;
    }

    int add(int[] a) {
        System.out.println("Ex6_12.add(int[] a)");
        int result = 0;
        for (int i : a) {
            result  += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Ex6_12 ex6_12 = new Ex6_12();
        System.out.println(ex6_12.add(10, 20));
        System.out.println(ex6_12.add(100L, 200L));
        System.out.println(ex6_12.add(new int[]{100, 200, 300}));
    }

}
