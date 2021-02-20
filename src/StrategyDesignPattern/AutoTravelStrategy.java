package StrategyDesignPattern;

public class AutoTravelStrategy implements TravelStrategy{
    @Override
    public void gotoAirport() {
        System.out.println("Traveller is going by auto and will be charged Rs 600.");
    }
}
