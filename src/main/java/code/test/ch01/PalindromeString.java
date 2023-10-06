package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 회문 문자열
 *
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예시 입력 1
 * gooG
 *
 * 예시 출력 1
 * YES
 */
public class PalindromeString
{
	public static void main(String[] args)
	{
		PalindromeString palindromeString = new PalindromeString();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		String result = palindromeString.solution(input);
		System.out.print(result);
		
		System.out.println();
		String result2 = palindromeString.solution2(input);
		System.out.println("result2 = " + result2);
		
		String result3 = palindromeString.solution3(input);
		System.out.println("result3 = " + result3);
	}
	
	public String solution(String input)
	{
		input = input.toLowerCase();
		String reverseInput = new StringBuilder(input).reverse().toString();
		
		 return (input.equals(reverseInput)) ?  "YES" :"NO";
	}
	
	public String solution2(String input)
	{
		String answer = "YES";
		int length = input.length();
		input = input.toUpperCase();
		
		for (int i = 0; i< length/2; i++)
		{
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				return "NO";
			}
		}
		
		return answer;
	}
	
	public String solution3(String input)
	{
		String answer = "NO";
		String tmp = new StringBuilder(input).reverse().toString();
		if (input.equalsIgnoreCase(tmp)) {
			return "YES";
		}
		
		return answer;
	}
}
