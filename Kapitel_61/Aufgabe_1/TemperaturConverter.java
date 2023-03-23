import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TemperaturConverter extends JFrame implements ActionListener {

    JLabel infoLab = new JLabel("Convert Celsius to Fahrenheit");
    JLabel fahrLab = new JLabel("Fahrenheit");
    JLabel celsLab = new JLabel("Celsius   ");
    JTextField fahrTxt = new JTextField(20);
    JTextField celsTxt = new JTextField(20);

    int fahrTemp;
    int celsTemp;

    TemperaturConverter(String titel) {

        super(titel);

        setLayout(new FlowLayout());
        fahrTxt.setEditable(false);

        add(infoLab);
        add(celsLab);
        add(celsTxt);
        add(fahrLab);
        add(fahrTxt);

        celsTxt.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {

        String userIn = celsTxt.getText();

        try {

            celsTemp = Integer.parseInt(userIn);
            fahrTemp = convertCtoF(celsTemp);
            fahrTxt.setText(fahrTemp + " F");
        } catch (Exception ex) {

            fahrTxt.setText("Falsche Eingabe! (Bitte int eingeben)");
        }

        repaint();
    }

    public int convertCtoF(int C) {

        return (((C * 9) / 5) + 32);
    }
}
