package org.example.ch12;

import java.util.ArrayList;

/**
 * ch12. 타입 변수
 * : 클래스를 작성할 때 Object 타입 대신 타입 변수 (E) 를 사용
 *
 * 타입 변수에 대입하기
 * - 객체를 생성할 때는 타입 변수 (E) 대신에 실제 객체를 지정 (대입)
 * 타입 변수 대신에 실제 객체가 지정되면 형변환을 생략 가능 !
 */
public class Ex12_2
{
	public static void main(String[] args)
	{
		ArrayList<Tv> tvArrayList = new ArrayList<>(); // TV 타입의 객체만 저장 가능한 리스트
		tvArrayList.add(new Tv());
//		tvArrayList.add(new Audio()); // error ! TV 객체만 저장 가능하기 때문에
		
		Tv tv = tvArrayList.get(0); // 타입 일치하기 때문에 형변환 생략 가능 !
		
	}
}

class Tv
{

}

class Audio
{

}