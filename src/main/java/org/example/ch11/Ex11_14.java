package org.example.ch11;

import java.util.HashSet;

/**
 * ch11. HashSet (2)
 */
public class Ex11_14 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("setA = " + setA);

        HashSet setB = new HashSet();
        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("setB = " + setB);

        // 교집합
//        setA.retainAll(setB);
//        System.out.println("교집합 = " + setA);

        // 합집합
//        setA.addAll(setB);
//        System.out.println("합집합 = " + setA);

        // 차집합
//        setA.removeAll(setB);
//        System.out.println("setA = " + setA);


    }
}
