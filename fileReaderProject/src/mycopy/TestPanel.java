package mycopy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPanel extends JPanel {
    public TestPanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createVerticalGlue());

        //add label
        JLabel label = new JLabel("Hello I am label");
        label.setMaximumSize(label.getPreferredSize());
        add(label);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        // add a button
        JButton testButton1 = new JButton("Button 1");
        testButton1.setMaximumSize(testButton1.getPreferredSize());
        add(testButton1);
        testButton1.addActionListener(new TestButtonAction());
        testButton1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());
    }
    private class TestButtonAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Pressed");
        }
    }
}