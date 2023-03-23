import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EchoBeideFelder extends JFrame implements ActionListener {

    JLabel inLabel = new JLabel("Text 1:");
    JTextField inText = new JTextField(20);

    JLabel outLabel = new JLabel("Text 2:");
    JTextField outText = new JTextField(20);

    EchoBeideFelder(String titel) {

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
            outText.setText(inText.getText());
        } else if (evt.getActionCommand().equals("outText")) {
            inText.setText(outText.getText());
        }

        repaint();
    }
}
