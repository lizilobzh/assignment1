package homeworks.hw1.scooter;
import java.util.ArrayList;
import java.util.List;
import homeworks.hw1.scooter.Scooter;

/**
 * Represents a rental company that manages a fleet of scooters.
 */
public class RentalCompany {

    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    /**
     * Returns a list of available scooters in the fleet.
     *
     * @return A list of available scooters
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a new scooter to the rental company's fleet.
     *
     * @param scooter The scooter to be added
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the rental company's fleet based on its ID.
     *
     * @param id The ID of the scooter to be removed
     * @return True if the scooter was successfully removed, false otherwise
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter from the rental company's fleet based on its ID.
     *
     * @param id The ID of the scooter to be rented
     */
    public void rentScooter(int id) {
        // Implement logic to rent a scooter
    }

    /**
     * Returns a rented scooter back to the rental company's fleet.
     *
     * @param id The ID of the scooter to be returned
     * @param x  The X-coordinate of the return location
     * @param y  The Y-coordinate of the return location
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooter.setAvailable(true);
                scooter.setX(x); // Call setX method on the scooter object
                scooter.setY(y); // Call setY method on the scooter object
                System.out.println("Scooter with ID " + id + " has been returned.");
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " does not exist in the fleet.");
    }

    /**
     * Displays information about all scooters in the rental company's fleet.
     */
    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}


