
/**
 * In der Klasse Auto wird ein Auto mit den Spezifikationen Marke, Typ, Hubraum
 * und turbo erstellt. 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Auto
{
    private String marke; //Automarke with input restrictions
    private String typ; //Autotyp with input restricitions
    private double hubraum; //Hubraum with input restricitions
    private boolean turbo;
    private int bestand;
    private String markeCode;
    private String typCode;
    
    /**
     * Der Konstruktor erstellt ein Auto mit spezifizierter Automarke, Autotyp,
     * hubraum, ob mit oder ohne Turbo.
     * Setzt den Lagerbestand auf 0.
     */
    public Auto(String automarke, String autotyp, double liter, boolean turbotrueOderfalse)
    {
        setzeMarke(automarke);
        setzeTyp(autotyp);
        setzeHubraum(liter);
        setzeTurbo(turbotrueOderfalse);
        bestand = 0;  //Setzt den Lagerbestand auf 0.
    }
    
    /*
     * Ermöglich dem User eine neue Deklaration der Automarke und definiert dessen
     * Eingabeeinschränkung von 3 bis 10 Zeichen.
     */
    
    public void setzeMarke(String automarke){
        marke = automarke;
        if(marke.length() < 3 || marke.length() > 10){
            System.out.println("Die Automarke muss zwischen 3 und 10 Zeichen lang sein.");
            marke = "___";
        }
    }
     
     /*
     * Ermöglich dem User eine neue Deklaration des Autotyps und definiert dessen
     * Eingabeeinschränkung von 3 bis 10 Zeichen.
     */
    public void setzeTyp(String autotyp){
        typ = autotyp;
        if(typ.length() < 3 || typ.length() > 10){
            System.out.println("Der Autotyp muss zwischen 3 und 10 Zeichen lang sein.");
            typ = "___";
        }
    }
    
    /*
     * Ermöglich dem User eine neue Deklaration des Hubraums und definiert dessen
     * Eingabeeinschränkung von 0.5 bis 8 Litern.
     */
    public void setzeHubraum(double liter){
        hubraum = liter;
        if(hubraum < 0.5 || hubraum > 8.0){
              System.out.println("Die Literangabe muss zwischen 0.5 und 8 Litern liegen.");
              hubraum = 0.0;
        }
    }
          
     /**
     * Diese Methode validiert, ob ein Turbomotor deklariert wird oder nicht.
     *
     * Bitte geben Sie "true" oder "false" ein.
     */
    public void setzeTurbo(boolean ersatzturbo){
        turbo = ersatzturbo;
    }
    
    /**
     * Die Methode erhöht den Lagerbestand um Maximal 10 Autos.
     * Bei einer Bestandesänderung von mehr als 10 Autos erhält der Benutzer eine Warnung
     * und der Lagerbestand bleibt unverändert.
     */
    
    public void erhoeheBestand(int betrag){
        if (betrag <= 10){
        bestand = bestand + betrag;
        }
        else {
          System.out.println("Die Maximale Bestandesänderung ist 10");
        }  
    }
    
    /**
     * Die Methode everringert den Lagerbestand um Maximal 10 Autos.
     * Der Benutzer erhält eine Warnung, sollte er mehr als 10 Autos verringern wollen
     * oder falls der Lagerbestand unter 0 fällt. Der Lagerbestand bleibt dann unverändert.
     */
    public void verringereBestand(int betrag){
        if (betrag <= 10){
          int illegalbestand;
          if ((illegalbestand = bestand - betrag) <= 0){
            System.out.println("Der Bestand darf nicht Negativ sein");
          }
          else {
            bestand = bestand - betrag;
          }
        }  
        else {
          System.out.println("Die Maximale Bestandesänderung ist 10");
        }  
    }
    
    /* 
     * Gibt den aktuellen Lagerbestand zurück.
     */
        public int gibbestand(){
        return bestand;
    }
    
    /*
     * Generiert den Code von der Automarke und dem Autotyp
     */
    private void codeGenerator(){
        markeCode = marke.substring(0, 3);
        typCode = typ.substring(0, 3);
    }
    
    /**
     * Erstellt die Ausgabe des Erstellten Autos.
     */
    
    public void ausgabe(){
        codeGenerator(); //Erzeugt den 3-stelligen Automarken- und Autotypcode.
        System.out.println(marke + " " + typ + ", " + hubraum + " Liter");
        System.out.print("Code: ");
        System.out.print(markeCode + "-");
        System.out.println(typCode + "-" + hubraum);
        System.out.println("Lagerbestand: " + bestand);
    }
}
