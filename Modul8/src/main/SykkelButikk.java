package src.main;
import java.util.ArrayList;

class SykkelButikk {

    private ArrayList<Sykkel> _sykler;

    public void registrerSykkel(Sykkel sykkel) {
        _sykler.add(sykkel);
    }
    public void registrerSykkel(ArrayList<Sykkel> sykler) {
        for (Sykkel sykkel : sykler) {
            _sykler.add(sykkel);
        }
    }

    public void skrivUtOversikt() {
        for (Sykkel sykkel : _sykler) {
            System.out.println(sykkel);
        }
    }

    public void skrivUtOversiktDyrere(int grense) {
        for (Sykkel sykkel : _sykler) {
            if (sykkel.faaPris() > grense) {
                System.out.println(sykkel);
            }
        }
    }

    public void sokSykkel(String type) {
        for (Sykkel sykkel : _sykler) {
            if (sykkel.faaType() == type) {
                System.out.println(sykkel);
            }   
        }
    }



}