package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 숫자만 추출
 *
 * 설명
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 *
 * 예시 입력 1
 * g0en2T0s8eSoft
 *
 * 예시 출력 1
 * 208
 */
public class ExtractOnlyNum
{
	public static void main(String[] args)
	{
		ExtractOnlyNum extractOnlyNum = new ExtractOnlyNum();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int result = extractOnlyNum.solution(input);
		System.out.print(result);
		
		System.out.println();
		int result2 = extractOnlyNum.solution2(input);
		System.out.println("result2 = " + result2);
		
		int result3 = extractOnlyNum.solution3(input);
		System.out.println("result3 = " + result3);
	}
	
	public int solution(String input)
	{
		StringBuilder tmp = new StringBuilder();
		char[] chars = input.toCharArray();
		for (char aChar : chars)
		{
			if (Character.isDigit(aChar)) {
				tmp.append(aChar);
			}
		}
		return Integer.parseInt(tmp.toString());
	}
	
	// 아스키넘버 이용
	public int solution2(String input)
	{
		int answer = 0;
		
		for (char c : input.toCharArray())
		{
			if (c >= 48 && c <= 57) { // 48이 아스키넘버로 '0'임 !
				answer = answer * 10 + (c - 48);
			}
		}
		
		return answer;
	}
	
	// isDigit 이용
	public int solution3(String input)
	{
		String answer = "";
		for (char c : input.toCharArray())
		{
			if (Character.isDigit(c)) {
				answer += c;
			}
		}
		
		return Integer.parseInt(answer);
	}
}
