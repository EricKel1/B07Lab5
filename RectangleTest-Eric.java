package B07Lab5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    public void testPerimeterSimpleSquare() {
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        Point c = new Point(5, 5);
        Point d = new Point(0, 5);
        
        Rectangle square = new Rectangle(a, b, c, d);
        
        double expected = 20.0;
        double actual = square.perimeter();
        
        assertEquals(expected, actual, "Perimeter of a 5x5 square should be 20.0");
    }

    @Test
    public void testPerimeterSimpleRectangle() {
        Point a = new Point(0, 0);
        Point b = new Point(10, 0);
        Point c = new Point(10, 3);
        Point d = new Point(0, 3);
        
        Rectangle rect = new Rectangle(a, b, c, d);
        
        double expected = 26.0;
        double actual = rect.perimeter();
        
        assertEquals(expected, actual, "Perimeter of a 10x3 rectangle should be 26.0");
    }

    @Test
    public void testPerimeterRectangleWithNegativeCoords() {
        Point a = new Point(-2, -1);
        Point b = new Point(3, -1); 
        Point c = new Point(3, 1);  
        Point d = new Point(-2, 1); 
        
        Rectangle rect = new Rectangle(a, b, c, d);
        
        double expected = 14.0;
        double actual = rect.perimeter();
        
        assertEquals(expected, actual, "Perimeter of a 5x2 rectangle with negative coordinates should be 14.0");
    }

    @Test
    public void testPerimeterZeroAreaRectangle() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 1); 
        Point c = new Point(5, 1);
        Point d = new Point(1, 1);
        
        Rectangle line = new Rectangle(a, b, c, d);
        
        double expected = 8.0;
        double actual = line.perimeter();
        
        assertEquals(expected, actual, "Perimeter of a zero-area rectangle (line) should be 8.0");
    }
}
