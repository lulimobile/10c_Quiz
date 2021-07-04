import java.awt.event.ActionListener;
import java.awt.*;
 
import java.awt.event.ActionEvent;
import javax.swing.*;
public class Spielfenster implements ActionListener
{
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    JLabel frage;
    JButton ant[] = new JButton[4];
    JFrame fenster;
    JProgressBar Prozente;
    int lösung;
    int richtig;
    
    
    public static void main(String[] args)
    {  new Fragenwechsel();
    }
    public Spielfenster()
    {
        fenster = new JFrame();
        fenster.setSize(400,300);
        fenster.setLocation((int) (dim.getWidth()-400)/2,(int) ((dim.getHeight()-300))/2);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        
        ant[0] = new JButton("   ");
        ant[0].setBounds(50,90,120,40);
        fenster.add(ant[0]);
        ant[0].addActionListener(this);
        
        ant[1] = new JButton("   ");
        ant[1].setBounds(50,165,120,40);
        fenster.add(ant[1]);
        ant[1].addActionListener(this);
        
        ant[2] = new JButton("   ");
        ant[2].setBounds(225,90,120,40);
        fenster.add(ant[2]);
        ant[2].addActionListener(this);
        
        ant[3] = new JButton("   ");
        ant[3].setBounds(225,165,120,40);
        fenster.add(ant[3]);
        ant[3].addActionListener(this);
        
        
        frage = new JLabel("   ");
        frage.setBounds(50,15,255,40);
        fenster.add(frage);
        
        Prozente = new JProgressBar(0,100);
        Prozente.setBounds(120,225,140,25);
        Prozente.setValue(0);
        Prozente.setStringPainted(true);
        fenster.add(Prozente);
        
    }
    public void ButtonTextWechsel(int button, String text)
    {
        ant[button-1].setText(text);
    }
    
    public void LabelTextWechsel(String text)
    {
        frage.setText(text);
    }
    
    public void actionPerformed( ActionEvent e)
    {
        if (e.getSource() == ant[0])
        { if (lösung == 1)
            { 
                Message("Richtig","Sehr gut!");
                Prozente();
                Fragenwechsel.neueFrage();
            }else{
                Message("Falsch","Leider nicht");
            }
        }
         if (e.getSource() == ant[1])
        { if (lösung == 2)
            { 
                Message("Richtig","Sehr gut!");
                Prozente();
                Fragenwechsel.neueFrage();
            }else{
                Message("Falsch","Leider nicht");
            }
        }
         if (e.getSource() == ant[2])
        { if (lösung == 3)
            { 
                Message("Richtig","Sehr gut!");
                Prozente();
                Fragenwechsel.neueFrage();
            }else{
                Message("Falsch","Leider nicht");
            }
        }
         if (e.getSource() == ant[3])
        { if (lösung == 4)
            { 
                Message("Richtig","Sehr gut!");
                Prozente();
                Fragenwechsel.neueFrage();
            }else{
                Message("Falsch","Leider nicht");
            }
        }
    }
    public void Message(String Aussage, String info)
    {
        Object[] options = {"OK"};
        JOptionPane.showOptionDialog(null, Aussage, info, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    }
    public void Prozente()
    {
        if (richtig<= 15)
        {
            richtig+=1;
            Prozentrechnung(richtig,16);
        }else
        {
            Message("Stark!", "Congrats!");
            System.exit(0);
        }
    }
    public void Prozentrechnung(int zahl, int gesamt)
    {
        Prozente.setValue((int) 100/gesamt*zahl);
        
    }
    }

