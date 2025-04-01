package gmail.smoljarn.lesson28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void shouldDoCircleArea() {
        //given
        Shape shape = new Circle(6);
        //when
        shape.calculateArea ();
        shape.calculatePerimeter();

        //then
       assertEquals(6, 6, shape.calculateArea(), "Ales gut))");
       assertEquals(6, 6,shape.calculatePerimeter(), "Ales gut))");
    }

}