package StrategyDesignPattern;

import java.util.Scanner;

/**
 * Here, we taking inputs from console and based on the travel type we choose we are
 * setting the corresponding travel strategy. And, based on the travel strategy we
 * are calling corresponding gotoAirport() method.
 */
public class TravellerClient {

    public static void main(String [] args){
        System.out.println("Please enter the travel type : 'Bus' or 'Train' or 'Taxi' or 'Auto' ");
        Scanner scanner = new Scanner(System.in);
        String travelType = scanner.next();

        TravelContext travelContext = null;
        travelContext = new TravelContext();

        if("bus".equalsIgnoreCase(travelType)){
            travelContext.setTravelStrategy(new BusTravelStrategy());
        }else if("train".equalsIgnoreCase(travelType)){
            travelContext.setTravelStrategy(new TrainTravelStrategy());
        }else if("auto".equalsIgnoreCase(travelType)){
            travelContext.setTravelStrategy(new AutoTravelStrategy());
        }else if("taxi".equalsIgnoreCase(travelType)){
            travelContext.setTravelStrategy(new TaxiTravelStrategy());
        }
        System.out.println("Travel Context has " +travelContext.getTravelStrategy());
        travelContext.gotoAirport();

    }
}
