package src.test;
import org.junit.runner.JUnitCore;

public class Test {
    public static void main(String[] args) {
        JUnitCore.runClasses(BakbremsTest.class);
        JUnitCore.runClasses(SykkelbutikkTest.class);
        JUnitCore.runClasses(GearTest.class);
        JUnitCore.runClasses(ForbremsTest.class);
    }
}
