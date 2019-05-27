import java.util.Scanner;

public class Game {
    public void game(){
        System.out.println("You are now stuck in an infinite swamp. Find the treasure to get out of the swamp. Don't get lost and try not to find yourself in trouble");
        System.out.println("Use WASD keys to move about");

        Scanner move = new Scanner(System.in);
        Boolean level = true;
        Boolean playing = true;
        int points =0;
        while (level) {
        Player rahul = new Player(0,0, 20);
            int tx = -10 + (int) (Math.random() * 20 + 1);
            int ty = -10 + (int) (Math.random() * 20 + 1);


            Treasure treasure = new Treasure(tx, ty);
            Goblins g1 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g2 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g3 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g4 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g5 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g6 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g7 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g8 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g9 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Leeches l1 = new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Leeches l2 = new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Leeches l3 = new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);



            while (playing) {

                Compass compass = new Compass(rahul.getX(), rahul.getY(), treasure.getX(), treasure.getY());
                compass.getDistance();
                System.out.println("You are " + compass.distance + "m away from the treasure");
                System.out.println("You have " + rahul.getHealth() + " Health");
                System.out.println("You have " + points + " points");


                String dir = move.nextLine();
                if (dir.equals("w") || dir.equals("W")) {
                    rahul.setY(rahul.getY() + 1);
                    System.out.println("You have moved one space North");

                } else if (dir.equals("a") || dir.equals("A")) {
                    rahul.setX(rahul.getX() - 1);
                    System.out.println("You have moved one space West");
                } else if (dir.equals("s") || dir.equals("S")) {
                    rahul.setY(rahul.getY() - 1);
                    System.out.println("You have moved one space South");
                } else if (dir.equals("d") || dir.equals("D")) {
                    rahul.setX(rahul.getX() + 1);
                    System.out.println("You have moved one space East");
                }

                if (rahul.getX() == g1.getX() && rahul.getY() == g1.getY()) {
                    rahul.setHealth(rahul.getHealth() - g1.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g2.getX() && rahul.getY() == g2.getY()) {
                    rahul.setHealth(rahul.getHealth() - g2.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g3.getX() && rahul.getY() == g3.getY()) {
                    rahul.setHealth(rahul.getHealth() - g3.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g4.getX() && rahul.getY() == g4.getY()) {
                    rahul.setHealth(rahul.getHealth() - g4.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g5.getX() && rahul.getY() == g5.getY()) {
                    rahul.setHealth(rahul.getHealth() - g5.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g6.getX() && rahul.getY() == g6.getY()) {
                    rahul.setHealth(rahul.getHealth() - g6.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g7.getX() && rahul.getY() == g7.getY()) {
                    rahul.setHealth(rahul.getHealth() - g7.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == g8.getX() && rahul.getY() == g9.getY()) {
                    rahul.setHealth(rahul.getHealth() - g9.getDamage());
                    g1.inflict();
                }
                if (rahul.getX() == l1.getX() && rahul.getY() == l1.getY()) {
                    rahul.setHealth(rahul.getHealth() - l1.getDamage());
                    l1.inflict();
                }
                if (rahul.getX() == l2.getX() && rahul.getY() == l2.getY()) {
                    rahul.setHealth(rahul.getHealth() - l3.getDamage());
                    l2.inflict();
                }
                if (rahul.getX() == l3.getX() && rahul.getY() == l3.getY()) {
                    rahul.setHealth(rahul.getHealth() - l3.getDamage());
                    l3.inflict();
                }
                if (rahul.getHealth() < 1) {
                    playing = false;
                    System.out.println("You have died");

                }
                if (rahul.getX() == treasure.getX() && rahul.getY() == treasure.getY()) {

                    level = false;
                    System.out.println("You have found the treasure!!!");

                    playing = false;


                }


            }

        }points = points + 100;

    }
}