
public class TriangleApp {
	public static void main(String[] args) {
		TriangleArea triangleArea = new TriangleArea(1,0.87);
		triangleArea.calculateArea();
		System.out.println(triangleArea.toString());
		
		
		TrianglePyramid trianglePyramid = new TrianglePyramid(1, 0.87, 1);
		trianglePyramid.calculateArea();
		System.out.println(trianglePyramid.toString());
		
	}
}
