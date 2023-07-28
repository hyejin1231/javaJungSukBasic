package org.example.ch07.tmp;

import org.example.ch07.MyParent;

/**
 * ch07. 접근 제어자
 * private : 같은 클래스 내에서 사용 가능
 * default : 같은 패키지 내에서 사용 가능
 * protected : 같은 패키지 + 다른 패키지 자손 클래스 사용 가능
 * public : 접근 제한 없음
 */
class MyChild extends MyParent
{
	public void printMembers()
	{
//		System.out.println("prv = " + prv); // error ! private 같은 클래스 내에서만 사용 가능
//		System.out.println("dft = " + dft); // error ! default는 같은 패키지 내에서만 사용 가능
		System.out.println("prt = " + prt); // protected는 같은 패키지의 자손 클래스만 사용 가능해서 에러 안남 !
		System.out.println("pub = " + pub);
	}
}

public class MyParentTest2
{
	public static void main(String[] args)
	{
		MyParent myParent = new MyParent();
		//		System.out.println("myParent.prv = " + myParent.prv); // error ! private 는 같은 클래스내에서만 사용 가능
//		System.out.println("myParent.dft = " + myParent.dft); // error ! default 는 같은 패키지 내에서만 사용 가능
//		System.out.println("myParent.prt = " + myParent.prt); // error ! protected 는 같은 패키지 + 하위 패키지 자손 클래스만 사용 가능
		System.out.println("myParent.pub = " + myParent.pub);
	}
}
