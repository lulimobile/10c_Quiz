
import java.awt.*;
import java.awt.event.*;

class ZEICHENFLAECHE
{
    Frame fenster;
    Label fragetext;
    Button antwortA;
    Button antwortB;
    Button antwortC;
    String antwort1;
    String antwort2;
    String antwort3;
    String fragetext1;
    /**
     * Constructor for objects of class OBERFLAECHE
     */
    public ZEICHENFLAECHE()
    {
        fenster = new Frame("ZEICHENFLAECHE");
        fenster.setSize(600,400);
        fenster.setLocation(0,30);
        fenster.setVisible(true);
        fenster.setLayout(null);
        
        fragetext = new Label();
        fragetext.setText(fragetext1);
        fragetext.setVisible(true);
        fragetext.setLocation(160,50);
        fragetext.setSize(200,150);
        fenster.add(fragetext);
        
        antwortA = new Button();
        antwortA.setLocation(80,250);
        antwortA.setLabel(antwort1);
        antwortA.setVisible(true);
        antwortA.setSize(80,30);
        antwortA.setEnabled(true);
        antwortA.addActionListener(new ActionListener()
        
       
        
        {
            public void actionPerformed(ActionEvent e)
            {
                //Hier wird Frage A ausgewählt
            }
        });
        fenster.add(antwortA);
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
         antwortB = new Button();
        antwortB.setLocation(400,250);
        antwortB.setLabel(antwort2);
        antwortB.setVisible(true);
        antwortB.setSize(100,30);
        antwortB.setEnabled(true);
        antwortB.addActionListener(new ActionListener()
        
       
        
        {
            public void actionPerformed(ActionEvent e)
            {
                //Hier wird Frage A ausgewählt
            }
        });
        fenster.add(antwortB);
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
    });
    

        antwortC = new Button();
        antwortC.setLocation(80,150);
        antwortC.setLabel(antwort3);
        antwortC.setVisible(true);
        antwortC.setSize(100,30);
        antwortC.setEnabled(true);
        antwortC.addActionListener(new ActionListener()
        
       
        
        {
            public void actionPerformed(ActionEvent e)
            {
                //Hier wird Frage A ausgewählt
            }
        });
        fenster.add(antwortC);
        
        fenster.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
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

