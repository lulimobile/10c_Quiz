import static java.lang.System.*;
import javax.swing.*;
import java.awt.*;

public class Spiel 
{
Frage frage1;
Frage frage2;

public static void main ( String[]  args)
    {
        frage1 = new Frage();
        frage2 = new Frage();
    int punkte = 0;
    String[] frage1 =
    {
     "Hauptstadt von Serbien ?",
     " <a> Ljubljana",
     " <b> Zagreb",
     " <c> Belgrad",
     "c"
    };
    String[] frage2 =
    {
        "Wie heißt der deutsche Innenminister",
        " <a> Horst Seehofer",
        " <b> Heiko Maas",
        " <c> Christine Lambrecht",
        "a"
    };
    
String[] pool = 
    {
        frage1,frage2
    };

    for(int i=0;i<pool.length;i++);
    {
        System.out.printIn(pool[i][0]);
        System.out.printIn(pool[i][1]);
        System.out.printIn(pool[i][2]);
    }
    }
}



