package generic_package;

import java.util.List;
import java.util.ArrayList;

public class MergeAlternatingLists {

    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergedList.add(list1.get(i));
            }
            if (i < size2) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> intList1 = List.of(1, 3, 5);
        List<Integer> intList2 = List.of(2, 4, 6, 8, 10);

        List<String> strList1 = List.of("apple", "banana", "cherry");
        List<String> strList2 = List.of("date", "fig", "grape", "kiwi");

        System.out.println("Merged Integer List: " + mergeAlternating(intList1, intList2));
        System.out.println("Merged String List: " + mergeAlternating(strList1, strList2));
    }
}
