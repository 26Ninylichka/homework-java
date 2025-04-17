package gmail.smoljarn.lesson38_generic;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapsTest {
    @Test
    void shouldMergeTwoMaps() {
        //given
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("яблоко", 2);
        map1.put("вишня", 5);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("вишня",5);
        map2.put("арбуз",1);
        //when
        Map<String, Integer> result = Maps.mergeMaps(map1, map2);
        //then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("арбуз", 1);
        expected.put("вишня", 10);
        expected.put("яблоко", 2);
        assertEquals(expected, result);
    }


}