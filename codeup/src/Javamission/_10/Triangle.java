package Javamission._10;

public class Triangle {
	double width; 
	double height;
	
	public Triangle() {
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = width * height / 2; 
		return area;	
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
	

	
}
