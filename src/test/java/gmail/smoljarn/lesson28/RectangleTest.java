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
        assertEquals(25, shape.calculateArea());
        assertEquals(40, shape.calculatePerimeter());
    }

}