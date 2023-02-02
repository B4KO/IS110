package src.main;
import java.util.ArrayList;

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