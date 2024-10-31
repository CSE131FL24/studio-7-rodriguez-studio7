package studio7;

public class RectangleTest {
	   public static void main(String[] args) {
	        // Test 1: Create rectangle objects
	        Rectangle rect1 = new Rectangle(4, 5); // Length = 4, Width = 5
	        Rectangle rect2 = new Rectangle(3, 3); // Length = 3, Width = 3

	        // Test 2: Test getArea() method
	        System.out.println("Test getArea():");
	        System.out.println("Expected area of rect1 (4*5): 20");
	        System.out.println("Actual area of rect1: " + rect1.Area());

	        System.out.println("Expected area of rect2 (3*3): 9");
	        System.out.println("Actual area of rect2: " + rect2.Area());

	        // Test 3: Test getPerimeter() method
	        System.out.println("\nTest getPerimeter():");
	        System.out.println("Expected perimeter of rect1 (2*(4+5)): 18");
	        System.out.println("Actual perimeter of rect1: " + rect1.Perimeter());

	        System.out.println("Expected perimeter of rect2 (2*(3+3)): 12");
	        System.out.println("Actual perimeter of rect2: " + rect2.Perimeter());

	        // Test 4: Test isSquare() method
	        System.out.println("\nTest isSquare():");
	        System.out.println("Expected result for rect1: false");
	        System.out.println("Actual result for rect1: " + rect1.IsSquare());

	        System.out.println("Expected result for rect2: true");
	        System.out.println("Actual result for rect2: " + rect2.IsSquare());

	        // Test 5: Test isSmallerThan() method
	        System.out.println("\nTest isSmallerThan():");
	        System.out.println("Expected result for rect1.isSmallerThan(rect2): false");
	        System.out.println("Actual result: " + rect1.isSmallerThan(rect2));

	        System.out.println("Expected result for rect2.isSmallerThan(rect1): true");
	        System.out.println("Actual result: " + rect2.isSmallerThan(rect1));
	        
	        rect1.draw(5, 5);
	    }
}
