package gmail.smoljarn.lesson38_generic;

import java.util.ArrayList;
import java.util.List;

public class FirstNumbers {
    public static List<Integer> getFirstNumbers(List<Integer> numbers) {

        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
