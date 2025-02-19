package org1;
import java.util.Arrays;
import java.util.Scanner;

public class task2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        int[][] marks = new int[n][];
        int[] totalMarks = new int[n];
        double[] averageMarks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();

            marks[i] = new int[subjects]; 
            System.out.print("Enter marks for " + subjects + " subjects: ");
            int total = 0;
            for (int j = 0; j < subjects; j++) {
                marks[i][j] = scanner.nextInt();
                total += marks[i][j];
            }
            scanner.nextLine(); 

            totalMarks[i] = total;
            averageMarks[i] = (double) total / subjects;
        }

  
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (totalMarks[i] < totalMarks[j]) { 
                	
                    int tempMarks = totalMarks[i];
                    totalMarks[i] = totalMarks[j];
                    totalMarks[j] = tempMarks;

                    double tempAvg = averageMarks[i];
                    averageMarks[i] = averageMarks[j];
                    averageMarks[j] = tempAvg;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;

                    int[] tempArray = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempArray;
                }
            }
        }

        System.out.println("\nSorted List of Students (By Total Marks in Descending Order):");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Total Marks: " + totalMarks[i]);
            System.out.println("Average Marks: " + String.format("%.2f", averageMarks[i]));
            System.out.println("----------------------------------");
        }

        scanner.close();
	}
}




