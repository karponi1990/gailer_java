import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fehlermeldung extends JFrame implements ActionListener {

    JLabel inLabel = new JLabel("Geben Sie einen Text ein:");
    JTextField inText = new JTextField(20);

    JLabel outLabel = new JLabel("Ergebnis:");
    JTextField outText = new JTextField(20);

    Fehlermeldung(String titel) {

        super(titel);
        setLayout(new FlowLayout());

        add(inLabel);
        add(inText);
        add(outLabel);
        add(outText);

        inText.setActionCommand("inText");
        outText.setActionCommand("outText");

        inText.addActionListener(this);
        outText.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {

        if (evt.getActionCommand().equals("inText")) {
            copyText();
        } else if (evt.getActionCommand().equals("outText")) {
            outText.setText("Geben Sie Text im oberen Feld ein!");
        }

        repaint();
    }

    void copyText() {

        String name = inText.getText();
        outText.setText(name);
    }

}
