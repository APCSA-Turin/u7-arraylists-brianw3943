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
    // ADD THE FOLLOWING FOUR NEW METHODS TO YOUR UsedCarLot CLASS

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */
    public void addCar(int indexToAdd, Car carToAdd) {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifts the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1
        
        Returns the Car that is being "sold" (removed from lot)
        
        PRECONDITION: indexOfCarToSell < inventory.size()
        
        HINT: the ArrayList remove() method returns the removed element while also
        removing it from the ArrayList
        */
    public Car sellCarShift(int indexOfCarToSell) {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
        but instead of removing it and shifting the inventory
        list to the left, REPLACE the Car at indexOfCarToSell
        with NULL, thus creating an "empty parking spot" on the lot;
        this method does NOT reduce the size of inventory by 1
    
        PRECONDITION: indexOfCarToSell < inventory.size()
    
        This method returns the Car that is being "sold" (replaced with null)
    */
    public Car sellCarNoShift(int indexOfCarToSell) {
        return inventory.set(indexOfCarToSell, null);
    }

    /* moves Car out of index indexOfCarToMove and moves it to destinationIndex;
        when the Car first gets moved out of indexOfCarToMove, all cars to the
        right should shift one index to the left; when the Car then gets moved into
        destinationIndex, the Car currently at that index and all Cars to the right
        of that index should shift one to the right
        
        PRECONDITIONS: indexOfCarToMove < inventory.size()
                        destinationIndex < inventory.size()
    */
    public void moveCar(int indexOfCarToMove, int destinationIndex) {
        Car temp = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, temp);
    }

}