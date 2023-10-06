package code.test.ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ch01. String (문자열)
 * : 가장 짧은 문자 거리
 *
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 예시 입력 1
 * teachermode e
 *
 * 예시 출력 1
 * t e a c h e r m o d e
 * 1 0 1 2 1 0 1 2 2 1 0
 * 1 1 5 5 5 5 10 10 10 10 10
 *
 * e o c h j g o e k g h l a k e g h h
 * 3 2 1 0 1 2 2 3 2 2 0 1 2 2 3 2 0
 * 3 2 1 0 1 2 3 3 2 1 0 1 2 3 2 1 0
 */
public class ShortestTextDistance
{
	public static void main(String[] args)
	{
		ShortestTextDistance shortestTextDistance = new ShortestTextDistance();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String x = scanner.next();
		
		int[] result = shortestTextDistance.solution(s, x);
		for (int i : result)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		int[] result2 = shortestTextDistance.solution2(s, x.charAt(0));
		System.out.println("Arrays.toString(result2) = " + Arrays.toString(result2));
		
	}
	
	public int[] solution(String s, String x)
	{
		int[] answer = new int[s.length()];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i< s.length(); i++)
		{
			set.add(s.indexOf(x, i));
		}
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0 ; i< answer.length; i++)
		{
			for (Integer integer : set)
			{
				arrayList.add(Math.abs(integer- s.indexOf(s.charAt(i), i)));
			}
			
			answer[i] =  arrayList.stream().min(Integer::compareTo).get();
			arrayList = new ArrayList<>();
		}
		
		return answer;
	}
	
	public int[] solution2(String s, char t)
	{
		int[] answer = new int[s.length()];
		int p = 1000;
		
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == t)
			{
				p = 0;
				answer[i] = p;
			}
			else
			{
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for (int i = s.length() - 1; i >= 0; i--)
		{
			if (s.charAt(i) == t)
			{
				p = 0;
			}
			else
			{
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		
		
		return answer;
	}
}
