
public class TrianglePyramid extends TriangleArea {
	private double slantLength;
	private double area;
	public TrianglePyramid(double base, double height, double length) {
		super(base, height);
		slantLength=length;
		
		
	}
	public void calculateArea()
	{
		super.calculateArea();
		
		area = (super.getBase()*super.getHeight()) +(slantLength*3*super.getBase());
	}
	public String toString()
	{
		return (super.toString()+  " Triangular Pyramid surface area is "+area);
	}

}
