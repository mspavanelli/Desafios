import java.util.Scanner;
import java.util.ArrayList;

public class Triangulation {
	
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );

		ArrayList<Point> pts = new ArrayList<>();
		
		int n_vertex = s.nextInt();
		for (int i = 0; i < n_vertex; i++)
			p.add( new Point(s.nextInt(), s.nextInt()) );	
		
		Polygon pol = new Polygon(pts);
	}
}

class Polygon {
	public ArrayList<Point> points;

	public Polygon( ArrayList<Points> points ) {
		this.points = points;
	}

	// TODO: triagulation formula

	// 1: formas convexas


	// 2: formas côncavas (+difícil)
	
}

class Triangle {
	private Point a, b, c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public float getArea() {
		float f = a.x * ( b.y - c.y );
		float s = b.x * ( c.y - a.y );
		float t = c.x * ( a.y - b.y );

		return Math.abs((f + s + t) / 2);
	}
}

class Point {
	public float x, y;

	public Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
}

class Edge {
	public Point a, b;

	public Edge( Point a, Point b ) {
		this.a = a;
		this. b = b;
	}

	
}

/*
Sample Input

1
6
7 0
6 2
9 5
3 5
0 3
1 1

Sample Output

9.0

*/