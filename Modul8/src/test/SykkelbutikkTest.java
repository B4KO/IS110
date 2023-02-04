package src.test;

import org.junit.Test;
import src.main.Bakbrems;
import src.main.Forbrems;
import src.main.Gear;
import src.main.Sykkel;
import src.main.SykkelButikk;

import java.util.ArrayList;

import java.util.Random;

public class SykkelbutikkTest {


    public static void SykkelbutikkLeggTilSykkler(int antall) {
        Random rand = new Random();

        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("Rød");
        colorList.add("Blå");
        colorList.add("Grønn");
        colorList.add("Gul");
        colorList.add("Rosa");
        colorList.add("Lilla");
        colorList.add("Svart");
        colorList.add("Hvit");

        ArrayList<String> typeList = new ArrayList<>();

        typeList.add("MIZUNO");
        typeList.add("SIMANO");
        typeList.add("HONDA");
        typeList.add("TOYOTA");

        Forbrems mizunoFor = new Forbrems(100, 2000, "Mizuno");
        Bakbrems mizunoBak = new Bakbrems(100, 2000, "Mizuno");

        SykkelButikk sykkelbutikk = new SykkelButikk();

        for (int i = 0; i <= antall+1; i++) {
            Sykkel sykkel = new Sykkel(colorList.get(rand.nextInt(8)), typeList.get(rand.nextInt(4)), rand.nextInt(5000), new Gear(rand.nextInt(20)),mizunoFor ,mizunoBak );
            sykkelbutikk.registrerSykkel(sykkel);
        }

        sykkelbutikk.skrivUtOversikt();

    }



}