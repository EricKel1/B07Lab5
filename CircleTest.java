import org.junit.Test; 
import static org.junit.Assert.*;

public class CircleTest{
	
	@Test
	public void testgetcenter(){
		Point p = new Point(0, 0); 
		Circle c = new Circle(p, 5.0); 
		assertEquals(p, c.getCenter());
	}

	@Test
	public void testgetradius(){
		Circle c = new Circle(new Point(1, 1), 3.0); 
		assertEquals(3.0, c.getRadius(), 0.0001);
	}

	
	@Test
	public void testgetarea(){
		Circle c = new Circle(new Point(0, 0), 2.0); 
		double expected = Math.PI * 2.0 * 2.0; 
		assertEquals(expected, c.getArea(), 0.0001);
	}
	
	@Test
	public void testGetPerimeter(){ 
		Circle c = new Circle(new Point(0, 0), 2.0); 
		double expected = 2 * Math.PI * 2.0; 
		assertEquals(expected, c.getPerimeter(), 0.0001);
	}
	
}	

