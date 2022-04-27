package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CityGUI extends JComponent {
    Graphics2D gr;
    List<Circle> circles = new ArrayList<>();
    //the inherited method for drawing circle
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponents(g);
        this.gr = (Graphics2D) g;
        for(Circle circle: circles) {
            circle.draw(g);
        }
//        g.draw
    }

//Add new circle to the List to display new circle
    public void addCircle(int x,int y,int r, String name){
        x = x - (r/2);
        y = y - (r/2);
        circles.add(new Circle(x,y,r,r,name));
        repaint();
    }

}


class Circle {
    //circle instance variables
    int x, y, width, height;
    String name;
    //constructor for the circle
    Circle(int x, int y, int width, int height, String name){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }
    //handles the circle drawing on the jcomponent
    public void draw(Graphics g){
        g.drawOval(x,y,width,height);
        g.drawString(name,x+width /  2,y+height /2);
    }
}

