package org.example.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * ch11. HashMap (2)
 */
public class Ex11_20
{
	public static void main(String[] args)
	{
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		
		HashMap map = new HashMap();
		
		for (int i = 0; i< data.length; i++)
		{
			if (map.containsKey(data[i])) {
				int value  = (int) map.get(data[i]);
				map.put(data[i], value + 1 );
			}else {
				map.put(data[i], 1);
			}
		}
		
		Iterator iterator = map.entrySet().iterator();
		
		while (iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry) iterator.next();
			int value = (int) entry.getValue();
			
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}
	
	private static String printBar(char c, int value)
	{
		String returnStr = "";
		for (int i = 0; i< value; i++)
		{
			returnStr += c;
		}
		
		return returnStr;
	}
}
