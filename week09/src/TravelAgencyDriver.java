import java.util.Arrays;

public class TravelAgencyDriver {
    public static void main(String[] args) {

        boolean isSuccess=false;
        String booking;
        double totalIncome;
        //List of destinations
        String [] destinations={"Sydney","Beijing","New Delhi","London"};

        // Create a new instance of TravelAgency Class using the 3-parameter constructor
        TravelAgency travelAgency = new TravelAgency("Oz","Melbourne",destinations);
        //set a new name for the Agency
        isSuccess=travelAgency.setAgencyName("Ozi");
        System.out.println("Setting a new name is "+((!isSuccess)?"NOT":"")+ " Successful");
        isSuccess=travelAgency.setAgencyName("OzTravel");
        System.out.println("Setting a new name is "+((!isSuccess)?"NOT":"")+ " Successful");
        booking="NewYork;4;110";// should not be accepted; no such destination
        isSuccess= travelAgency.addReservation(booking);
        System.out.println("Adding a new booking is "+((!isSuccess)?"NOT":"")+ " Successful");
        booking="Sydney;4a;110";// should not be accepted; 4a should be a number
        isSuccess= travelAgency.addReservation(booking);
        System.out.println("Adding a new booking is "+((!isSuccess)?"NOT":"")+ " Successful");
        booking="Sydney;4;110";// should be OK
        isSuccess= travelAgency.addReservation(booking);
        System.out.println("Adding a new booking is "+((!isSuccess)?"NOT":"")+ " Successful");
        booking="London;2;250";// should be OK
        isSuccess= travelAgency.addReservation(booking);
        //lets calculate the total cost
        totalIncome=travelAgency.getTotalIncome();
        System.out.println("Travel Agency "+travelAgency.getAgencyName()+" has total income=$"+totalIncome);

//        System.out.println(Arrays.toString(travelAgency.getDestinations()));
        System.out.println(travelAgency.toString());



        /** Expected Output
         * Setting a new name is NOT Successful
         * Setting a new name is  Successful
         * Adding a new booking is NOT Successful
         * Adding a new booking is NOT Successful
         * Adding a new booking is  Successful
         * Travel Agency OzTravel has total income=$940.0
         */

    }
}
