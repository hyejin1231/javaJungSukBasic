package code.test.ch04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ch04. HashMap, TreeSet (해쉬, 정렬지원 Set)
 * : 모든 아나그램 찾기
 *
 * 설명
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 *
 * 예시 입력 1
 * bacaAacba
 * abc
 *
 * 예시 출력 1
 * 3
 *
 * 힌트
 * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */
public class FindAllAnagrams
{
	public static void main(String[] args)
	{
		FindAllAnagrams findAllAnagrams = new FindAllAnagrams();
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String t = scanner.nextLine();
		
		int result = findAllAnagrams.solution(s, t);
		System.out.print(result);
		
		System.out.println();
		int result2 = findAllAnagrams.solution2(s, t);
		System.out.println("result2 = " + result2);
	}
	
	public int solution(String s, String t)
	{
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		char[] chars = s.toCharArray();
		
		for (int i = 0; i< t.length() - 1 ; i++)
		{
			map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
		}
		
		for (char c : t.toCharArray())
		{
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		
		
		int lt = 0;
		for (int i = t.length() -1; i< chars.length; i++)
		{
			int cnt = 0;
			map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
			for (char c : t.toCharArray())
			{
				if (map.containsKey(c)) {
					if (map.get(c) == map2.get(c)) {
						cnt++;
					} else {
						break;
					}
				} else
				{
					break;
				}
			}
			if (cnt == t.length())
			{
				answer++;
			}
			
			map.put(chars[lt], map.get(chars[lt]) - 1);
			if (map.get(chars[lt]) == 0) {
				map.remove(chars[lt]);
			}
			lt++;
		}
		
		
		return answer;
	}
	
	public int solution2(String a, String b)
	{
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		for (char c : b.toCharArray())
		{
			bm.put(c, bm.getOrDefault(c, 0) + 1);
		}
		int L = b.length() - 1;
		for (int i = 0; i < L; i++)
		{
			am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		}
		
		int lt = 0;
		for (int rt = L; rt < a.length(); rt++)
		{
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
			
			if (am.equals(bm))
			{
				answer++;
			}
			am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
			
			if (am.get(a.charAt(lt)) == 0) {
				am.remove(a.charAt(lt));
			}
			lt++;
		}
		
		
 	
		
		return answer;
	}
}
