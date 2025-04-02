package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldDoSquareArea() {
        //given
        Shape shape = new Square(5);
        //when
        shape.calculateArea();
        shape.calculatePerimeter();
        //then
        assertEquals(5, 5,  shape.calculateArea());
        assertEquals(5, 5, shape.calculatePerimeter());
    }
  
}