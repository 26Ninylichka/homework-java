package gmail.smoljarn.lesson38_generic;
import java.util.*;

import static gmail.smoljarn.lesson38_generic.FirstNumbers.getFirstNumbers;
import static gmail.smoljarn.lesson38_generic.Maps.mergeMaps;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4);
        System.out.println(getFirstNumbers(numbers));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("яблоко", 2);
        map1.put("вишня", 5);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("вишня",5);
        map2.put("арбуз",1);

        Map<String, Integer> result = mergeMaps(map1, map2);
        System.out.println(result);
    }
}