package gmail.smoljarn.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

        double sum = NumberUtils.getSum(numbers);
        System.out.println("Сумма чисел: " + sum);
        List<Long> multipliedOdds = NumberUtils.multiplyOddNumber(numbers);
        System.out.println("Непарні числа  * 2:" + multipliedOdds);
    }
}
