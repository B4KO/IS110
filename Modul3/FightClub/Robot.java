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
