package org.example.ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ch07. 익명 클래스 anonymous class
 * : 이름이 없는 클래스, 정의와 생성을 동시에 !
 */
public class Ex7_18
{
	public static void main(String[] args)
	{
		// 익명 클래스 사용 x
		Button button = new Button("start");
		button.addActionListener(new EventHandler());
		
		// 익명 클래스 사용
		button.addActionListener(
				e -> System.out.println("Ex7_18.actionPerformed"));
	}
}

class EventHandler implements ActionListener
{
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("EventHandler.actionPerformed");
		
	}
}
