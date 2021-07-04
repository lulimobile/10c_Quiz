

class Fragenwechsel
{
    static String richtigeFrage = null;
    static String op1 = null;
    static String op2 = null;
    static String op3 = null;
    static String op4 = null;
    static int lösung = 0;
    static Spielfenster quiz;
    static Fragen frageklasse;
    static String aktuelleFrage;
    public Fragenwechsel()
    { Spielfenster quiz = new Spielfenster();
        neueFrage();
    }
    public static void neueFrage()
    { frageklasse = new Fragen();
        aktuelleFrage = Fragen.frage;
        parser();
        aendereText();
        
    }
    public static void parser()
    {
        String[] frage = aktuelleFrage.split("\\$");
        for(int x = 0;x < frage.length;x++)
        {
            switch(x)
            {
                case 0:
                richtigeFrage = frage[x];
                break;
                case 1:
                op1 = frage[x];
                break;
                case 2:
                op2 = frage[x];
                break;
                case 3:
                op3 = frage[x];
                break;
                case 4:
                op4 = frage[x];
                break;
                case 5:
                lösung = Integer.parseInt(frage[x]);
                break;
            }
                
    }
}

public static void aendereText()
{
    quiz.LabelTextWechsel(richtigeFrage);
    quiz.lösung = lösung;
    quiz.ButtonTextWechsel(1, op1);
    quiz.ButtonTextWechsel(2, op2);
    quiz.ButtonTextWechsel(3, op3);
    quiz.ButtonTextWechsel(4, op4);
    
    
}

}
