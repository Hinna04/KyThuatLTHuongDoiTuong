package hinhhoc;

public abstract class Circle extends Shapes {
	float R;
	public Circle(float R) {
		this.R = R;
	}
	public Circle() {
		this(0.0F);
	}
	public double getArea() {
		return Math.PI*Math.pow(R, 2);
	}
	public String toString() {
		return "Area is: " + this.getArea();
	}
}
