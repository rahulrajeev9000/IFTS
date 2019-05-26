public class Danger extends Object {
    private int damage;
    public Danger(int x, int y, int damage) {
        super(x, y);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
