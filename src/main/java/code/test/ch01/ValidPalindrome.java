package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 유효한 팰린드롬
 *
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예시 입력 1
 * found7, time: study; Yduts; emit, 7Dnuof
 *
 * 예시 출력 1
 * YES
 */
public class ValidPalindrome
{
	public static void main(String[] args)
	{
		ValidPalindrome validPalindrome = new ValidPalindrome();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String result = validPalindrome.solution(input);
		System.out.print(result);
		
		System.out.println();
		String result2 = validPalindrome.solution2(input);
		System.out.println("result2 = " + result2);
	}
	
	public String solution(String input)
	{
		char[] chars = input.replace(" ", "").toLowerCase().toCharArray();
		input = "";
		for (char aChar : chars)
		{
			if (Character.isAlphabetic(aChar) || Character.isDigit(aChar)) {
				input += aChar;
			}
		}
		
		String reverseInput = new StringBuilder(input).reverse().toString();
		
		return (input.equals(reverseInput)) ? "YES" : "NO";
	}
	
	// replaceAll 사용
	public String solution2(String input)
	{
		String answer = "NO";
		// replace에는 정규식 사용 못하지만 replaceAll에는 정규식 사용 가능하다.
		input = input.toUpperCase().replaceAll("[^A-Z]", ""); // A-Z가 아니면 빈문자열로 대체하라.
		String reverseInput = new StringBuilder(input).reverse().toString();
		
		if (input.equals(reverseInput)) return "YES";
		
		return answer;
	}
}
