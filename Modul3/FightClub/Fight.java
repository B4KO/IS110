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


