package org1;
import java.util.Objects;

public class task3 {
	public static void main(String args[]) {
		Integer a = 10;
        Integer b = 10;
        System.out.println("Objects.equals(a, b): " + Objects.equals(a, b));   
        System.out.println("Objects.deepEquals(a, b): " + Objects.deepEquals(a, b)); 

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};

        System.out.println("Objects.equals(arr1, arr2): " + Objects.equals(arr1, arr2)); 
        System.out.println("Objects.deepEquals(arr1, arr2): " + Objects.deepEquals(arr1, arr2)); 
	}
}
