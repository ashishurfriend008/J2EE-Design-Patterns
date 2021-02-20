package StrategyDesignPattern;

public class TravelContext {
    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    //client will set what travel strategy to use by calling this method
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void gotoAirport(){
        travelStrategy.gotoAirport();
    }
}
