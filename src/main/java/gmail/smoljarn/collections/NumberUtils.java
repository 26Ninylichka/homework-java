package gmail.smoljarn.collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static int getSum(List<Number> numbers) {
        int sum = 0;
        for (Number num : numbers) {
            sum += num.intValue();
        }
        return sum;
    }
    public static List<Integer> multiplyOddNumber(List<Number> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Number num : numbers) {
            int value = num.intValue();
            if (value % 2 !=0) {
                result.add(value * 2);
            }
        }
        return result;
    }
}
