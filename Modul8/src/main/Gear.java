
package src.main;

public class Gear {
    private int _antallGear;
    private int _naaGear = 0;
    public Gear(int antallGear) {
        _antallGear = antallGear;
    }

    public int gearNaa() {
        return _naaGear;
    }

    public int get_antallGear() { return _antallGear;}


    //Refactor down bellow to work on negative ints then you can scratch the func bellow
    public void changeGear(int amount) {

        _naaGear += amount;

        if (_naaGear >= _antallGear) {
            System.out.println("Max gear");
            _naaGear = _antallGear;
            return;
        }

        if (_naaGear <= 0) {
            System.out.println("Min gear");
            _naaGear = 0;
            return;
        }

        System.out.println("Changing gear, current: "+_naaGear);


    }
}
