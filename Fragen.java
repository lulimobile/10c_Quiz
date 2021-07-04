class Fragen
{
    int zufall;
    String fragen[] = new String[30];
    static String frage;
    
    public Fragen()
    {
        fragen[1] = "Was ist die Hauptstadt von Indien?$Neu Delhi$Mumbai$Ankara$Canberra$1";
        fragen[2] = "Wie alt war Mike Tyson bei seinem 1. WM-Titel?$20$23$31$19$1";
        fragen[3] = "Wo liegt der kleinste Knochen im menschl. Körper?$Fuß$Hand$Ohr$Becken$3";
        fragen[4] = "Wer singt 'der Kommissar'?$Fanta4$Peter Maffay$Falco$Seeed$3";
        fragen[5] = "Was ist ein Tapir? $Fisch$Vogel$Schlange$Säugetier$4";
        fragen[6] = "Wie alt wurde Mozart? $42$54$35$21$3";
        fragen[7] = "Wieviel wiegt ein neugeborener Elefant? $100kg$42kg$230kg$24kg$1";
        fragen[8] = "Wer gewann die EM 2004?$Deutschland$Italien$Griechenland$Spanien$3";
        fragen[9] = "Wieviel kcal haben 100g Erdnüsse?$1200$340$677$567$4";
        fragen[10] = "Welches Körperteil fehlt van Gogh?$Ohr$Hand$Fuß$Arm$1";
        fragen[11] = "Wann ist der Tag der deutschen Einheit?$2.6$5.9$3.10$12.7$3";
        fragen[12] = "Wann waren die olympischen Spiele zuletzt in München?$1997$1975$2001$1972$4";
        fragen[13] = "Seit welchem Jahr ist die USA unabhängig?$1776$1655$1803$1921$1";
        fragen[14] = "Wieviel kg sind der aktuelle Weltrekord im Kreuzheben?$354kg$762kg$501kg$455kg$3";
        fragen[15] = "Wie oft gewann Joe Montana den Superbowl?$4 Mal$6mMal$1 Mal$0 Mal$1";
        frage = fragen[zufall(1,16)];
        
    }
    public int zufall( int min, int max)
    {
        zufall = (int)((max-min)*Math.random()+min);
        return zufall;
    }
}