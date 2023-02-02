package src.test;

import org.junit.Test;
import src.main.Gear;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;
public class GearTest {
    @Test
    public void gearAntallGear() {
        for (int expectedAntallGear = 0; expectedAntallGear < 50; expectedAntallGear++) {
            Gear gear = new Gear(expectedAntallGear);
            assertEquals(expectedAntallGear, gear.get_antallGear());
        }
    }

    @Test
    public void gearChangeGear() {
        int antallGear = 20;
        int expected = 0;

        Gear gear = new Gear(antallGear);

        for (int i = 0; i < 10; ++i) {
            int randomNum = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
            gear.changeGear(randomNum);
            expected += randomNum;

            if (expected <= 0) {
                expected = 0;
                assertEquals(expected, gear.gearNaa());
                continue;
            }

            if (expected >= antallGear) {
                expected = antallGear;
                assertEquals(expected, gear.gearNaa());
                continue;
            }

            assertEquals(expected, gear.gearNaa());

        }
    }


}
