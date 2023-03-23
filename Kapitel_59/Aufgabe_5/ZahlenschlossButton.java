import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ZahlenschlossButton extends JFrame implements ActionListener {

    JButton nullButton, einsButton, zweiButton, dreiButton, vierButton, fuenfButton, sechsButton, siebenButton,
            achtButton, neunButton;
    String code = "";

    ZahlenschlossButton(String titel) {

        super(titel);
        nullButton = new JButton("0");
        einsButton = new JButton("1");
        zweiButton = new JButton("2");
        dreiButton = new JButton("3");
        vierButton = new JButton("4");
        fuenfButton = new JButton("5");
        sechsButton = new JButton("6");
        siebenButton = new JButton("7");
        achtButton = new JButton("8");
        neunButton = new JButton("9");

        setLayout(new FlowLayout());

        add(nullButton);
        add(einsButton);
        add(zweiButton);
        add(dreiButton);
        add(vierButton);
        add(fuenfButton);
        add(sechsButton);
        add(siebenButton);
        add(achtButton);
        add(neunButton);

        nullButton.setActionCommand("0");
        einsButton.setActionCommand("1");
        zweiButton.setActionCommand("2");
        dreiButton.setActionCommand("3");
        vierButton.setActionCommand("4");
        fuenfButton.setActionCommand("5");
        sechsButton.setActionCommand("6");
        siebenButton.setActionCommand("7");
        achtButton.setActionCommand("8");
        neunButton.setActionCommand("9");

        nullButton.addActionListener(this);
        einsButton.addActionListener(this);
        zweiButton.addActionListener(this);
        dreiButton.addActionListener(this);
        vierButton.addActionListener(this);
        fuenfButton.addActionListener(this);
        sechsButton.addActionListener(this);
        siebenButton.addActionListener(this);
        achtButton.addActionListener(this);
        neunButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt) {

        if (code.length() < 3) {
            code = code + evt.getActionCommand();
        }
        if (code.length() == 3) {
            if (code.equals("735")) {
                getContentPane().setBackground(Color.green);
                repaint();
                code = "";
            } else {
                getContentPane().setBackground(Color.red);
                repaint();
                code = "";
            }
        }
    }
}
