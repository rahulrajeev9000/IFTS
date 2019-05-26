public class Goblins extends Danger {
    public Goblins(int x, int y, int damage){
        super(x,y,damage);
    }
    public void stab(){
        System.out.println("Goblin has stabbed you");
    }
}
