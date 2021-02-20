package StrategyDesignPattern;

public class TaxiTravelStrategy implements TravelStrategy{
    @Override
    public void gotoAirport() {
        System.out.println("Traveller is going by taxi and will be charged Rs 1000.");
    }
}
