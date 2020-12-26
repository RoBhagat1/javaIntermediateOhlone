
public class TriangleArea {
	private double base;
	private double height;
	private double area;
	
	public TriangleArea(double base, double height)
	{
		this.base=base;
		this.height = height;
	}
	public double getArea()
	{
		return area;
	}
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}
	
	public void calculateArea()
	{
		area= ((base*height)/2);
	}
	
	public String toString()  
	{ 
		return("Triangle Area is "+area); 
	}  
}
