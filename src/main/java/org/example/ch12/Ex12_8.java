package org.example.ch12;

import java.util.ArrayList;

/**
 * ch12. 지네릭 형변환
 * : 지네릭 타입과 원시 타입간의 형변환은 바람직하지 않다. (경고 발생)
 */
public class Ex12_8
{
	public static void main(String[] args)
	{
		// 지네릭 타입과 원시 타입 간의 형변환은 바람직하지 않다.
		ArrayList list = null;
		ArrayList<String> arrayList = null;
		
		list = arrayList; // Arraylist<String> -> Arraylist 가능 but 경고
		arrayList = list; // Arraylist -> Arraylist<String> 가능 but 경고
		
		ArrayList<Object> objectArrayList = null;
//		objectArrayList = arrayList; // error !
//		arrayList = objectArrayList; // error !

		// 와일드 카드가 사용된 지네릭 타입으로 형변환 가능
		ArrayList<? extends Object> arrayList1 = (ArrayList<? extends Object>) new ArrayList<String>(); // 가능
		ArrayList<? extends Object> arrayList2 = new ArrayList<String>(); // 생략 가능
	}
}
