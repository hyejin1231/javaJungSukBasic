package org.example.ch12;

import java.util.ArrayList;

/**
 * ch12. 표준 애너테이션
 * @Override : 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
 * @Deprecated : 앞으로 사용하지 않을 것을 권장하는  필드나 메서드에 붙인다.
 * @FunctionalInterface : 함수형 인터페이스에 붙이면 컴파일러가 올바르게 작성했는지 체크할 수 있다.
 * @SuppressWarnings : 컴파일러의 경고 메시지가 나타나지 않게 억제한다.
 */
public class Ex12_11
{
	
	void parentMethod()
	{
	
	}
	
	public static void main(String[] args)
	{
		Ex12_12 ex1212 = new Ex12_12();
		ex1212.parentMethod(); // deprecated된 메서드 사용
		
		@SuppressWarnings("unchecked")
		ArrayList arrayList = new ArrayList();
		arrayList.add("aaa");
		
	}
}

@FunctionalInterface
interface Testable
{
	void test();
	
//	void test2(); // 함수형 인터페이스는 하나의 추상 메서드만 가능하기 때문에 이 주석 해제하면 에러남 !
}

class Ex12_12 extends Ex12_11
{
	@Deprecated
	@Override
	void parentMethod()
	{
		super.parentMethod();
	}
}


