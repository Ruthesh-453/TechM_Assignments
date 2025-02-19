package generic_package;

import java.util.List;

public class SumEvenOddNumbers {

    public static <T extends Number> int[] sumEvenOdd(List<T> numbers) {
        int sumEven = 0;
        int sumOdd = 0;

        for (T num : numbers) {
            int value = num.intValue(); 
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }

        return new int[]{sumEven, sumOdd};
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubleList = List.of(2.5, 3.0, 4.5, 6.0, 7.0, 8.0);

        int[] intSums = sumEvenOdd(intList);
        int[] doubleSums = sumEvenOdd(doubleList);

        System.out.println("Integer List: Sum of Even = " + intSums[0] + ", Sum of Odd = " + intSums[1]);
        System.out.println("Double List: Sum of Even = " + doubleSums[0] + ", Sum of Odd = " + doubleSums[1]);
    }
}
