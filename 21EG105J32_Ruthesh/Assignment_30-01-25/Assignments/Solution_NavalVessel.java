package arrays;

import java.util.Scanner;

class NavalVessel {
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;
    
    public NavalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
        this.purpose = purpose;
        this.classification = ""; 
    }

    public int getVesselId() {
        return vesselId;
    }

    public void setVesselId(int vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public int getNoOfVoyagesPlanned() {
        return noOfVoyagesPlanned;
    }

    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned) {
        this.noOfVoyagesPlanned = noOfVoyagesPlanned;
    }

    public int getNoOfVoyagesCompleted() {
        return noOfVoyagesCompleted;
    }

    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted) {
        this.noOfVoyagesCompleted = noOfVoyagesCompleted;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}

class Solution_NavalVessel {

   
    public static int findAvgVoyagesByPct(NavalVessel[] vessels, int percentage) {
        int totalCompleted = 0;
        int count = 0;

        for (NavalVessel vessel : vessels) {
            int completedPercentage = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
            if (completedPercentage >= percentage) {
                totalCompleted += vessel.getNoOfVoyagesCompleted();
                count++;
            }
        }

        return count > 0 ? totalCompleted / count : 0;
    }

    public static NavalVessel findVesselByGrade(NavalVessel[] vessels, String purpose) {
        for (NavalVessel vessel : vessels) {
            if (vessel.getPurpose().equalsIgnoreCase(purpose)) {
   
                int percentage = (vessel.getNoOfVoyagesCompleted() * 100) / vessel.getNoOfVoyagesPlanned();
                
                if (percentage == 100) {
                    vessel.setClassification("Star");
                } else if (percentage >= 80) {
                    vessel.setClassification("Leader");
                } else if (percentage >= 55) {
                    vessel.setClassification("Inspirer");
                } else {
                    vessel.setClassification("Striver");
                }
                return vessel;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NavalVessel[] vessels = new NavalVessel[4];

        for (int i = 0; i < 4; i++) {
            int vesselId = scanner.nextInt();
            String vesselName = scanner.next();
            int noOfVoyagesPlanned = scanner.nextInt();
            int noOfVoyagesCompleted = scanner.nextInt();
            String purpose = scanner.next();
            vessels[i] = new NavalVessel(vesselId, vesselName, noOfVoyagesPlanned, noOfVoyagesCompleted, purpose);
        }

        int percentage = scanner.nextInt();
        String purpose = scanner.next();

        int avgVoyages = Solution_NavalVessel.findAvgVoyagesByPct(vessels, percentage);
        if (avgVoyages > 0) {
            System.out.println(avgVoyages);
        } else {
            System.out.println("No vessels found with the specified percentage requirement");
        }

        NavalVessel vessel = Solution_NavalVessel.findVesselByGrade(vessels, purpose);
        if (vessel != null) {
            System.out.println(vessel.getVesselName() + "%" + vessel.getClassification());
        } else {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }

        scanner.close();
    }
}

