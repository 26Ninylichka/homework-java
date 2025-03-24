package gmail.smoljarn.lesson18;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void shouldDoCanDrive(){
        //given

        Car car = new Car(60, 6, LocalDate.of(2025,6,12));

        //when

       boolean canDrive = car.canDrive();

        //then

       assertEquals(true, canDrive);
    }
}