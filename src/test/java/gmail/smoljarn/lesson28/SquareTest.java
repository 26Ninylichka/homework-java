package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldDoSquareArea() {
        //given
        Square square = new Square(5);
        //when
        square.calculateArea();
        //then
        assertEquals(5, 5, square.calculateArea());
    }
  
}