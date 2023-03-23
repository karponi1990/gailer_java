import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ratespiel extends JFrame implements ActionListener {

    JLabel inLabel = new JLabel("Geben Sie einen Text ein:");
    JTextField inText = new JTextField(15);

    JLabel outLabel = new JLabel("Ergebnis:");
    JTextField outText = new JTextField(15);

    int versuche = 0;

    Ratespiel(String titel) {

        super(titel);
        setLayout(new FlowLayout());

        outText.setEditable(false);

        add(inLabel);
        add(inText);
        add(outLabel);
        add(outText);

        inText.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {

        checkText();
        repaint();
    }

    void checkText() {

        String name = inText.getText();

        if (name.equals("ITT56")) {
            outText.setText("Korrekt");
        } else {
            inText.setText("");
            versuche++;
            outText.setText("Falsch! (Noch " + (3 - versuche) + " Versuche");
        }

        if (versuche == 3) {
            System.exit(0);
        }
    }
}
