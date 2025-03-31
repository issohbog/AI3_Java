package Javamission._10;

public class Circle {
	

	
	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	} 
	
	public double getArea() {
		double area = Math.PI * (radius) * (radius); 
		return area;
	}

	@Override
	public String toString() {
		return "Circle [PI=" + Math.PI + ", radius=" + radius + "]";
	}
	
	
}
