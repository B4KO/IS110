package src.test;

import org.junit.Test;
import src.main.Bakbrems;

import static org.junit.Assert.assertEquals;


public class BakbremsTest {
    @Test
    public void bakbremsMengdeBrems() {
        int maxStyrke = 420;
        Bakbrems bakbrems = new Bakbrems(maxStyrke, 2020, "Shimano");
        for (int i = 0; i < 100; i++) {
            int expected = maxStyrke * i;
            assertEquals(expected, bakbrems.styrkeNaa(i));
        }
    }
}

