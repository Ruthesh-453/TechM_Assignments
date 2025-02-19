package generic_package;

import java.util.List;

public class FindElementIndex {

    public static <T> int findFirstIndex(List<T> list, T target) {
        if (list == null || target == null) {
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20, 30, 40, 50, 30);
        List<String> strList = List.of("apple", "banana", "cherry", "banana");

        System.out.println("Index of 30 in intList: " + findFirstIndex(intList, 30)); 
        System.out.println("Index of 'banana' in strList: " + findFirstIndex(strList, "banana")); 
    }
}

