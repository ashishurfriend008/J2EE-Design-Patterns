package StrategyDesignPattern;

public class TrainTravelStrategy implements TravelStrategy{
    @Override
    public void gotoAirport() {
        System.out.println("Traveller is going by train and will be charged Rs 300.");
    }
}
