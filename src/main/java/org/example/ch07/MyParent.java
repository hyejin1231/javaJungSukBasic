package org.example.ch07;

/**
 * ch07. 접근 제어자
 * private : 같은 클래스 내에서 사용 가능
 * default : 같은 패키지 내에서 사용 가능
 * protected : 같은 패키지 + 다른 패키지 자손 클래스 사용 가능
 * public : 접근 제한 없음
 */
public class MyParent { // default 접근제어일 때는 다른 패키지의 클래스에서 상속 못함 !!
	private int prv;  // 같은 클래스
	/*(default)*/ int dft;  // 같은 패키지
	protected  int prt; // 같은 패키지 + 다른 패키지 자손
	public int pub;  // 접근 제한 없음
	
	public void printMembers()
	{
		System.out.println("prv = " + prv);
		System.out.println("dft = " + dft);
		System.out.println("prt = " + prt);
		System.out.println("pub = " + pub);
	}
}


 class MyParentTest
{
	public static void main(String[] args)
	{
		MyParent myParent = new MyParent();
//		System.out.println("myParent.prv = " + myParent.prv); // error ! private 는 같은 클래스내에서만 사용 가능
		System.out.println("myParent.dft = " + myParent.dft);
		System.out.println("myParent.prt = " + myParent.prt);
		System.out.println("myParent.pub = " + myParent.pub);
	}
}
