package OOPsAssignment.Q3TravelBookingSystem.serviceeImpl;


import OOPsAssignment.Q3TravelBookingSystem.pojo.TravelDetails;
import OOPsAssignment.Q3TravelBookingSystem.service.IJourneyOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TravelBookingSystem implements IJourneyOperations {
    List<TravelDetails> bookings = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void bookTravel(String mode) {
        System.out.print("Enter " + mode + " number: ");
        String flightNumber = scanner.next();
        System.out.print("Enter source: ");
        String source = scanner.next();
        System.out.print("Enter destination: ");
        String destination = scanner.next();
        System.out.print("Enter arrival time: ");
        String arrivalTime = scanner.next();
        System.out.print("Enter departure time: ");
        String departureTime = scanner.next();

        TravelDetails booking = new TravelDetails(mode, flightNumber, source, destination, arrivalTime, departureTime);
        bookings.add(booking);

        System.out.println("---------------Travel booked successfully.---------");
        System.out.println("---------------Happy Journey.---------");

    }

    public void checkStatus() {
        if (bookings.isEmpty()) {
            System.out.println("------------No travel bookings found.------------");
        } else {
            System.out.println("Travel Bookings:");
            for (TravelDetails booking : bookings) {
                System.out.println("Mode: " + booking.getMode());
                System.out.println("Flight Number: " + booking.getNumber());
                System.out.println("Source: " + booking.getSource());
                System.out.println("Destination: " + booking.getDestination());
                System.out.println("Arrival Time: " + booking.getArrivalTime());
                System.out.println("Departure Time: " + booking.getDepartureTime());
                System.out.println();
            }
        }
    }

    public void cancelTravel() {
        if (bookings.isEmpty()) {
            System.out.println("No travel bookings to cancel.");
        } else {
            bookings.remove(bookings.size() - 1);
            System.out.println("---------------------Travel booking canceled successfully.----------------");
        }
    }
}