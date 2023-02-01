import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

class main {
    Random rand = new Random();
    public static void main(String[] args) {
        
    }
class SykkelButikk {

    private ArrayList<Sykkel> sykler;

    public void registrerSykkel(Sykkel sykkel) {
        sykler.add(sykkel);
    }

    public void skrivUtOversikt() {
        for (Sykkel sykkel : sykler) {
            System.out.println(sykkel);
        }
    }

    public void skrivUtOversiktDyrere(int grense) {}

    public void sokSykkel(String type) {
        for (Sykkel sykkel : sykler) {
            if (sykkel.faaType() == type) {
                System.out.println(sykkel);
            }   
        }
    }



}

class Sykkel {
  

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

    public int hastighet(int tidspunkt) {
        return rand.nextInt();
    };

    @Override
    public String toString() {
        return _farge + " " + _type + "for pris: " + _pris +"KR";
    }
}

class Gear {
    private int _antallGear;
    public Gear(int antallGear) {
        _antallGear = antallGear;
    }

    public int gearNaa() {
        return rand.nextInt();
    }

}

class Forbrems {
    private int _maxStyrke;
    private int _sisteService;
    private String _type;

    public Forbrems(int maxStyrke, int sisteService, String type) {
        _maxStyrke = maxStyrke;
        _sisteService = sisteService;
        _type = type;
    }

    public int styrkeNaa(int mengdeBrems) {
        return mengdeBrems * 1;
    }

}

class Bakbrems {
    private int _maxStyrke;
    private int _sisteService;
    private String _type;

    public Bakbrems(int maxStyrke, int sisteService, String type) {
        _maxStyrke = maxStyrke;
        _sisteService = sisteService;
        _type = type;
    }

    public int styrkeNaa(int mengdeBrems) {
        return mengdeBrems * 1;
    }

}
}