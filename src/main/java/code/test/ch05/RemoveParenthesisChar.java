package code.test.ch05;

import java.util.Scanner;
import java.util.Stack;

/**
 * ch05. Stack, Queue (자료구조)
 * : 괄호문자제거
 *
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 남은 문자만 출력한다.
 *
 * 예시 입력 1
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 *
 * 예시 출력 1
 * EFLM
 */
public class RemoveParenthesisChar
{
	public static void main(String[] args)
	{
		RemoveParenthesisChar removeParenthesisChar = new RemoveParenthesisChar();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String result = removeParenthesisChar.solution(str);
		System.out.print(result);
		
		System.out.println();
		String result2 = removeParenthesisChar.solution2(str);
		System.out.println("result2 = " + result2);
	}
	
	public String solution(String str)
	{
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for (char c : str.toCharArray())
		{
			if (c == '(')
			{
				stack.push(c);
			} else if (c == ')'){
				stack.pop();
			} else {
				if (stack.isEmpty()) answer += c;
			}
		}
		
		return answer;
	}
	
	public String solution2(String str)
	{
		String answer = "";
		Stack<Character> stack = new Stack<>();
		
		for (char c : str.toCharArray())
		{
			if (c == ')') {
				while (stack.pop() != '('); // pop은 꺼내고 그 꺼낸값을 반환한다.
			}else
			{
				stack.push(c);
			}
		}
		
		for (int i = 0; i< stack.size(); i++)
		{
			answer += stack.get(i);
		}
		
		return answer;
	}
}
