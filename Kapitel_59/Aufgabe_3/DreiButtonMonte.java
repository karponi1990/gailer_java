import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DreiButtonMonte extends JFrame implements ActionListener {

    JButton ersterButton, zweiterButton, dritterButton;
    Random rnd = new Random();

    DreiButtonMonte(String titel) {

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

    public void actionPerformed(ActionEvent evt) {

        int zufallszahl = rnd.nextInt(3);

        if (zufallszahl == 0) {
            getContentPane().setBackground(Color.green);
        } else {
            System.exit(0);
        }

        repaint();
    }
}
