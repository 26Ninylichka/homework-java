package gmail.smoljarn.collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    void  schoulDoGetSumNumbersTyList() {
        //given
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        //when
        int expectedSum = 28;
        //then
        assertEquals(28, 28, NumberUtils.getSum(numbers));
    }
    @Test
    void schoulDoMultiplyOddNumber(){
        //given
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        //when
        List<Integer> expected = List.of(2, 6, 10, 14);
        //Then
        assertEquals(expected, NumberUtils.multiplyOddNumber(numbers));
    }
    @Test
    void schouldDoMultiplyOddNumberWithNoAdds() {
        //given
        List<Number> numbers = List.of( 2, 4, 6, 8);
        //when
        List<Integer> expected = List.of();
        //then
        assertEquals(expected, NumberUtils.multiplyOddNumber(numbers));
    }

}