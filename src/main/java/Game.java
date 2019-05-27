import java.util.Scanner;

public class Game {
    int points =0;
    public void game(){
        System.out.println("You are now stuck in an infinite swamp. Find the treasure to get out of the swamp. Don't get lost and try not to find yourself in trouble");
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
            Goblins g1 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g2 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g3 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g4 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g5 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g6 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g7 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g8 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Goblins g9 = new Goblins(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 5);
            Leeches l1 = new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 2);
            Leeches l2 = new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 2);
            Leeches l3 = new Leeches(-10 + (int) (Math.random() * 20 + 1), -10 + (int) (Math.random() * 20 + 1), 2);



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

                if (p1.getX() == g1.getX() && p1.getY() == g1.getY()) {
                    p1.setHealth(p1.getHealth() - g1.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g2.getX() && p1.getY() == g2.getY()) {
                    p1.setHealth(p1.getHealth() - g2.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g3.getX() && p1.getY() == g3.getY()) {
                    p1.setHealth(p1.getHealth() - g3.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g4.getX() && p1.getY() == g4.getY()) {
                    p1.setHealth(p1.getHealth() - g4.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g5.getX() && p1.getY() == g5.getY()) {
                    p1.setHealth(p1.getHealth() - g5.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g6.getX() && p1.getY() == g6.getY()) {
                    p1.setHealth(p1.getHealth() - g6.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g7.getX() && p1.getY() == g7.getY()) {
                    p1.setHealth(p1.getHealth() - g7.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == g8.getX() && p1.getY() == g9.getY()) {
                    p1.setHealth(p1.getHealth() - g9.getDamage());
                    g1.inflict();
                }
                if (p1.getX() == l1.getX() && p1.getY() == l1.getY()) {
                    p1.setHealth(p1.getHealth() - l1.getDamage());
                    l1.inflict();
                }
                if (p1.getX() == l2.getX() && p1.getY() == l2.getY()) {
                    p1.setHealth(p1.getHealth() - l3.getDamage());
                    l2.inflict();
                }
                if (p1.getX() == l3.getX() && p1.getY() == l3.getY()) {
                    p1.setHealth(p1.getHealth() - l3.getDamage());
                    l3.inflict();
                }
                if (p1.getHealth() < 1) {
                    playing = false;
                    System.out.println("You have died");
                    System.out.println("You have " + points+ " points");
                    points = 0;

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