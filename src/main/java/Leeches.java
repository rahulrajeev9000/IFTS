public class Leeches extends Danger{
    public Leeches(int x, int y, int damage){
        super(x,y,damage);
    }
    public void inflict(){
        System.out.println("You have been bitten by leaches");
        System.out.println();
    }
}
