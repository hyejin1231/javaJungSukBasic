package org.example.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ch11. Stack과 Queue의 활용
 */
public class Ex11_6
{
	static Queue queue = new LinkedList();
	final static int MAX_SIZE = 5;
	
	public static void main(String[] args)
	{
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while (true)
		{
			System.out.print(">> ");
			try
			{
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine().trim();
				
				if ("".equals(input)) {
					continue;
				}
				
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("histoy - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				}
				else if (input.equalsIgnoreCase("history")) {
					save(input); // 입력받은 명령어를 저장하고
					
					LinkedList list = (LinkedList) queue;
					
					final int size = list.size(); // list.size()는 바뀌지 않는 값이므로 변수로 뽑아서 하기
					for (int i = 0; i < size; i++) // LinkedList의 내용을 보여준다.
					{
						System.out.println((i + 1) + "." + list.get(i));
					}
				}else {
					save(input);
					System.out.println(input);
				}
			}
			catch (Exception e) {
				System.out.println("입력 오류입니다.");
			}
		}
	}
	
	public static void save(String input)
	{
		if (!"".equals(input)) {
			queue.offer(input);
		}
		
		// Queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if (queue.size() > MAX_SIZE) { // size()는 Collection 인터페이스의 정의
			queue.remove();
		}
	}
}
