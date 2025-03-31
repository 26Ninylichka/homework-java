package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldDoSquareArea() {
        //given
        Square square = new Square(5);
        //when
        double expectedArea = 5 * 5;
        //then
        assertEquals(expectedArea, square.calculateArea(), "The area of the square is correct");
    }
  
}