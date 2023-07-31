package org.example.ch07;

/**
 * ch07. 여러 종류의 객체를 배열로 다루기
 * : 조상 타입의 배열에 자손들의 객체를 담을 수 있다.
 */
class Phone extends Product {
	public Phone()
	{
		super(6000);
	}
}
public class Ex7_9
{
	public static void main(String[] args)
	{
		Product[] products = new Product[3];
		products[0] = new Computer();
		products[1] = new Audio();
		products[2] = new Phone();
	}
}
