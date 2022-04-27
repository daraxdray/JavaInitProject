package mycopy;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics2D = (Graphics2D) g;
        for(int i = 1; i < 20; i++){
        g.drawLine(0,0,(int) (getWidth() * 0.2), (int)(getHeight() ));
//        graphics2D.drawLine(0,0,width,height);
//        for(int i = 0; i < 100; i+=4){
//
//            graphics2D.drawLine(i,i, (int)(width * 10 / 100) + i ,(int)(height * 10  / 100)+ i);
//            System.out.println((int)(width * 10 / 100) + i);
//        }
//        graphics2D.drawLine(0,height,width,0);

    }}

//    DrawPanel(){
//        JButton testButton1 = new JButton("Button 1");
//        testButton1.setMaximumSize(testButton1.getPreferredSize());
//        JPanel p = new JPanel();
//        p.add(testButton1,BorderLayout.CENTER);
//        add(p);
////        testButton1.addActionListener(new TestButtonAction());
//        testButton1.setAlignmentX(Component.CENTER_ALIGNMENT);
//        add(Box.createVerticalGlue());
//        setSize(400,400);
//    }
}
