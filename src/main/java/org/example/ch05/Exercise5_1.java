package org.example.ch05;

import java.util.Arrays;

public class Exercise5_1 {
    public static void main(String[] args) {

        int[] arr[];  // 1)
        int[] arr1 = {1, 2, 3,}; // 2) , 뒤에 생략되어 있어도 된다.
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1)); // [1, 2, 3]

        int[] arr3 = new int[5]; // 3)

//        int[] arr4 = new int[5] {1, 2, 3, 4, 5};  // 4) Error ! [] 대괄호에 숫자 넣으면 안됨
        int[] arr4 = new int[]{1, 2, 3, 4, 5}; // [] 대괄호에 숫자 안넣으면 가능

//        int[] arr5[5]; // 5) Error! 선언할 때 크기 지정 안됨
        int[] arr5 = new int[5]; // 이렇게 선언해야함

        int[] arr6[] = new int[3][]; // 6)
        System.out.println("Arrays.toString(arr6) = " + Arrays.toString(arr6)); // [null, null, null]



    }
}
