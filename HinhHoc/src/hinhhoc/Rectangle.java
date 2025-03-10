package hinhhoc;

public abstract class Rectangle extends Shapes {
	float chieuDai;
	float chieuRong;
	public Rectangle(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public Rectangle() {
		this(0.0F, 0.0F);
	}
	@Override
	public double getArea() {
		return this.chieuDai*this.chieuRong;
	}
	@Override
	public String toString() {
		return "Area is: " + this.getArea();
	}
}
