package generic_package;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseListGeneric {

    public static <T> List<T> reverseList(List<T> list) {
        if (list == null) {
            return null;
        }

        List<T> reversedList = new ArrayList<>(list); 
        Collections.reverse(reversedList); 
        return reversedList;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<String> strList = List.of("apple", "banana", "cherry", "date");

        System.out.println("Original intList: " + intList);
        System.out.println("Reversed intList: " + reverseList(intList));

        System.out.println("Original strList: " + strList);
        System.out.println("Reversed strList: " + reverseList(strList));
    }
}
