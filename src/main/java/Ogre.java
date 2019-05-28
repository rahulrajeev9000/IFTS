public class Ogre extends Danger {
    public Ogre(int x, int y, int damage){
        super(x,y,damage);
    }
    public void inflict(){
        System.out.println();
        System.out.println("Ogre has stabbed you");
        System.out.println();
    }
}
