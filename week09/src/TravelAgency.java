import java.util.ArrayList;
import java.util.Arrays;

public class TravelAgency {

    private String agencyName;
    private String agencyAddress;
    private String[] destinations;
    private ArrayList<String> reservations;


    public TravelAgency(String initAgencyName, String initAgencyAddress, String[] initDestinations) {
        setAgencyName(initAgencyName); // data integrity
        setAgencyAddress(initAgencyAddress);
        setDestinations(initDestinations);
        reservations = new ArrayList<>();
    }


    public String getAgencyName() {
        return agencyName;
    }


    public boolean setAgencyName(String newAgencyName) {
        boolean isAgencyNameUpdated = false;

        if(newAgencyName.length() >= 5) {
            agencyName = newAgencyName;
            isAgencyNameUpdated = true;
        } else {
            isAgencyNameUpdated = false;
        }

        return isAgencyNameUpdated;
    }


    public String getAgencyAddress() {
        return agencyAddress;
    }


    public boolean setAgencyAddress(String newAgencyAddress) {
        boolean isAgencyAddressUpdated = false;

        if(newAgencyAddress.length() >= 9) {
            agencyAddress = newAgencyAddress;
            isAgencyAddressUpdated = true;
        } else {
            isAgencyAddressUpdated = false;
        }

        return isAgencyAddressUpdated;
    }


    public String[] getDestinations() {
        return destinations;
    }


    public boolean setDestinations(String[] newDestinations) {
        boolean isDestinationsUpdated = false;

        if(newDestinations.length > 0) {
            destinations = newDestinations;
            isDestinationsUpdated = true;
        } else {
            isDestinationsUpdated = false;
        }

        return isDestinationsUpdated;
    }


    public ArrayList<String> getReservations() {
        return reservations;
    }


    public boolean setReservations(String newReservation) {
        boolean isReservationsUpdated = false;

        if(newReservation.length() > 0) {
            reservations.add(newReservation);
            isReservationsUpdated = true;
        } else {
            isReservationsUpdated = false;
        }

        return isReservationsUpdated;
    }


    public String toString() {
        String retVal = "";
        String arToStrDestinations = "";
        String arToStrReservations = "";

        retVal += "Agency Name: " + getAgencyName() + "\n";
        retVal += "Agency Address: " + getAgencyAddress() + "\n";

        for(String destination: getDestinations()) {
            arToStrDestinations += destination + "\t";
        }
        retVal += "Destinations: " + arToStrDestinations + "\n";

        for(String reservation: getReservations()) {
            arToStrReservations += reservation + "\t";
        }
        retVal += "Reservations: " + arToStrReservations;

        return retVal;
    }


    public boolean isBookingValid(String booking) {
        String[] bookingDetails = booking.split(";");

        boolean isDestinationValid = Arrays.asList(destinations).contains(bookingDetails[0]);
        boolean isDataNumeric = isNumeric(bookingDetails[1]) && isNumeric(bookingDetails[2]);

        boolean isbookingValid = bookingDetails.length == 3 && isDataNumeric && isDestinationValid;

        return isbookingValid;
    }


    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  // match a number with optional '-' and decimal.
    }


    public boolean addReservation(String reservation) {
        boolean isValid = false;

        if(isBookingValid(reservation)) {
            isValid = setReservations(reservation);
        } else {
            isValid = false;
        }

        return isValid;
    }


    public double getTotalIncome() {
        double totalIncome = 0;
        String[] reservationDetails;
        int passengers;
        double cost;

        for(String reservation: reservations) {
            reservationDetails = reservation.split("\\;");
            passengers = Integer.parseInt(reservationDetails[1]);
            cost = Double.parseDouble(reservationDetails[2]);
            totalIncome += passengers * cost;
        }

        return totalIncome;
    }
}
