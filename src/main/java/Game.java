import java.util.Scanner;

public class Game {
    public void game(){
        System.out.println("You are now stuck in an infinite swamp. Find the treasure to get out of the swamp. Don't get lost and try not to find yourself in trouble");
        System.out.println("Use WASD keys to move about");

        Scanner move = new Scanner(System.in);
        Boolean playing = true;
        Player rahul = new Player(0,0, 20);
        Treasure treasure = new Treasure(2,3);
        Goblins g1 = new Goblins(-1,1, 5);

        while (playing){

            Compass compass = new Compass(rahul.getX(),rahul.getY(),treasure.getX(),treasure.getY());
            compass.getDistance();
            System.out.println("You are " +compass.distance+"m away from the treasure");
            System.out.println("You have "+ rahul.getHealth()+" Health");



            String dir = move.nextLine();
            if (dir.equals("w") || dir.equals("W")){
                rahul.setY(rahul.getY()+1);
                System.out.println("You have moved one space North");

            }
            else if (dir.equals("a") || dir.equals("A")){
                rahul.setX(rahul.getX()-1);
                System.out.println("You have moved one space West");
            }
            else if(dir.equals("s") || dir.equals("S")){
                rahul.setY(rahul.getY()-1);
                System.out.println("You have moved one space South");
            }
            else if (dir.equals("d") || dir.equals("D")){
                rahul.setX(rahul.getX()+1);
                System.out.println("You have moved one space East");
            }

            if (rahul.getX()== g1.getX() && rahul.getY()==g1.getY()){
                rahul.setHealth(rahul.getHealth()-g1.getDamage());
                g1.stab();
            }
            if (rahul.getHealth()<1){
                playing=false;
                System.out.println("You have died");
            }
            if (rahul.getX()== treasure.getX() && rahul.getY()==treasure.getY()){
                playing = false;
                System.out.println("You have found the treasure!!!");
            }
                    




        }


    }
}