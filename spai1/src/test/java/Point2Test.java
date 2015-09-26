import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Point2Test {

	private Point pt;
	
	 @Before
	    public void before() {
	        pt = new Point(2, 3);
	    }
	
	@Test
    public void testTranslate2() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }
	
	 @Test
	    public void testPunto() {
	        pt = new Point();
	        assertEquals(0, pt.getX());
	        assertEquals(0, pt.getY());
	    }
	 
	 @Test
	    public void testFailPunto() {
	        assertNotEquals(12, pt.getX());
	        assertNotEquals(33, pt.getY());
	    }
	 
	 @Test
	    public void testNotNull() {
		 
	        assertNotNull(pt);
	    }
	 
	 @Test
	    public void testNull() {
	     pt = null;   
		 assertNull(pt);
	    }
	 
	 @Test
	    public void testSame() {
	     Point p1 = new Point();
	     Point p2 = new Point();
	     
	     p1 = p2;
	     
	     assertSame(p1, p2);
	    }



}
