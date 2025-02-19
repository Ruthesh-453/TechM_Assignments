package generic_package;

import java.util.Arrays;

public class GenericArrayComparator {

    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1 == array2) {
            return true;
        }

        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};

        String[] strArr1 = {"apple", "banana", "cherry"};
        String[] strArr2 = {"apple", "banana", "grape"};

        System.out.println("Integer Arrays Equal: " + areArraysEqual(arr1, arr2)); 
        System.out.println("String Arrays Equal: " + areArraysEqual(strArr1, strArr2)); 

    }
}

