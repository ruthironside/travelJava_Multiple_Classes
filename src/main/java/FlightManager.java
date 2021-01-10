public class FlightManager {

    private double bagWeightPerPassenger;
    private int totalNumberOfBags;


    public FlightManager() {
        this.bagWeightPerPassenger = 0;
        this.totalNumberOfBags = 0;
    }

    public double getBagWeightPerPassenger(Flight flight) {
        this.bagWeightPerPassenger = (flight.getTotalWeightFromPlane()/2) / flight.getCapacityFromPlane();
        return bagWeightPerPassenger;
    }

    public double getBagWeightTotal(Flight flight) {
        this.totalNumberOfBags = flight.getAllPassengerBags();
        getBagWeightPerPassenger(flight);
        return this.totalNumberOfBags * this.getBagWeightPerPassenger(flight);
    }

    public double weightRemainingOnFlight(Flight flight) {
        return (flight.getTotalWeightFromPlane()/2 - getBagWeightTotal(flight));
    }
}
