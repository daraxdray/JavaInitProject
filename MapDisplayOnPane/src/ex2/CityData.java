package ex2;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class CityData {
    File fileObj = new File("worldcities.csv");
    TreeSet<City> citiesSet = new TreeSet<City>();
        CityData(Scanner readFile) throws IOException {

            String line = "";
            int counter = 0;

            while(readFile.hasNext()){
                line = readFile.next();
                String [] cd = line.split(";");
                if(counter > 0 && cd.length == 11){
                    citiesSet.add(new City(
                            cd[0],
                            cd[1],
                            Double.parseDouble(cd[2]),
                            Double.parseDouble(cd[3]),
                            cd[4],
                            cd[5],
                            cd[6],
                            cd[7],
                            cd[8],
                           Integer.parseInt(cd[9]),
                            cd[10]
                    ));
                }
                counter++;
            }

            readFile.close();
        }

        public void printCities(){
            citiesSet.forEach(city -> System.out.println(city.getName()));
        }

        public void printLargest10(){
            System.out.println("=================LARGEST 10=====================");
           TreeSet<City> treeSet = (TreeSet<City>) citiesSet.descendingSet();
           treeSet.stream().limit(10).forEach(city -> {
               System.out.printf("%s located at %.4f latitude %.4f longitude in Japan with a population of %d \n",city.getName(),city.getLat(),city.getLng(),city.getPopulation());
           });
        }
        public void printSmallest10(){
            System.out.println("=================LOWEST 10=====================");
            citiesSet.stream().limit(10).forEach(city -> {
                System.out.printf("%s located at %.4f latitude %.4f longitude in Japan with a population of %d \n",city.getName(),city.getLat(),city.getLng(),city.getPopulation());
            });
        }

        public void printOutCity(City city){
            System.out.printf("%s located at %.4f latitude %.4f longitude in Japan with a population of %d \n",city.getName(),city.getLat(),city.getLng(),city.getPopulation());
        }

        public void printCountry(String country){
        Stream<City> countryCity = citiesSet.stream().filter(city -> city.getCountry().equals(country));
        countryCity.forEach(this::printOutCity);
        }

        public void printClosest10(double lat, double lng){
            SortedMap<Double,City> dist = new TreeMap<>();
             citiesSet.stream().forEach(city-> {
                  dist.put( distance(city.getLat(),lat,city.getLng(),lng), city);
            });
//            System.out.println(dist.keySet());
             dist.forEach((d, city) -> System.out.println(d));

        }

    public static double distance(double lat1, double lat2, double lon1,
                                  double lon2) {

        final int R = 6371; // Radius of the earth
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        distance = Math.pow(distance, 2);

        return Math.sqrt(distance);
    }
}
