
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


 
public class ZEICHENFLAECHE
{
    Frame fenster;
    Button A;
    Button B;
    Button C;
    Button D;
    TextField eingabe;
    
    /**
     * Constructor for objects of class OBERFLAECHE
     */
    public ZEICHENFLAECHE()
    {
        
        fenster = new Frame("Schaltkasten");
        fenster.setSize(400,600);
        fenster.setLocation(0,0);
        fenster.setVisible(true);
        fenster.setLayout(null);
        A = new Button();
        A.setLocation(20,35);
        A.setLabel("Tel Aviv");
        A.setVisible(true);
        A.setSize(100,30);
        A.setEnabled(true);
        A.addActionListener(new ActionListener()
    {
            public void actionPerformed(ActionEvent e)
            {
                fragenpool.Weiterschalten();
            }
        });
        fenster.add(C);
        
        C = new Button();
        C.setLocation(20,150);
        C.setLabel("Ramallah");
        C.setVisible(true);
        C.setSize(100,30);
        C.setEnabled(true);
        C.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragenpool.Anhalten();
            }
        });
        fenster.add(B);
        
        B = new Button();
        B.setLocation(70,35);
        B.setLabel("Jerusalem");
        B.setVisible(true);
        B.setSize(100,30);
        B.setEnabled(true);
        B.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragenpool.Weiterschalten();
            }
        });
        fenster.add(D);
            D = new Button();
        D.setLocation(70,35);
        D.setLabel("Jerusalem");
        D.setVisible(true);
        D.setSize(100,30);
        D.setEnabled(true);
        D.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragenpool.Weiterschalten();
            }
        });
        
        eingabe = new TextField();
        eingabe.setLocation(70,150);
        eingabe.setVisible(true);
        eingabe.setSize(100,30);
        eingabe.setEnabled(true);
        fenster.add(eingabe);
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
    }
}
