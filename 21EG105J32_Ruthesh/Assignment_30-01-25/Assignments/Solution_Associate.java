package arrays;

import java.util.*;

class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }

    public int getId() {
        return id;
    }

    public String getTechnology() {
        return technology;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
}

class Solution_Associate {
    public static Associate[] associatesForGivenTechnology(Associate[] associates, String searchTechnology) {
        List<Associate> filteredList = new ArrayList<>();

        for (Associate associate : associates) {
            if (associate.getTechnology().equalsIgnoreCase(searchTechnology) &&
                associate.getExperienceInYears() % 5 == 0) {
                filteredList.add(associate);
            }
        }

        return filteredList.toArray(new Associate[0]); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Associate[] associates = new Associate[5];

        for (int i = 0; i < 5; i++) {
            int id = Integer.parseInt(scanner.nextLine());
            String name = scanner.nextLine();
            String technology = scanner.nextLine();
            int experienceInYears = Integer.parseInt(scanner.nextLine());
            associates[i] = new Associate(id, name, technology, experienceInYears);
        }

        String searchTechnology = scanner.nextLine();
        scanner.close();

        Associate[] result = associatesForGivenTechnology(associates, searchTechnology);

        for (Associate associate : result) {
            System.out.println(associate.getId());
        }
    }
}

