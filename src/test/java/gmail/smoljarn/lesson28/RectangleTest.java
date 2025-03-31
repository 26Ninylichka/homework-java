package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void shouldDoRectangleArea() {
        //given
        Rectangle rectangle = new Rectangle(5, 5);
        //when
        double expectedArea = 5 * 5;
        //then
        assertEquals(expectedArea, rectangle.calculateArea(), "The area of the rectangle is correct");
    }

}