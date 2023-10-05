package code.test.ch01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * ch01. String (문자열)
 * : 중복문자제거
 *
 * 설명
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 * 예시 입력 1
 * ksekkset
 *
 * 예시 출력 1
 * kset
 */
public class RemoveDupStr
{
	public static void main(String[] args)
	{
		RemoveDupStr removeDupStr = new RemoveDupStr();
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String result = removeDupStr.solution(input);
		String result2 = removeDupStr.solution2(input);
		String result3 = removeDupStr.solution3(input);
		
		System.out.print(result);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
	}
	
	public String solution(String input)
	{
		List<String> list = new ArrayList<>();
		Set<String> uniqueValues = new HashSet<>();
		for (String s : input.split(""))
		{
			if (uniqueValues.add(s))
			{
				list.add(s);
			}
		}
		return String.join("", list);
	}
	
	public String solution2(String input)
	{
		StringBuilder answer = new StringBuilder();
		String[] split = input.split("");
		for (String s : split)
		{
			if (!answer.toString().contains(s)) {
				answer.append(s);
			}
		}
		return answer.toString();
	}
	
	// indexOf() 사용
	public String solution3(String input)
	{
		String answer = "";
		for (int i = 0; i < input.length(); i++)
		{
//			System.out.println(input.charAt(i) + " " + i + " " + input.indexOf(input.charAt(i)));
			if (i == input.indexOf(input.charAt(i))) {
				answer += input.charAt(i);
			}
		}
		
		return answer;
	}
}
