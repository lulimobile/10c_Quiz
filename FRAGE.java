



 class FRAGE
{
     String antwort1;
     String antwort2;
     String antwort3;//Antwort
     String antwortRichtig;
     String fragetext;
     String t;
     String frage;
     String antwortA;//Button
     String antwortB;
    String  antwortC;
    public  FRAGE (String frage,String antworta, String antwortb, String antwortc)
    {
        fragetext = frage;
        antwort1 = antworta;
        //Zuteilung der Antwort
        antwort2 = antwortb;
        antwort3 = antwortc;
        t = antwortRichtig;
        antwortA = antworta;
        //Zuteilung des Buttons
    }
    void NächsteFrage(String frage )
    { 
        if(t != antwortRichtig)
        { frage[i]=(i+1);
        }
        else 
        {
            
        }
    }
}
