package arrays;

import java.util.Scanner;

class Institution {
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced,
                       int noOfStudentsCleared, String location) {
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentsPlaced = noOfStudentsPlaced;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
        this.grade = ""; 
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentsPlaced() {
        return noOfStudentsPlaced;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public String getLocation() {
        return location;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

public class Solution_Institution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Institution[] institutions = new Institution[4];

        for (int i = 0; i < 4; i++) {
            int institutionId = Integer.parseInt(scanner.nextLine().trim());
            String institutionName = scanner.nextLine().trim();
            int noOfStudentsPlaced = Integer.parseInt(scanner.nextLine().trim());
            int noOfStudentsCleared = Integer.parseInt(scanner.nextLine().trim());
            String location = scanner.nextLine().trim();
            institutions[i] = new Institution(institutionId, institutionName, noOfStudentsPlaced, noOfStudentsCleared, location);
        }

        String searchLocation = scanner.nextLine().trim();
        String searchInstitutionName = scanner.nextLine().trim();
        scanner.close();

        int totalClearance = findNumClearancedByLoc(institutions, searchLocation);
        if (totalClearance > 0) {
            System.out.println(totalClearance);
        } else {
            System.out.println("There are no cleared students in this particular location");
        }

        Institution institution = updateInstitutionGrade(institutions, searchInstitutionName);
        if (institution != null) {
            System.out.println(institution.getInstitutionName() + "::" + institution.getGrade());
        } else {
            System.out.println("No Institute is available with the specified name");
        }
    }

    public static int findNumClearancedByLoc(Institution[] instArray, String location) {
        int total = 0;
        for (Institution institution : instArray) {
            if (institution.getLocation().equalsIgnoreCase(location)) {
                total += institution.getNoOfStudentsCleared();
            }
        }
        return total;
    }

    public static Institution updateInstitutionGrade(Institution[] instArray, String instName) {
        for (Institution institution : instArray) {
            if (institution.getInstitutionName().equalsIgnoreCase(instName)) {
                int rating = (institution.getNoOfStudentsPlaced() * 100) / institution.getNoOfStudentsCleared();
                if (rating >= 80) {
                    institution.setGrade("A");
                } else {
                    institution.setGrade("B");
                }
                return institution;
            }
        }
        return null;
    }
}
