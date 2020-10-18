import java.util.Scanner;

public class Game{
    String[] playGround = new String[9];
    void define() {
        for (int i = 0; i < playGround.length; i++) {
            int tmp = i + 1;
            playGround[i] = "" + tmp;
        }
    }

    void output() {
        for (int i = 0; i < playGround.length; i++) {
            System.out.print("[" + playGround[i] + "]");
            if ( i % 3 == 2) {
                System.out.println();
            }
        }
    }

    void move() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wählen Sie ein Feld aus (verwenden Sie hierfür die Zahlen):");
        int pointer = scanner.nextInt();
        change(pointer - 1);
    }
    
    String symbol = "X";
    void change(int pointer) {
        int tmp = pointer + 1;
        if ( playGround[pointer].equals("" + tmp)) {
            playGround[pointer] = "" + symbol;
            System.out.println("successful");
            if (symbol.equals("X")) {
                symbol = "O";
            } else {
                symbol = "X";
            }
        } else {
            System.out.println("Field is already used, choose anotherone");
            move();
        }
    }
}
