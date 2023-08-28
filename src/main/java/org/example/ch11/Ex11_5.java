package org.example.ch11;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * ch11. Stack과 Queue의 활용
 */
public class Ex11_5
{
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		String expression = "((3 + 5 ) * 8 - 2)";
		
		System.out.println("expression = " + expression);
		
		try
		{
			
			for (int i = 0; i < expression.length(); i++)
			{
				char ch = expression.charAt(i);
				
				if (ch == '(')
				{
					stack.push(ch + "");
				}
				else if (ch == ')')
				{
					stack.pop();
				}
			}
			
			if (stack.isEmpty()) // 괄호가 일치하면 stack이 비어있음
			{
				System.out.println("괄호가 일치합니다.");
			}
			else
			{
				System.out.println("괄호가 일치하지 않습니다.");
			}
		}
		catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}
}
