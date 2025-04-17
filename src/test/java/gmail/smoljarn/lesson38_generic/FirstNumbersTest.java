package gmail.smoljarn.lesson38_generic;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNumbersTest {
    @Test
    void shouldFirstNumber() {
        //given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4);
        //when
        List<Integer> result = FirstNumbers.getFirstNumbers(numbers);
        //then
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, result);
    }
}