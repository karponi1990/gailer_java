import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ZweiWegeKonverter extends JFrame implements ActionListener{
    
    JLabel infoLab = new JLabel("Convert C to F and F to C");
    JLabel inLab = new JLabel("Eingabe");
    JLabel outLab = new JLabel("Ausgabe");
    JTextField inTxt = new JTextField(15);
    JTextField outTxt = new JTextField(15);

    JButton ctofBtn = new JButton("C to F");
    JButton ftocBtn = new JButton("F to C");
    JButton resetBtn = new JButton("reset");

    int inTemp;
    int outTemp;

    ZweiWegeKonverter(String titel){

        super(titel);

        setLayout(new FlowLayout());
        outTxt.setEditable(false);

        add(infoLab);
        add(inLab);
        add(inTxt);
        add(outLab);
        add(outTxt);
        add(ctofBtn);
        add(ftocBtn);
        add(resetBtn);


        ctofBtn.setActionCommand("CtoF");
        ftocBtn.setActionCommand("FtoC");
        resetBtn.setActionCommand("reset");

        ctofBtn.addActionListener(this);
        ftocBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }

    public void actionPerformed( ActionEvent evt){
      
        String userIn = inTxt.getText();

        if(evt.getActionCommand().equals("reset")){

            inTxt.setText("");
            outTxt.setText("");
        }else if(evt.getActionCommand().equals("CtoF")){

            try{

                inTemp = Integer.parseInt(userIn);
                outTemp = convertCtoF(inTemp);
                outTxt.setText(outTemp + " F");
            }catch(Exception ex){

                outTxt.setText("Bitte int eingeben!");
            }

        }else if(evt.getActionCommand().equals("FtoC")){

            try{

                inTemp = Integer.parseInt(userIn);
                outTemp = convertFtoC(inTemp);
                outTxt.setText(outTemp + " °C");
            }catch(Exception ex){

                outTxt.setText("Falsche Eingabe! (Bitte int eingeben)");
            }
        }

        repaint();
    }

    public int convertCtoF( int C ){

        return (((C * 9) / 5) + 32);
    }

    public int convertFtoC( int F ){

        return ((F-32) * 5) / 9;
    }
}
