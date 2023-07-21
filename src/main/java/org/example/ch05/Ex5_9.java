package org.example.ch05;

/**
 * ch05. 배열의 활용 (3) ~ (4)
 */
public class Ex5_9
{
	public static void main(String[] args)
	{
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++)
		{
			ball[i] = i + 1;
		}
		
		int tmp = 0; // 두 값을 바꾸는 데 사용할 임시 변수
		
		for (int i = 0; i< 6; i++) // 6개의 값만 바꾸면 되기 때문에 굳이 뒤에는 섞을 필요 없음
		{
			int j = (int) (Math.random() * 45); //// 임의의 값을 얻어서 저장할 변수
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println("ball["+ i + "] = " + ball[i]);
		}
	}
}
