import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMain
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jframe Display");
        frame.setSize ( 500 , 500 );
        MyComponent component  = new MyComponent();
        frame.add(component);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );
        frame.setVisible(true);


        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Extracted");
            }
        });

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
}
