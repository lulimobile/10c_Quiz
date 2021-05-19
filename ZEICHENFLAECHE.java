
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
    Label fragetext;
    FRAGEPOOL;
    
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
              fragetext = new Label();
       
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
        
        A = new Button();
        A.setLocation(20,35);
       
        A.setVisible(true);
        A.setSize(100,30);
        A.setEnabled(true);
        A.addActionListener(new ActionListener()
    {
            public void actionPerformed(ActionEvent e)
            {
                fragepool.Weiterschalten();
                
            }
        });
        fenster.add(C);
        
        C = new Button();
        C.setLocation(20,150);
       
        C.setVisible(true);
        C.setSize(100,30);
        C.setEnabled(true);
        C.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragepool.Anhalten();
            }
        });
        fenster.add(B);
        
        B = new Button();
        B.setLocation(70,35);
        
        B.setVisible(true);
        B.setSize(100,30);
        B.setEnabled(true);
        B.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragepool.Weiterschalten();
            }
        });
        fenster.add(D);
            D = new Button();
        D.setLocation(70,35);
        
        D.setVisible(true);
        D.setSize(100,30);
        D.setEnabled(true);
        D.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fragepool.Weiterschalten();
            }
        });
        

        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
    }
}
