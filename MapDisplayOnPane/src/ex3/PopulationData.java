package ex3;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PopulationData {
    private final int  ROWSIZE = 8640;
    private final int  COLUMNSIZE = 4320;
    private double[][] popData = new double[ROWSIZE][COLUMNSIZE];
    final BufferedImage image = new BufferedImage(ROWSIZE,COLUMNSIZE,BufferedImage.TYPE_INT_ARGB);

//    public double[][] getPopData() {
//        return popData;
//    }

//    public void setPopData(double[][] popData) {
//        this.popData = popData;
//    }

    double[][] getPopData(){
        return  popData;
    }
    PopulationData(String fileName) throws IOException{


        Scanner sc = new Scanner(new BufferedReader(new FileReader(fileName)));

        Graphics2D g = (Graphics2D)image.getGraphics();

        while(sc.hasNextLine()){
            for(int i = 0; i < ROWSIZE; i++){
                if(!sc.hasNextLine())break; // break out if there is no next line
                String[] line =  sc.nextLine().trim().split(" "); //split the value by space into array
                for(int j = 1; j < COLUMNSIZE - 1; j++){
                    //ensure the header is not printed
                    if(i > 5){
                    popData[i][j] =  Double.parseDouble(line[j].toString());
                    }
                }
            }
        }
//            System.out.println("File is :"+ Arrays.deepToString(popData));



    }
}

