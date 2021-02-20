package StrategyDesignPattern;

public class BusTravelStrategy implements TravelStrategy {
    @Override
    public void gotoAirport() {
        System.out.println("Traveller is going by bus and will be charged Rs 200.");
    }
}
