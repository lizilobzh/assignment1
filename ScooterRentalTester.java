package homeworks.hw1.scooter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Tester class for renting and using scooters.
 */
public class ScooterRentalTester {

    public static void main(String[] args) {
        // Create a rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Add some scooters to the rental company's fleet
        rentalCompany.addScooter(new Scooter());
        rentalCompany.addScooter(new Scooter());

        // Rent a scooter from the rental company (assuming scooter with id 0 is available)
        rentalCompany.rentScooter(0);

        // Simulate traveling from home to the university
        travelToUniversity();

        // Leave the scooter at the university
        double universityX = 41.7121106;
        double universityY = 44.7489232;
        rentalCompany.returnScooter(0, universityX, universityY);

        // Wait for an hour
        waitForOneHour();

        // Rent the scooter again
        rentalCompany.rentScooter(0);

        // Simulate traveling back home
        travelBackHome();

        // Leave the scooter near home
        double homeX = 41.727031 /* Coordinates of your home */;
        double homeY = 44.809242 /* Coordinates of your home */;
        rentalCompany.returnScooter(0, homeX, homeY);
    }

    /**
     * Simulates traveling from home to the university.
     * You should implement this method based on your actual travel route.
     */
    private static void travelToUniversity() {
        // Simulate traveling from home to the university
        // This could involve setting GPS coordinates, calculating distance, etc.
        // Replace this with your actual implementation
    }

    /**
     * Simulates traveling back home.
     * You should implement this method based on your actual travel route.
     */
    private static void travelBackHome() {
        // Simulate traveling back home
        // This could involve setting GPS coordinates, calculating distance, etc.
        // Replace this with your actual implementation
    }

    /**
     * Waits for one hour.
     */
    private static void waitForOneHour() {
        // Wait for one hour (in milliseconds)
        try {
            Thread.sleep(60 * 60 * 1000); // 60 minutes * 60 seconds * 1000 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}