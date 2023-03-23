import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Texttausch extends JFrame implements ActionListener{
    
    JLabel inLabel     = new JLabel("Text 1:") ;
    JTextField inText  = new JTextField(20);
 
    JLabel outLabel    = new JLabel("Text 2:") ;
    JTextField outText = new JTextField(20);

    JButton btn = new JButton("Tauschen");

    Texttausch(String titel){

        super(titel);

        setLayout(new FlowLayout());

        inText.setText("OK. Cool!");
        outText.setText("OK. Ciao!");

        add(inLabel) ;
        add(inText) ;
        add(outLabel) ;
        add(outText) ;
        add(btn);

        btn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt){

        String textOne = inText.getText();
        String textTwo = outText.getText();

        inText.setText(textTwo);
        outText.setText(textOne);

        repaint();
    }
}
