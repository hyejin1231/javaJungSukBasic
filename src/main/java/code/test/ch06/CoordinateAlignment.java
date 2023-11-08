package code.test.ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * ch06. Sorting and Searching(정렬, 이분검색과 결정알고리즘)
 * : 좌표 정렬
 *
 * 설명
 *
 * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
 * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 *
 *
 * 입력
 * 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
 * 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
 *
 * 출력
 * N개의 좌표를 정렬하여 출력하세요.
 *
 * 예시 입력 1
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6
 *
 * 예시 출력 1
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */
public class CoordinateAlignment
{
	public static void main(String[] args)
	{
		CoordinateAlignment coordinateAlignment = new CoordinateAlignment();
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		ArrayList<Point> points = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			points.add(new Point(scanner.nextInt(), scanner.nextInt()));
		}
		
		ArrayList<Point> result = coordinateAlignment.solution(n, points);
		for (Point point : result)
		{
			System.out.println(point.x + " " + point.y);
		}
		
	}
	
	public ArrayList<Point> solution(int n, ArrayList<Point> points)
	{
		Collections.sort(points, (o1, o2) -> {
			if (o1.x == o2.x) {
				return o1.y - o2.y;
			}else {
				return o1.x - o2.x;
			}
		});
		return points;
	}
	
}

class Point
{
	int x;
	int y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "Point{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
	
}


