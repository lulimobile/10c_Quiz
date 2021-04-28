class PUNKTEZAEHLER
{
    
     private JFrame fenster;
    
   
    private static final int groesse = OBERFLAECHE. RasterGroesseGeben ();
    private boolean wertGesetzt;
    private int punkte = 0;
    
    PUNKTEZAEHLER()
    {
        this (OBERFLAECHE. FensterBreiteGeben () / groesse - 3, OBERFLAECHE. FensterHoeheGeben () / groesse - 3);
    }
    
}