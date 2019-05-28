public class Shrek extends Ogre {
    public Shrek(int x, int y, int damage){
        super(x,y,damage);
    }
    @Override
    public void inflict(){
        System.out.println();
        System.out.println("Shrek shouts 'WHAT ARE YOU DOING IN MY SWAMP!");
        System.out.println("Shrek has demolished you");
        System.out.println();
    }
}
