package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldDoCircleArea() {
        //given
        Circle circle = new Circle(6);
        //when
        double expectedArea = Math.PI * 6 * 6;
        //then
        assertEquals(expectedArea, circle.calculateArea(), "The area of the circle is correct");
    }

}