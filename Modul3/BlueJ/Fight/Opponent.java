
/**
 * Write a description of class Oponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Opponent
{
    private int hp;
    private int atk;
    public String name;

    public Opponent(int ihp,int iatk, String iname)
    {
        hp = ihp;
        atk = iatk;
        name = iname;
    }

    public int doubbleAttack() {
        return attack() * 2;
    }
    
    public int attack() {
        return atk;
    }
    
    public int get_hp() {
        return hp;
    }
    
    public void reduce_hp(int dmg) {
        hp = hp - dmg;
    }
}
