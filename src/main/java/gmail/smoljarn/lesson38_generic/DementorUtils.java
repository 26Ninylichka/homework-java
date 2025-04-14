package gmail.smoljarn.lesson38_generic;

import java.util.*;

public class DementorUtils {
    public static List<Integer> getUniquePreservingOrder (List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (!seen.contains(number)) {
                seen.add(number);
                result.add(number);
            }
        }
       return result;
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }
}
