package org.example.ch07;

/**
 * ch07. 매개변수 다형성
 * 참조형 매개변수는 메서드 호출 시, 자신과 같은 타입 또는 자손 타입의 인스턴스를 넘겨줄 수 있다.
 */
class Product {
	int price;
	int bonusPoint;
	
	public Product(int price)
	{
		this.price = price;
		this.bonusPoint = (int) (price / 10.0);
	}
}

class Computer extends  Product{
	public Computer()
	{
		super(5000);
	}
}
class Audio extends Product{
	public Audio()
	{
		super(3000);
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	
	void buy(Product product)
	{
		money -= product.price;
		bonusPoint += product.bonusPoint;
	}
}

public class Ex7_8
{
	public static void main(String[] args)
	{
		Buyer buyer = new Buyer();
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		
		System.out.println("buyer.money = " + buyer.money);
		System.out.println("buyer.bonusPoint = " + buyer.bonusPoint);
	}
	
}
