package ex3;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComponent;
public class PopulationDisplay extends JComponent{
    // instance variable for populationData
    private PopulationData populationData;
    //instance variable for list of population data
    private PopulationData[] popDataList = {};
    //constructor that handles one file name
    PopulationDisplay(String fileName) throws IOException {
        this.populationData = new PopulationData(fileName);
    }
//constructor that handles list of file names
    PopulationDisplay(String [] fileList) throws IOException, InterruptedException {
            for(int i = 0; i < fileList.length; i++){
                popDataList[i] = new PopulationData(fileList[i]);
                Thread.sleep(1000);
            }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.clearRect(0, 0, getWidth(), getHeight());
        double[][] data = populationData.getPopData();
        int width = getWidth();
        int height = getHeight();
        int xstart=0;

        //loop through population data file exttracted
        for(int i = 0; i < populationData.getPopData().length; i++){
            //draws the grid lines
            if(i < 10){
                xstart = i*(width/10);
                g2d.drawLine(xstart, 0, xstart, height); //the vertical grids
                g2d.drawLine(0, i * height / 10, width, i * height / 10); //the horizontal grids
            }
            //loop that handles filling population
            for (int j = 0; j < data[i].length; j++){
                //set color and fill the pixels with shape
                g2d.setColor(getPreferedColor( data[i][j]));
                g2d.fillOval(i, j, (int)(data[i][j]), (int)(data[i][j]));

            }
        }

        //draw the image on the panel
            g2d.drawImage(populationData.image, (int)(getWidth() /2),(int)(getY() /2),this);
      //configure display
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);//   Or _BICUBIC
        g2d.scale(2, 2);

    }

//returns color bbased on preference
    Color getPreferedColor(double num){

        if(num == -9999){
            return new Color(142, 142, 142);
        }
        else if(num >= 1000){
            return new Color(201, 0, 0);
        }
        else if( num > 250 && num <= 1000){
            return new Color(255, 77, 77);
        }
        else if(num > 25 && num <= 250){
            return new Color(208, 117, 11);
        }
        else if(num > 5 && num <= 25){
            return new Color(255, 154, 77);
        }
        else if(num > 1 && num <= 5){
            return new Color(255, 216, 77);
        }else{
            return new Color(255, 228, 148);
        }
    }
}
