package ex3;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {
    JButton[] allButtons = new  JButton[7];
    Color [] colors = { new Color(255, 228, 148), new Color(255, 216, 77),
                        new Color(255, 154, 77), new Color(208, 117, 11),
                        new Color(255, 77, 77),new Color(201, 0, 0),new Color(142, 142, 142)};
    InfoPanel(){
        setLayout(new FlowLayout());
        
        allButtons[0] = new JButton("< 1");
        allButtons[1] = new JButton("< 1 - 5");
        allButtons[2] = new JButton(" 5 - 25");
        allButtons[3] = new JButton(" 25 - 250");
        allButtons[4] = new JButton(" 250 - 1000");
        allButtons[5] = new JButton("1000 >");
        allButtons[6] = new JButton("No data");
        
        for(int i = 0; i < allButtons.length; i++) {
            allButtons[i].setOpaque(true); //Para poder mostrar el color del boton
            allButtons[i].setBounds(70, 80, 100, 30);
            //change the background color of JButton
            allButtons[i].setBackground(colors[i]);

            add(allButtons[i]);
        }


    }
}
