class Robot {

    public String name;
    public int hp;
    private int damage;

    public Robot(String iname, int ihp) {
        name = iname;
        hp = ihp;
    }

    public int attack() {
        return damage;
    }


    public void getAttacked(int incommingDamage) {
        hp -= incommingDamage;
    }

}

class Monster {
    public int hp = 100;
    public int dmg = 10;
    public String name = "Jens Stoltenberg";
}

class Fight {
    private Monster monster;
    private Robot robot;

    public Fight(Monster fighter1, Robot fighter2) {
        monster = fighter1;
        robot = fighter2;
    }

    public void WhoWins() {
        while (true) {
            monster.hp -= robot.attack();
            if (monster.hp <= 0) {
                System.out.println("Robot "+robot.name+" wins!");
                break;
            }
            robot.getAttacked(monster.dmg);
            if (robot.hp <= 0) {
                System.out.println("Monster "+monster.name+" wins!");
                break;
            }

        }
    }
}








class main
{
public static void main(String[] args) {
    Robot roboDavid = new Robot("David", 300);
    Monster monsterJens = new Monster();
    Fight round1 = new Fight(monsterJens, roboDavid);
    round1.WhoWins();


    
    
}
}