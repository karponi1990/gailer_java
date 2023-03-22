import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class GewinnserieButton extends JFrame implements ActionListener{
    
    JButton ersterButton, zweiterButton, dritterButton;
    Random rnd = new Random();

    GewinnserieButton(String titel){

        super(titel);
        ersterButton = new JButton("Spiel!");
        zweiterButton = new JButton("Spiel!");
        dritterButton = new JButton("Spiel!");

        setLayout(new FlowLayout());

        add(ersterButton);
        add(zweiterButton);
        add(dritterButton);

        ersterButton.addActionListener(this);
        zweiterButton.addActionListener(this);
        dritterButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt){

        int zufallszahl = rnd.nextInt(3);

        float r = rnd.nextFloat(), g = rnd.nextFloat(), b = rnd.nextFloat();

        Color randomColor = new Color(r, g, b);

        if (zufallszahl == 0) {
            getContentPane().setBackground(randomColor);
        } else if(zufallszahl == 1){
            getContentPane().setBackground(randomColor);
        }else{
            System.exit(0);
        }

        repaint();
    }
}
