package gmail.smoljarn.lesson38_generic;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> List = java.util.List.of(1, 2, 4, 3, 1);
        System.out.println(DementorUtils.getUniquePreservingOrder(List));

        Map<String, Integer> map1 = Map.of("n", 2, "m", 3);
        Map<String, Integer> map2 = Map.of("b", 4, "c", 5);
        System.out.println(DementorUtils.mergeMaps(map1, map2));
    }
}