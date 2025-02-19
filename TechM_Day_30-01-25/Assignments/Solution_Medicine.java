package arrays;

import java.util.*;

class Medicine {
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price) {
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Solution_Medicine {

    public static List<Integer> getPriceByDisease(Medicine[] medicines, String disease) {
        List<Integer> prices = new ArrayList<>();
        
        for (Medicine medicine : medicines) {
            if (medicine.getDisease().equalsIgnoreCase(disease)) {
                prices.add(medicine.getPrice());
            }
        }
        
        Collections.sort(prices);
        
        return prices;
    }

    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[4];
        
        medicines[0] = new Medicine("dolo650", "FAC124W", "fever", 100);
        medicines[1] = new Medicine("paracetamol", "PAC545B", "bodypain", 150);
        medicines[2] = new Medicine("almox", "ALM747S", "fever", 200);
        medicines[3] = new Medicine("aspirin", "ASP849Q", "flu", 250);

        String disease = "fever";
 
        List<Integer> result = Solution_Medicine.getPriceByDisease(medicines, disease);
        
        for (int price : result) {
            System.out.println(price);
        }
    }
}
