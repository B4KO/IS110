
/**
 * Write a description of class Fighter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fighter
{
    // instance variables - replace the example below with your own
    private int hp;
    private int atk;
    public String name;

    public Fighter(int ihp,int iatk, String iname)
    {
        hp = ihp;
        atk = iatk;
        name = iname;
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
