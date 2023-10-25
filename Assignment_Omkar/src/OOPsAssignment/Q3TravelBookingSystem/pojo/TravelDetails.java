package OOPsAssignment.Q3TravelBookingSystem.pojo;

public class TravelDetails {
    private String mode;
    private String number;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;

    public TravelDetails(String mode, String number, String source, String destination, String arrivalTime, String departureTime) {
        this.mode = mode;
        this.number = number;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getMode() {
        return mode;
    }

    public String getNumber() {
        return number;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
