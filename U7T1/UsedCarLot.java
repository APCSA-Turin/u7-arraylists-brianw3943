package U7T1;

import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory = new ArrayList<Car>();
    
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car car) {
        inventory.add(car);
    }
    public boolean swap(int idx1, int idx2) {
        if ((idx1 < 0 || idx1 >= inventory.size()) || (idx2 < 0 || idx2 >= inventory.size())) {
            return false;
        } else {
            Car car1 = inventory.get(idx1);
            Car car2 = inventory.get(idx2);
            inventory.set(idx2, car1);
            inventory.set(idx1, car2);
            return true;
        }
    }
}
