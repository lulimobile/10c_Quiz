class SPIEL extends RECHTECK
{
     RECHTECK kasten;
     int PositionX;
     int PositionY;
     int breite;
     int hoehe;
     int größesetzen;
     String farbesetzen;
     RECHTECK rechteck1;
     RECHTECK rechteck2;
     RECHTECK rechteck3;
     RECHTECK rechteck4;
     public boolean sichtbar;
  
     void RECHTECK()
    {
      rechteck1 = new RECHTECK();
      rechteck2 = new RECHTECK();
      rechteck3 = new RECHTECK();
      rechteck4 = new RECHTECK();
    }
  
    void RECHTECK1 (int breite, int hoehe)
    {
          breite = 25;
        hoehe = 20;
        x = 15;
        y = 50;
        farbe = " gruen ";
        sichtbar =  true ;;
        
   
       
    }
    
        void RECHTECK2 (int breite, int hoehe)
    {
        breite = 25;
        hoehe = 20;
        x = 15;
        y = 15;
        farbe = " gruen ";
        sichtbar =  true ;
       
    }
    
      void RECHTECK3 (int breite, int hoehe)
    {
         breite = 25;
        hoehe = 20;
        x = 50;
        y = 15;
        farbe = " gruen ";
        sichtbar =  true ;
   
       
    }
    
      void RECHTECK4 (int breite, int hoehe)
    {
        breite = 25;
        hoehe = 20;
        x = 50;
        y = 50;
        farbe = " gruen ";
        sichtbar =  true ;
   
       
    }
}
