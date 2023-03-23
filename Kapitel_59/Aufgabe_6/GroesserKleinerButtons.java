import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GroesserKleinerButtons extends JFrame implements ActionListener {

    JButton groesserButton, kleinerButton;
    String code = "";

    GroesserKleinerButtons(String titel) {

        super(titel);
        groesserButton = new JButton("Größer");
        kleinerButton = new JButton("Kleiner");

        setLayout(new FlowLayout());

        add(groesserButton);
        add(kleinerButton);

        groesserButton.setActionCommand("groesser");
        kleinerButton.setActionCommand("kleiner");

        groesserButton.addActionListener(this);
        kleinerButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {

        int width = getSize().width, height = getSize().height;

        if (evt.getActionCommand() == "groesser") {
            setSize(width + (width / 10), height + (height / 10));
        } else {
            setSize(width - (width / 10), height - (height / 10));
        }

        repaint();
    }
}
