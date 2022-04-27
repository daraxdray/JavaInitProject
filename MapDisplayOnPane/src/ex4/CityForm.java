package ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CityForm  extends JFrame {
    private final JTextArea nameField;
    private final JTextArea sizeField;
    private MainCityGUI.ButtonListener btnListener;

//returns the name field
    public JTextArea getNameField(){
        return nameField;
    }
    //returns the size field
    public JTextArea getSizeField(){
        return sizeField;
    }


//CityForm Constructor
    public CityForm(MainCityGUI.ButtonListener btnListener){
        this.btnListener = btnListener;//buttons listener is passed as a parameter to the Form Frame
        setTitle("Form Field");
        setSize(400,200);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel f1panel = new JPanel(new FlowLayout()); //field 1 JPanel(Name)
        JPanel f2panel = new JPanel(new FlowLayout()); //field 2 JPanel(Size)
        JLabel nameLabel = new JLabel("Name");
        nameField = new JTextArea(1,13);
        sizeField = new JTextArea(1,13);
        JLabel sizeLabel = new JLabel("Size");
        JButton submitButton = new JButton("OK");
        submitButton.addActionListener(btnListener);

        //Adding all the created component to the panel and frame
        //add the name label and field to f1panel
        f1panel.add(nameLabel);
        f1panel.add(nameField);
        //add the size label and field to f2panel
        f2panel.add(sizeLabel);
        f2panel.add(sizeField);
        //add button to parent panel
        add(submitButton,BorderLayout.SOUTH);
        add(f1panel,BorderLayout.NORTH); //
        add(f2panel,BorderLayout.CENTER);
    }
}
