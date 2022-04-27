package mycopy;

import javax.swing.*;

public class Testing {
        static DrawPanel drawingPanel = new DrawPanel();

    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"Welcome to java");
//        String shape = JOptionPane.showInputDialog("What shape do you want to show?");
//        String message = String.format("Welcome %s, to java programming",name);
//        JOptionPane.showMessageDialog(null,message);
//        Shapes shape1 = new Shapes(Integer.parseInt(shape));
        JFrame frame = new JFrame("Our display");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton btn = new JButton("Button");
//        frame.add(btn);
        frame.add(drawingPanel);
        frame.setVisible(true);
}}
