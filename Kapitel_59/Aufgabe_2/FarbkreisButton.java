import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FarbkreisButton extends JFrame implements ActionListener{
    
    JButton colorButton;

    FarbkreisButton(String titel){

        super(titel);
        colorButton = new JButton("Wechsel Farbe");

        getContentPane().setBackground(Color.red);

        setLayout(new FlowLayout());

        add(colorButton);

        colorButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt){

        if(getContentPane().getBackground() == Color.red){
            getContentPane().setBackground(Color.green);
        }else if(getContentPane().getBackground() == Color.green){
            getContentPane().setBackground(Color.blue);
        }else if(getContentPane().getBackground() == Color.blue){
            getContentPane().setBackground(Color.gray);
        }else if(getContentPane().getBackground() == Color.gray){
            getContentPane().setBackground(Color.red);
        }

        repaint();
    }
}
