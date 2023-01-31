
/**
 * Write a description of class Fight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fight
{
    // instance variables - replace the example below with your own
    private Opponent opponent;
    private Fighter fighter;
    

    public Fight(Opponent iopponent, Fighter ifighter)
    {
         opponent = iopponent;
         fighter = ifighter;
    }

    public void announceWinner()
    {
        while (true) {
            
            fighter.reduce_hp(opponent.attack());
            
            if (fighter.get_hp() <= 0) {
                System.out.println("WINNER: "+opponent.name+"!");
                break;
                
            }
            
            opponent.reduce_hp(fighter.attack());
            
            if (opponent.get_hp() <= 0) {
                System.out.println("WINNER: "+fighter.name+"!");
                break;
            }
        
        }
        
        
 
    }
}
