import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    int points =0;
    public void game(){
        System.out.println("You are now stuck in an infinite swamp. Find the treasure to get out of the swamp. Don't get lost and try not to find yourself in trouble");
        System.out.println("There are many dangers!");
        System.out.println("Use WASD keys to move about");
        System.out.println();

        Scanner move = new Scanner(System.in);
        Boolean level = true;
        Boolean playing = true;


        while (level) {
        Player p1 = new Player(0,0, 15);
            int tx = -10 + (int) (Math.random() * 20 + 1);
            int ty = -10 + (int) (Math.random() * 20 + 1);

            Treasure treasure = new Treasure(tx, ty);
            Shrek shrek = new Shrek(1,1,15);


            Ogre[]ogre= new Ogre[60];
            for (int i = 0;i<ogre.length; i++ ){
                ogre[i]=new Ogre(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            }

            Leeches[]leech= new Leeches[60];
            for (int i = 0;i<leech.length; i++ ){
                leech[i]=new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 2);
            }

            while (playing) {

                Compass compass = new Compass(p1.getX(), p1.getY(), treasure.getX(), treasure.getY());
                compass.getDistance();
                System.out.println("You are " + compass.distance + "m away from the treasure");
                System.out.println("You have " + p1.getHealth() + " Health");
                System.out.println("You have " + points + " points");


                String dir = move.nextLine();
                if (dir.equals("w") || dir.equals("W")) {
                    p1.setY(p1.getY() + 1);
                    System.out.println("You have moved one space North");

                } else if (dir.equals("a") || dir.equals("A")) {
                    p1.setX(p1.getX() - 1);
                    System.out.println("You have moved one space West");
                } else if (dir.equals("s") || dir.equals("S")) {
                    p1.setY(p1.getY() - 1);
                    System.out.println("You have moved one space South");
                } else if (dir.equals("d") || dir.equals("D")) {
                    p1.setX(p1.getX() + 1);
                    System.out.println("You have moved one space East");
                }
                for (int i=0; i<ogre.length;i++) {
                    if (p1.getX() == ogre[i].getX() && p1.getY() == ogre[i].getY()) {
                        p1.setHealth(p1.getHealth() - ogre[i].getDamage());
                        ogre[i].inflict();
                    }
                }
                for (int i=0; i<leech.length;i++) {
                    if (p1.getX() == leech[i].getX() && p1.getY() == leech[i].getY()) {
                        p1.setHealth(p1.getHealth() - leech[i].getDamage());
                        leech[i].inflict();
                    }
                }
                if (p1.getX() == shrek.getX() && p1.getY() == shrek.getY()) {
                    p1.setHealth(p1.getHealth() - shrek.getDamage());
                    shrek.inflict();
                }

                if (p1.getHealth() < 1) {
                    playing = false;
                    System.out.println("You have died");
                    System.out.println("You have " + points+ " points");
                    points = 0;
                    Scanner game = new Scanner(System.in);
                    System.out.println("Press space to restart");
                    String restart = game.nextLine();
                    if (restart.equals(" ")){
                        level = false;
                    }else{
                        level = false;
                    }

                }
                if (p1.getX() == treasure.getX() && p1.getY() == treasure.getY()) {

                    playing = false;
                    System.out.println("You have found the treasure!!!");
                    System.out.println();
                    level = false;

                }

            }

        }points = points + 100;

    }
}
