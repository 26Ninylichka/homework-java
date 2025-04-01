package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldDoRectangleArea() {
        //given
        Shape shape = new Rectangle(5, 5);
        //when
        shape.calculateArea();
        shape.calculatePerimeter();
        //then
        assertEquals(5, 5, shape.calculateArea(),"Ales gut))");
        assertEquals(5, 5, shape.calculatePerimeter(), "Ales gut))");
    }

}