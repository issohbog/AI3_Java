package Javamission._10;

public class Rectangle {
	double width; 
	double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	} 
	
	
	public double getArea() {
		double area = width * height;
		return area;
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
