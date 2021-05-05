 
        
 class RECHTECK
{
    /** x-Position der linken oberen Ecke. */
    public int x;
    /** y-Position der linken oberen Ecke. */
   public int y;
   RECHTECK rechteck;
    /** Breite des Rechtecks. */
    private int breite;
    /** Höhe des Rechtecks. */
    private int höhe;
    /** Farbe des Rechtecks. */
    public String farbe;
    /** Sichtbarkeit des Rechtecks. */
    public boolean sichtbar;
    /** Referenz auf das Delegate-Objekt. */
    public Object symbol;
    
    

    /**
     * Der Konstruktor erzeugt das Delegate-Objekt
     */
    RECHTECK ()
    {
        x = 1;
        y = 1;
        breite = 1;
        höhe = 1;
        farbe =" schwarz";
        sichtbar = true;
        symbol = ZEICHENFLAECHE.SymbolErzeugen(ZEICHENFLAECHE.SymbolArt.rechteck);
        ZEICHENFLAECHE.PositionSetzen(symbol, x, y);
        ZEICHENFLAECHE.GrößeSetzen(symbol, breite, höhe);
        ZEICHENFLAECHE.FarbeSetzen(symbol, farbe);
        ZEICHENFLAECHE.SichtbarkeitSetzen(symbol, sichtbar);
        
    }
    
    /**
     * Setzt die Position (der linken oberen Ecke) des Rechtecks.
     * @param x x-Position der linken oberen Ecke
     * @param y y-Position der linken oberen Ecke
     */
    void PositionSetzen(int x, int y)
    {
        this.x = x;
        this.y = y;
        ZEICHENFLAECHE.PositionSetzen(symbol, x, y);
    }
        
    /**
     * Setzt die Größe des Rechtecks.
     * @param breite (neue) Breite
     * @param hoehe (neue) Höhe
     */
    void GroesseSetzen (int breite, int hoehe)
    {
        this.breite = breite;
        this.höhe = hoehe;
        ZEICHENFLAECHE.GrößeSetzen(symbol, breite, höhe);
    }
    
    /**
     * Setzt die Farbe des Rechtecks.
     * Erlaubte Farben sind:
     * "weiß", "weiss", "rot", "grün", "gruen", "blau", "gelb",
     * "magenta", "cyan", "hellgelb", "hellgrün", "hellgruen",
     * "orange", "braun", "grau", "schwarz"
     * Alle anderen Eingaben werden auf die Farbe schwarz abgebildet.
     * @param farbe (neue) Farbe
     */
    void FarbeSetzen (String farbe)
    {
        this.farbe = farbe;
        ZEICHENFLAECHE.FarbeSetzen(symbol, farbe);
    }
      
    
    
    /**
     * Schaltet die Sichtbarkeit des Rechtecks ein oder aus.
     * Erlaubte Parameterwerte: true, false
     * @param sichtbar (neue) Sichtbarkeit des Rechtecks
     */
    void SichtbarkeitSetzen (boolean sichtbar)
    {
        this.sichtbar = sichtbar;
        ZEICHENFLAECHE.SichtbarkeitSetzen(symbol, sichtbar);
    }
    
    /**
     * Bringt das Rechteck eine Ebene nach vorn.
     */
    void NachVornBringen ()
    {
        ZEICHENFLAECHE.NachVornBringen(symbol);
    }
    
    /**
     * Bringt das Rechteck in die vorderste Ebene.
     */
    void GanzNachVornBringen ()
    {
        ZEICHENFLAECHE.GanzNachVornBringen(symbol);
    }
    
    /**
     * Bringt das Rechteck eine Ebene nach hinten.
     */
    void NachHintenBringen ()
    {
        ZEICHENFLAECHE.NachHintenBringen(symbol);
    }
    
    /**
     * Bringt das Rechteck in die hinterste Ebene.
     */
    void GanzNachHintenBringen ()
    {
        ZEICHENFLAECHE.GanzNachHintenBringen(symbol);
    }
}
