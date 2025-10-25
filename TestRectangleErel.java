package B07Lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangleErel{
    //IsSquare Tests
    @Test
    void testisSquare1(){
        //all three are true
        Rectangle r = new Rectangle(new Point(0,0), new Point(0,1), new Point(1,1), new Point(1,0));
        
        assertTrue(r.isSquare());
    }
    @Test
    void testisSquare2(){
        // first is true
	    Rectangle r = new Rectangle(new Point(0.0, 0.0), new Point(0, 2), new Point(1, 2), new Point(1, 0));
        assertFalse(r.isSquare());
    }
    @Test
    void testisSquare5(){
        //first and second are true
    	Rectangle r = new Rectangle(new Point(0.0, 0.0), new Point(0, 2), new Point(3, 2), new Point(3, 0));
        assertFalse(r.isSquare());

    }
   @Test
    void testisSquare8(){
        //none are true
	    Rectangle r = new Rectangle(new Point(0.0, 0.0), new Point(0, 1), new Point(2, 2), new Point(3, 0)); 
        assertFalse(r.isSquare());
   }
}