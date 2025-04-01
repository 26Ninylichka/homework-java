package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldDoRectangleArea() {
        //given
        Rectangle rectangle = new Rectangle(5, 5);
        //when
        rectangle.calculateArea();
        //then
        assertEquals(5, 5, rectangle.calculateArea());
    }

}