package src.main;

import java.util.Random;

public class Sykkel {
    
    Random rand = new Random();
    private String _farge;
    private String _type;
    private int _pris;
    private Gear _gear;
    private Forbrems _forbrems;
    private Bakbrems _bakbrems;

    public Sykkel(String farge, String type, int pris, Gear gear, Forbrems forbrems, Bakbrems bakbrems) {
        _farge = farge;
        _type = type;
        _pris = pris;
        _gear = gear;
        _forbrems = forbrems;
        _bakbrems = bakbrems;

    }

    public String faaType() {
        return _type;
    }

    public int faaPris() { return _pris; }

    public int hastighet(int tidspunkt) {
        return rand.nextInt();
    };

    @Override
    public String toString() {
        return _farge + " " + _type + " sykkel for " + _pris +" kr";
    }
}