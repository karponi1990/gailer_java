import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VierButtons extends JFrame implements ActionListener{
    
    JButton rotButton, gruenButton, blauButton, grauButton;

    VierButtons(String titel){

        super(titel);
        rotButton = new JButton("Rot");
        gruenButton = new JButton("Grün");
        blauButton = new JButton("Blau");
        grauButton = new JButton("Grau");

        setLayout(new FlowLayout());

        add(rotButton);
        add(gruenButton);
        add(blauButton);
        add(grauButton);

        rotButton.setActionCommand("rot");
        gruenButton.setActionCommand("gruen");
        blauButton.setActionCommand("blau");
        grauButton.setActionCommand("grau");

        rotButton.addActionListener(this);
        gruenButton.addActionListener(this); 
        blauButton.addActionListener(this);
        grauButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt){

        switch(evt.getActionCommand()){
            case "rot":
                getContentPane().setBackground(Color.red);
                break;
            case "gruen":
                getContentPane().setBackground(Color.green);
                break;
            case "blau":
                getContentPane().setBackground(Color.blue);
                break;
            case "grau":
                getContentPane().setBackground(Color.gray);
                break;
        }

        repaint();
    }

}
