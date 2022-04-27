package ex4;

import ex2.City;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainCityGUI  {
    static ButtonListener btnListener = new ButtonListener();
    static CityForm jr = new CityForm(btnListener);
    static CityGUI cGui = new CityGUI();
    static int cX;
    static int cY;
    static int cRadius;
    static String cName;
    public static void main(String[] args)  {

        JFrame view = new JFrame("Main City GUI");
        view.setSize(500,500);
        view.add(cGui);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);

        view.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.printf("Mouse Co-ordinate :[%d %d]", e.getX(),e.getY());
                jr.setVisible(true);
                cX = e.getX();
                cY = e.getY();


            }

            @Override
            public void mousePressed(MouseEvent e) {

//                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                System.out.println("Mouse Extracted");
            }
        });

    }

    //listens to when the OK button is pressed on the new frame
    static class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //if the input field is empty
            if(jr.getSizeField().getText().equals("") || jr.getNameField().getText().equals("")){
                return;
            }
            //exit the second frame and
            jr.setVisible(false);
            //add circle to the list of circles before drawing
            cGui.addCircle(cX,cY, Integer.parseInt(jr.getSizeField().getText()), jr.getNameField().getText());
            jr.getSizeField().setText(""); ;
            jr.getNameField().setText(""); ;
        }
    }

}
