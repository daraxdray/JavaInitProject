package mycopy;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {
    private  int choice;

    Shapes(int choice)
    {
        this.choice = choice;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);


//        for(int i= 0; i < 10; i++){
//            switch(choice){
//                case 1:
//                    g.drawRect(10 + i * 10,10 + i * 10, 50 + i * 10, 50 + i * 10 );
////                    g.drawLine(100 + i * 10,100 + i * 10, 100 + i * 10, 100 + i * 10 );
//                    break;
//                case 2:
//                    g.drawOval(10 + i * 10,10 + i * 10, 50 + i * 10, 50 + i * 10 );
//                    break;
//                default:
//                    g.drawOval(10 + i * 10,10 + i * 10, 50 + i * 10, 50 + i * 10 );
//                    g.drawRect(10 + i * 10,10 + i * 10, 50 + i * 10, 50 + i * 10 );
//                    break;
//            }
//        }
//        g.setColor(Color.YELLOW);
//        g.fillOval(10,10,200,200);
//        g.setColor(Color.MAGENTA);
//        g.fillOval(100,100,100,100);
//        g.setColor(Color.YELLOW);
//        g.fillOval(150,150,50,50);
    }
}
