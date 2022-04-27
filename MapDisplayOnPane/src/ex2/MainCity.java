package ex2;


import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainCity {

    public static  void main(String [] args) throws FileNotFoundException {
        try{
            Scanner reader = new Scanner(new FileReader("worldcities.csv"));
            Scanner input = new Scanner(System.in);
            CityData cityData = new CityData(reader);
//
//            cityData.printCountry("Japan");
//            cityData.printLowest10();
//            cityData.printClosest10(35.7108,139.4622);
            System.out.println("Please enter: \n 1 to print 10 largest cities\n" +
                    "2 to print 10 smallest cities\n" +
                    "3 to enter a country and print cities from this country\n" +
                    "4 to enter a latitude and longitude and print 10 closest cities\n" +
                    "quit to quit");

            String response = input.next();
            switch (response){
                case "1":
                    cityData.printLargest10();
                    break;
                case "2":
                    cityData.printSmallest10();
                    break;
                case "3":
                    System.out.println("Enter country name: ");
                    String countryName = input.next();
                    cityData.printCountry(countryName);
                    break;
                case "4":
                    System.out.println("Enter latitude");
                    String lat = input.next();
                    System.out.println("Enter longitude");
                    String lng = input.next();
//                    System.out.println(Arrays.toString(latlngArr));
                    cityData.printClosest10(Double.parseDouble(lat),Double.parseDouble(lng));
                    break;
                case "quit":
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid input provided please try again");
                    break;
            }

        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
