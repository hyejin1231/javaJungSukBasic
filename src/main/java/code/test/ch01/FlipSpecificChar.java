package code.test.ch01;

import java.util.Scanner;

/**
 * ch01. String (문자열)
 * : 특정 문자 뒤집기
 *
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력 1
 * a#b!GE*T@S
 *
 * 예시 출력 1
 * S#T!EG*b@a
 */
public class FlipSpecificChar
{
	public static void main(String[] args)
	{
		FlipSpecificChar specificChar = new FlipSpecificChar();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next(); // a#b!GE*T@S
		
		String result = specificChar.solution(input);
		System.out.print(result); // S#T!EG*b@a
		
		System.out.println();
		String result2 = specificChar.solution2(input);
		System.out.println("result2 = " + result2);
		
	}
	
	public String solution(String input)
	{
		char[] chars = input.toCharArray();
		int lt = 0, rt = chars.length-1;
		
		while (lt < rt)
		{
			if ((chars[lt] >= 'A' && chars[lt] <= 'z') && (chars[rt] >= 'A' && chars[rt] <= 'z')) {
				char tmp = chars[lt];
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++;
				rt--;
			}else if ((chars[lt] >= 'A' && chars[lt] <= 'z') && !(chars[rt] >= 'A' && chars[rt] <= 'z')){
				rt --;
			}
			else if (!(chars[lt] >= 'A' && chars[lt] <= 'z') && (chars[rt] >= 'A' && chars[rt] <= 'z')) {
				lt++;
			}else {
				lt++;
				rt--;
			}
		}
		
		return String.valueOf(chars);
	}
	
	// toCharArray() 이용
	public String solution2(String input)
	{
		char[] chars = input.toCharArray();
		int lt = 0, rt = chars.length - 1;
		
		while (lt < rt)
		{
			if (!Character.isAlphabetic(chars[lt])) lt++;
			else if (!Character.isAlphabetic(chars[rt])) rt--;
			else {
				char tmp = chars[lt];
				chars[lt] = chars[rt];
				chars[rt] = tmp;
				lt++;
				rt --;
			}
		}
		
		return String.valueOf(chars);
	}
}
