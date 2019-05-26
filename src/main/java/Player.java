public class Player extends Object {
    private int health;
    public Player(int x, int y, int health){
        super(x,y);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}