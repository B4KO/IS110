package src.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import src.main.Forbrems;
import src.main.Gear;
import java.util.concurrent.ThreadLocalRandom;
public class ForbremsTest {

    @Test
    public void forbremsMengdeBrems() {
        int maxStyrke = 420;
        Forbrems forbrems = new Forbrems(maxStyrke, 2020, "Shimano");
        for (int i = 0; i < 100; i++) {
            int expected = maxStyrke * i;
            assertEquals(expected, forbrems.styrkeNaa(i));
        }
    }
}
