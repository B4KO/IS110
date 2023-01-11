
/**
 * Write a description of class Vare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vare
{
    // instance variables - replace the example below with your own
    private int antall;
    private String navn;

    /**
     * Constructor for objects of class Vare
     */
    public Vare(int nyAntall, String nyNavn)
    {
        antall = nyAntall;
        navn = nyNavn;
    }

    public int antallVare() {
        return antall;
    }
    
    public int nyAntall(int nyAntall) {
        antall = nyAntall;
        return antall;
        
    }
}
