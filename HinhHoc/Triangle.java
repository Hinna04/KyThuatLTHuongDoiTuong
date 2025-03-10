package hinhhoc;

public abstract class Triangle extends Shapes {
	int a, b, c;
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Triangle() {
		this(0, 0, 0);
	}
	public double getArea() {
		return (a + b + c); 
	}
	public String toString() {
		return "Area is: " + this.getArea();
	}
}
