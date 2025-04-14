package gmail.smoljarn.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    void schoulGetSumNumbersTyList() {
        //given
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        double expectedSum = 28;
        //when
        double actualSum = NumberUtils.getSum(numbers);
        //then
        assertEquals(expectedSum, actualSum);
    }
    @Test
    void schoulMultiplyOddNumber(){
        //given
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Long> expected = List.of(2l, 6l, 10l, 14l);
        //when
        List<Long> actual = NumberUtils.multiplyOddNumber(numbers);
        //Then
        assertEquals(expected, actual);
    }
    @Test
    void schouldMultiplyOddNumberWithNoAdds() {
        //given
        List<Number> numbers = List.of(2, 4, 6, 8);
        List<Integer> expected = List.of();

        //when
        List<Long> actual = NumberUtils.multiplyOddNumber(numbers);

        //then
        assertEquals(expected, actual);
    }

}