package Javamission._10;

public class Trapezoid {
	double top; 
	double bottom; 
	double height;
	public Trapezoid() {
	}
	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	public double getArea() {
		double area = (top+bottom) * height / 2; 
		return area;
	}
	
	
	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	} 
	
	
}
