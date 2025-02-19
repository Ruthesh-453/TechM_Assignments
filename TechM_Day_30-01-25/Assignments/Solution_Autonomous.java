package arrays;

import java.util.*;

class AutonomousCar {
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
        this.carId = carId;
        this.brand = brand;
        this.noOfTestsConducted = noOfTestsConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = ""; 
    }

    public int getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public int getNoOfTestsConducted() {
        return noOfTestsConducted;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class Solution_Autonomous {
    public static int findTestPassedByEnv(AutonomousCar[] cars, String environment) {
        int totalPassed = 0;
        for (AutonomousCar car : cars) {
            if (car.getEnvironment().equalsIgnoreCase(environment)) {
                totalPassed += car.getNoOfTestsPassed();
            }
        }
        return totalPassed;
    }

    public static AutonomousCar updateCarGrade(AutonomousCar[] cars, String brand) {
        for (AutonomousCar car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                int rating = (car.getNoOfTestsPassed() * 100) / car.getNoOfTestsConducted();
                String grade = (rating >= 80) ? "A1" : "B2";
                car.setGrade(grade);
                return car;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AutonomousCar[] cars = new AutonomousCar[4];

        for (int i = 0; i < 4; i++) {
            int carId = Integer.parseInt(scanner.nextLine());
            String brand = scanner.nextLine();
            int noOfTestsConducted = Integer.parseInt(scanner.nextLine());
            int noOfTestsPassed = Integer.parseInt(scanner.nextLine());
            String environment = scanner.nextLine();
            cars[i] = new AutonomousCar(carId, brand, noOfTestsConducted, noOfTestsPassed, environment);
        }

        String searchEnvironment = scanner.nextLine();
        String searchBrand = scanner.nextLine();
        scanner.close();

        int totalTestsPassed = findTestPassedByEnv(cars, searchEnvironment);
        if (totalTestsPassed > 0) {
            System.out.println(totalTestsPassed);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }

        AutonomousCar resultCar = updateCarGrade(cars, searchBrand);
        if (resultCar != null) {
            System.out.println(resultCar.getBrand() + "::" + resultCar.getGrade());
        } else {
            System.out.println("No Car is available with the specified brand");
        }
    }
}
