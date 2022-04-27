package ex1;

import java.util.Random;

public class MainPopulationStream {
    public static void main(String[] arg){
        Random random = new Random();
        Country ct = new  Country(100,90,180,12);
        int year = 5;
        System.out.format("Starting population: %f million in %d cities \n", ct.getSize(),ct.getNumberOfCities());
        for(int i = 0; i < year; i++){
            int increase = random.nextInt(100);
            ct.update(increase);
            System.out.format("Year %d, increase: %f million \n", i, ct.getPopulationSize());
        }
        City cityMax = ct.getMaximum();
        City cityMin = ct.getMinimum();
        System.out.format("Largest city: %f million located at %f lat, %f lon...\n", cityMax.getSize() , cityMax.getLatitude(), cityMax.getLongitude());
        System.out.format("Smallest city: %f million located at %f lat, %f lon...\n",cityMin.getSize(), cityMin.getLatitude(),cityMin.getLongitude());
        System.out.format("Total: %f million in %d cities...\n", ct.getPopulationSize(),ct.getNumberOfCities());


    }
}
