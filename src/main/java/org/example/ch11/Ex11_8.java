package org.example.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ch11. Arrays
 * : 배열을 다루기 위한 편리한 메서드 (static) 제공
 */
public class Ex11_8 {
    public static void main(String[] args) {
        // 1. 배열 출력 : toString
        // 2. 배열 복사 : copyOf(), copyOfRange()
        int[] arr = {0, 1, 2, 3, 4, 5};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int[] arr2 = Arrays.copyOfRange(arr, 0, 2);
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        // 3. 배열 채우기 : fill(), setAll()
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 9);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        Arrays.setAll(arr3, i -> (int)((Math.random() * 5 ) + 1 )); // 1 ~ 5
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        // 4. 배열의 정렬과 검색 : sort(), binarySearch() -> 이진탐색은 정렬을 했을 경우에만 가능
        int[] arr4 = {0, 4, 3, 5, 1};
        Arrays.sort(arr4); // 정렬을 해야 이진 탐색 가능 !
        int index = Arrays.binarySearch(arr4, 1);
        System.out.println("index = " + index);

        // 5. 다차원 배열 출력 : deepToString()
        int[][] arr2D = {{11, 22}, {33, 44}};
        System.out.println("Arrays.deepToString(arr2D) = " + Arrays.deepToString(arr2D));

        // 6. 다차원 배열 비교 : deppEquals()
        int[][] arr2D2 = {{11, 22}, {33, 44}};
        System.out.println("Arrays.deepEquals(arr2D, arr2D2) = " + (Arrays.deepEquals(arr2D, arr2D2)));

        // 7. 배열을 List로 변환 : asList(Object a)
        List<Integer> list = Arrays.asList(new Integer[]{1, 2, 3, 4, 5}); // 읽기 전용임..
//        list.add(1); // UnsupportedOperationException 에러 발생

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        arrayList.add(1); // 가능
        System.out.println("arrayList = " + arrayList);

    }
}
