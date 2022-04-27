package ex1;

import java.util.Arrays;
import java.util.Random;

public class Country extends Population {
    private City[] cities;
    private final  int latRange;
    private final  int lngRange;
    private double populationSize;
    private int numberOfCities;
    private int[] randomList;
    public Country(double size, int latRange, int lngRange, int numberOfCities) {
        super(size);
        this.populationSize = size;
        this.numberOfCities = numberOfCities;
        this.latRange = latRange;
        this.lngRange = lngRange;
        this.cities = new City[numberOfCities];
        randomList = new int[numberOfCities];
        this.generateRandom();
        this.instantiateCities();
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    //generate random proportion of total size to cities
    public  void generateRandom(){
        int max = 100; // 100%
        Random random = new Random();
        int total = 0;
        for(int index = 0; index <= numberOfCities -1; index++){
            //check if its last index to assign the remaining city size
            if(index == numberOfCities-1){
                total += max;
//                cities[index].setSize((max * this.populationSize) / 100);
                randomList[index] = max;
            }else {

            int randomPercent = 5 + random.nextInt((int) Math.round(max / numberOfCities ));
            max -= randomPercent;
//            cities[index].setSize((randomPercent * this.populationSize)/ 100);
            randomList[index] = randomPercent;
            total += randomPercent;
            }
        }
    }

    public void instantiateCities(){
        Random random = new Random();
        for(int i = 0; i < numberOfCities; i++){
            cities[i] = new City((randomList[i] * this.populationSize) / 100, random.nextDouble(), random.nextDouble());
        }
    }
    public void updateCitiesSize(){
        System.out.println(Arrays.toString(randomList));
        for(int i = 0; i < numberOfCities; i++){
            cities[i].setSize(cities[i].getSize() + ((randomList[i] * this.populationSize) / 100));
        }
    }

    @Override
    public void update(double sizeIncrement) {
        super.update(sizeIncrement);
        populationSize += sizeIncrement; //increment the size by the new size
        this.generateRandom(); //generate random numbers for the new size
        this.updateCitiesSize();


    }

    public double getPopulationSize() {
        return populationSize;
    }

    //returns the city with minimum population
    public City getMinimum(){
        double min = cities[0].getSize();
        City cityWithMinimum = cities[0];
        for(City city : cities){
           if(city.getSize() < min){
               min = city.getSize();
               cityWithMinimum = city;
           }
        }
    return cityWithMinimum;
    }
    //returns the city with maximum population
    public City getMaximum(){
        double max = cities[0].getSize();
        City cityWithMaximum = cities[0];
        for(City city : cities){
                System.out.println(city.getSize());
            if( max < city.getSize()){
                max = city.getSize();
                cityWithMaximum = city;
            }
        }
        return cityWithMaximum;
    }
}
