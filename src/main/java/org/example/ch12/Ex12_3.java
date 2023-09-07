package org.example.ch12;

import java.util.ArrayList;
import java.util.List;

/**
 * ch12. 지네릭스 용어, 지네릭 타입과 다형성
 */
public class Ex12_3
{
	public static void main(String[] args)
	{
		//- 참조 변수의 생성자와 대입된 타입은 일치해야 한다.
		ArrayList<Product> products = new ArrayList<>();
//		ArrayList<Product> product = new ArrayList<Tv2>(); // error 타입 불일치
		ArrayList<Tv2> tv2ArrayList = new ArrayList<>();
		
		// - 지네릭 클래스 간의 다형성은 성립 (여전히 대입된 타입은 일치해야함)
		List<Product> list = new ArrayList<>(); // ok 다형성
		
		// - 매개변수의 다형성도 성립
		products.add(new Tv2());
		products.add(new Audio2());
		
		tv2ArrayList.add(new Tv2());
//		tv2ArrayList.add(new Audio2()); // error
		
		printAll(products);
//		printAll(tv2ArrayList); // error 참조변수의 대입된 생성자에 대입된 타입이 불일치 하기 때문 !
	}
	
	private static void printAll(ArrayList<Product> products)
	{
		for (Product product : products)
		{
			System.out.println("product = " + product);
		}
	}
}

class Product
{

}

class Tv2 extends Product
{

}

class Audio2 extends Product
{

}