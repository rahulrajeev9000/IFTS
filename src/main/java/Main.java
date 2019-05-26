import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Game game = new Game();
        System.out.println("Press space to start");
        Scanner start = new Scanner(System.in);
        String stt = start.nextLine();

        while (stt != " "){
        if (stt.equals(" ")) {
            game.game();
        }
        }





    }

}
