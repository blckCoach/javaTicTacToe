import java.util.Scanner;

public class PlayGround {
    boolean turn = true;
    String namePlayer1, namePlayer2;
    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

	String[] define(String[] playGround) {
		for (int i = 0; i < playGround.length; i++) {
            int tmp = i + 1;
			playGround[i] = "" + tmp;
		}
		return playGround;
	}
	void output(String[] playGround) {
        System.out.println("Player 1: " + namePlayer1 + "     " + "Player 2: " + namePlayer2);
        if (turn == true) {
            System.out.println("It is " + namePlayer1 + "'s turn");
        } else {
            System.out.println("It is " + namePlayer2 + "'s turn");
        }
		for (int i = 0; i < playGround.length; i++) {
            System.out.print("[" + playGround[i] + "]");
			if (i % 3 == 2) {
				System.out.println();
            }
		}
	}
    void startGame() {
        System.out.println("Welcome to TicTacToe");
        System.out.println("Choose a playing mode");
        System.out.println("1 for: 1 vs 1");
        System.out.println("2 for: 1 vs AI");
        
        int gameMode = scannerInt.nextInt();
        try{
        switch (gameMode) {
            case 1: 
               System.out.println("You choose to play 1 vs 1");
               System.out.println("Enter the name of Player 1: ");
               namePlayer1 = scannerString.next();
               System.out.println("Enter the name of Player 2: ");
               namePlayer2 = scannerString.next();
               break;
            case 2:
               System.out.println("You choose to play 1 vs AI");
               System.out.println("Enter the name of Player 1: ");
               namePlayer1 = scannerString.next();
               break;
            default:
               throw new Exception(); 
        }
        } catch (Exception e) {
            System.out.println("The mode you choosed is not available");
            System.exit(0);
        }
    }
    String[] moves(String[] playGround) {
        try {
        System.out.println("Choose a field using the numbers");
        int move = scannerInt.nextInt();
        if (playGround[move - 1].equals("X") || playGround[move - 1].equals("O")) {
            throw new Exception();
        }
        if (move < 9 || move > 1) {
            if (turn == true) {
                playGround[move - 1] = "X";
                turn = false;
            } else {
                playGround[move - 1] = "O";
                turn = true;
            }
        } else {
            throw new Exception();
        }
        } catch (Exception e) {
            System.out.println("The field you choosed is either used or does not exist");
            moves(playGround);
        }
         
        
        return playGround;
    }
}
