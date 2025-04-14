package gmail.smoljarn.collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static double getSum(List<Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
    public static List<Long> multiplyOddNumber(List<Number> numbers) {
        List<Long> result = new ArrayList<>();
        for (Number num : numbers) {
            long value = num.longValue();
            if (value % 2 !=0) {
                result.add(value * 2);
            }
        }
        return result;
    }
}
