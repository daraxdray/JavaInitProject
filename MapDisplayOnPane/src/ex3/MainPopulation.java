package ex3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;

public class MainPopulation {
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Main Population"); // instantiate frame


        PopulationDisplay popPanel = new PopulationDisplay("popData/pop2000.asc"); //instantiate our population data
        JLabel title = new JLabel("Gridded Population of the World");

        JPanel titlePanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        JPanel footerPanel = new InfoPanel();
        //configure frame
        frame.setLayout(new BorderLayout());
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        titlePanel.add(title,BorderLayout.CENTER);

//        footerPanel.add(footer,BorderLayout.CENTER);
        //add component to frame
        frame.add(titlePanel,BorderLayout.NORTH);
        frame.add(popPanel, BorderLayout.CENTER);
        frame.add(footerPanel,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
