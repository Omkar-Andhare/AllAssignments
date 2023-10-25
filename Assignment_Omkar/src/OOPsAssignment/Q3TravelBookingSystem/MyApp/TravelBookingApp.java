package OOPsAssignment.Q3TravelBookingSystem.MyApp;

import OOPsAssignment.Q3TravelBookingSystem.service.IJourneyOperations;
import OOPsAssignment.Q3TravelBookingSystem.serviceeImpl.TravelBookingSystem;

import java.util.Scanner;


public class TravelBookingApp {
    public static void main(String[] args) {
        IJourneyOperations iJourneyOperations = new TravelBookingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Book a Flight");
            System.out.println("2. Book a Bus");
            System.out.println("3. Book a Train");
            System.out.println("4. Check Booking Status");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    iJourneyOperations.bookTravel("Flight");
                    break;
                case 2:
                    iJourneyOperations.bookTravel("Bus");
                    break;
                case 3:
                    iJourneyOperations.bookTravel("Train");
                    break;
                case 4:
                    iJourneyOperations.checkStatus();
                    break;
                case 5:
                    iJourneyOperations.cancelTravel();
                    break;
                case 6:
                    System.out.println("------------------Exited Successfully------------------.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
