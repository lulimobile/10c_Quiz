import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.Random;;
public  class FRAGEPOOL
{
    Button A;
    Button B;
    Button C;
    Button D; 
   Label fragetext;
   Frame fenster;
   public FRAGEPOOL()
   
   {
   
        
        fragetext = new Label();
        fragetext.setText("Hier steht später die Frage und ggf. die Antworten.");
        fragetext.setVisible(true);
        fragetext.setLocation(200,50);
        fragetext.setSize(400,50);
        fenster.add(fragetext);
}
}

 class RandomNumbers{
        public static void main(String[] args) {
            Random objGenerator = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int randomNumber = objGenerator.nextInt(100);
              System.out.println("Random No : " + randomNumber); 
             }
     }



void FragepoolWeiterschalten()
{
    
}
}