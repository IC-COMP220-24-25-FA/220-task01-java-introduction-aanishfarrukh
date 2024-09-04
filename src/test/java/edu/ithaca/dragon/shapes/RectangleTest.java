package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void constructorErrorTest() {
        // IllegalArgumentException is thrown when width or height is zero or negative
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, 0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -1));
    }

    @Test
    public void calcAreaTest() {
        Rectangle myRectangle = new Rectangle(2, 3);
        assertEquals(6, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(5, 7);
        assertEquals(35, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(0.5, 1.5);
        assertEquals(0.75, myRectangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSizeTest() {
        Rectangle myRectangle1 = new Rectangle(2, 3);
        myRectangle1.doubleSize();
        
        assertEquals(4, myRectangle1.getWidth(), 0.0001);
        assertEquals(6, myRectangle1.getLength(), 0.0001);

        // just adding this to ensure the sizes are updated properly or not
        assertEquals(24, myRectangle1.calcArea());
    }

    @Test
    public void longestLineWithinTest() {
        Rectangle myRectangle = new Rectangle(3, 4);
        assertEquals(5, myRectangle.longestLineWithin(), 0.0001);

        myRectangle = new Rectangle(5, 12);
        assertEquals(13, myRectangle.longestLineWithin(), 0.0001);
        
        myRectangle = new Rectangle(1, 1);
        assertEquals(Math.sqrt(2), myRectangle.longestLineWithin(), 0.0001);
    }
}
