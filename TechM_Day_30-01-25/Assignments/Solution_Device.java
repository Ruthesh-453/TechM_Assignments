package arrays;

import java.util.Scanner;

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}

public class Solution_Device {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone[] phones = new Phone[4];
        for (int i = 0; i < 4; i++) {
            int phoneId = Integer.parseInt(scanner.nextLine().trim());
            String os = scanner.nextLine().trim();
            String brand = scanner.nextLine().trim();
            int price = Integer.parseInt(scanner.nextLine().trim());
            phones[i] = new Phone(phoneId, os, brand, price);
        }

        String searchBrand = scanner.nextLine().trim();
        String searchOs = scanner.nextLine().trim();
        scanner.close();

        int totalPrice = findPriceForGivenBrand(phones, searchBrand);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone phone = getPhoneIdBasedOnOs(phones, searchOs);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int total = 0;
        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                total += phone.getPrice();
            }
        }
        return total;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}
