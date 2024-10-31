package studio7;
import edu.princeton.cs.introcs.StdDraw;

/**
 * Provides the required classes (perimeter, area, a comparison and sqare)
 */
public class Rectangle {
	/**
	 * First getting length and width to use later
	 */
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;	
	}
	/**
	 * getting the perimiter by multipling the the sum of the length and width by 2 
	 * @return
	 */
	public double Perimeter() {
		return 2*(length + width);
	}
	/**
	 * gets area by mutiplying length and width
	 * @return
	 */
	public double Area() {
		return length* width;
	}
	/**
	 * compares the two areas to see what is bigger
	 * @param other
	 * @return
	 */
	public boolean isSmallerThan(Rectangle other) {
	    return this.Area() < other.Area();
	}
	/**
	 * sees if it is square by checking if length and width are equal
	 * @return
	 */
	public boolean IsSquare() {
		return length == width;
	}
	
	public void draw(double x,double y) {
		StdDraw.setXscale(0, 10); 
		StdDraw.setYscale(0, 10);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.rectangle(x, y, width / 2, length / 2);
		
	}
}
