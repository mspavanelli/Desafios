import java.util.Scanner;
import java.util.ArrayList;

public class Triangulation {
	
	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );

		Triangle t = new Triangle(new Point(64,0), new Point(23,30), new Point(51,30));
		System.out.println( t.getArea() );
	}
}

class Polygon {
	public ArrayList<Point> points = new ArrayList<>();
	
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