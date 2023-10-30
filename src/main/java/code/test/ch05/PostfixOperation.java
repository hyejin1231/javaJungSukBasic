package code.test.ch05;

import java.util.Scanner;
import java.util.Stack;

/**
 * ch05. Stack, Queue (자료구조)
 * : 후위식 연산 (postfix)
 *
 * 설명
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 *
 * 입력
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 *
 * 출력
 * 연산한 결과를 출력합니다.
 *
 * 예시 입력 1
 * 352+*9-
 *
 * 예시 출력 1
 * 12
 */
public class PostfixOperation
{
	public static void main(String[] args)
	{
		PostfixOperation postfixOperation = new PostfixOperation();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int result = postfixOperation.solution(str);
		System.out.print(result);
		
		System.out.println();
		int result2 = postfixOperation.solution2(str);
		System.out.println("result2 = " + result2);
	}
	
	public int solution(String str)
	{
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for (char c : str.toCharArray())
		{
			if (Character.isDigit(c)) {
				stack.push((int) c - 48);
			}else {
				int a = stack.pop();
				int b = stack.pop();
				switch (c) {
					case '+':
						answer = b + a ;
						break;
					case '-':
						answer = b - a ;
						break;
					case '*':
						 answer = b * a;
						break;
					case '/':
						answer = b / a;
						break;
				}
				stack.push(answer);
				answer =0;
			}
		}
		
		return stack.get(0);
	}
	
	public int solution2(String str)
	{
		Stack<Integer> stack = new Stack<>();
		
		for (char c : str.toCharArray())
		{
			if (Character.isDigit(c)) {
				stack.push(c - 48);
			}else
			{
				int rt = stack.pop();
				int lt = stack.pop();
				
				if (c == '+') {
					stack.push(lt + rt);
				}
				else if (c == '-') {
					stack.push(lt - rt);
				}
				else if (c == '*') {
					stack.push(lt * rt);
				}
				else if (c == '/') {
					stack.push(lt / rt);
				}
			}
		}
		
		return stack.get(0);
	}
}
