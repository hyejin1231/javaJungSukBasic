package org.example.ch11;

import java.util.HashMap;
import java.util.Set;

/**
 * ch11. HashMap (2)
 * : Map 인터페이스를 구현한 대표적 컬렉션 클래스 (순서 x, 중복 (키 x, 값  o))
 */
public class EX11_18
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1234");
		map.put("myId", "4567"); // 이때 key 값은 중복 허용 하지 않기 때문에 "1234" 값에서 "4567" 값으로 대체된다.
		
		for (Object o : map.keySet())
		{
			System.out.println("key : "  + o + ", value = " + map.get(o));
		}
		
	}
}
