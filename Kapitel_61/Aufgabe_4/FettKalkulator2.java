import java.awt.*;
import java.awt.event.*;
import java.text.*;

import javax.swing.*;

public class FettKalkulator2 extends JFrame implements ActionListener {

    JLabel heading = new JLabel("Percent of Calories from Fat");
    JLabel fatLabel = new JLabel("Enter grams of fat:        ");
    JLabel calLabel = new JLabel("Enter total calories:      ");
    JLabel perLabel = new JLabel("Percent calories from fat: ");
    JLabel okLabel = new JLabel("Ergebniss: ");

    JTextField inFat = new JTextField(15);
    JTextField inCal = new JTextField(15);
    JTextField outPer = new JTextField(20);
    JTextField outOK = new JTextField(20);

    JButton doit = new JButton("Do It!");

    double calories, fatGrams, percent;

    FettKalkulator2(String titel) {

        super(titel);

        setLayout(new FlowLayout());

        add(heading);
        add(fatLabel);
        add(inFat);
        add(calLabel);
        add(inCal);
        add(perLabel);
        add(outPer);
        outPer.setEditable(false);
        add(okLabel);
        add(outOK);
        outOK.setEditable(false);
        add(doit);

        doit.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {

        String userInFat = inFat.getText();
        String userInCal = inCal.getText();
        try {
            fatGrams = Double.parseDouble(userInFat);
            calories = Double.parseDouble(userInCal);

            calcPercent();

            if (percent >= 30.0) {
                outOK.setText("Zu viele Fettkalorien!");
            } else {
                outOK.setText("Fettanteil OK.");
            }
            outPer.setText(new DecimalFormat("#0.0##").format(percent) + "%");
            repaint();

        } catch (Exception ex) {

            outPer.setText("Bitte double eingeben!");
        }
    }

    public void calcPercent() {

        percent = ((fatGrams * 9) / calories) * 100;
    }
}
