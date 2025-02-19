package arrays;
import java.util.*;

class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold) {
        this.inventoryId = inventoryId;
        this.maximumQuantity = maximumQuantity;
        this.currentQuantity = currentQuantity;
        this.threshold = threshold;
    }

    public String getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(String inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}

class Solution {
    public static Inventory[] replenish(Inventory[] inventories, int limit) {
        List<Inventory> result = new ArrayList<>();
        
        for (Inventory inventory : inventories) {
            if (inventory.getThreshold() <= limit) {
                result.add(inventory);
            }
        }

        return result.toArray(new Inventory[0]);
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory[] inventories = new Inventory[4];
        for (int i = 0; i < 4; i++) {
            String inventoryId = scanner.nextLine().trim();
            int maxQuantity = Integer.parseInt(scanner.nextLine().trim());
            int currentQuantity = Integer.parseInt(scanner.nextLine().trim());
            int threshold = Integer.parseInt(scanner.nextLine().trim());
            
            inventories[i] = new Inventory(inventoryId, maxQuantity, currentQuantity, threshold);
        }

        int limit = Integer.parseInt(scanner.nextLine().trim());
 
        Inventory[] replenishedInventories = Solution.replenish(inventories, limit);
        
        for (Inventory inventory : replenishedInventories) {
            if (inventory.getThreshold() > 75) {
                System.out.println(inventory.getInventoryId() + " Critical Filling");
            } else if (inventory.getThreshold() >= 50 && inventory.getThreshold() <= 75) {
                System.out.println(inventory.getInventoryId() + " Moderate Filling");
            } else {
                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");
            }
        }

        scanner.close();
    }
}