import java.util.Scanner;

public class Game{
    String[] playGround = new String[9];
    String symbol = "X";
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
        System.out.println("Chooose a field by typing its number: ");
        int pointer = scanner.nextInt();
        change(pointer - 1);
    }
    
    void change(int pointer) {
        int tmp = pointer + 1;
        if ( playGround[pointer].equals("" + tmp)) {
            playGround[pointer] = "" + symbol;
            rules();
            if (symbol.equals("X")) {
                symbol = "O";
            } else {
                symbol = "X";
            }
        } else {
            System.out.println("Field is already used, choose anotherone");
            output();
            move();
        }
    }
    void rules() {
        int count = 0;
        //rules for rows 
        for (int i = 0; i < playGround.length; i++) {
            if (i % 3 == 0) {
                count = 0;
            }
            if (playGround[i].equals(symbol)) {
                count++;
            }
            if (count == 3) {
                output();
                if (symbol.equals("X")) {
                    System.out.println("Player 1 wins");
                } else {
                    System.out.println("Player 2 wins");
                }
                System.exit(0);
            }
        }
        count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < playGround.length; j++) {
                if (j % 3 == i & playGround[j].equals(symbol)) {
                    count++;
                }
                if (count == 3) {
                    output();
                    if (symbol.equals("X")) {
                        System.out.println("Player 1 wins");
                    } else {
                        System.out.println("Player 2 wins");
                    }
                    System.exit(0);
                }
            }
            count = 0;
        }
        int tmp = 0;
        count = 0;
        while (tmp < playGround.length) {
            if (playGround[tmp].equals(symbol)) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                output();
               if (symbol.equals("X")) {
                System.out.println("Player 1 wins");
                } else {
                System.out.println("Player 2 wins");
                }
                System.exit(0);
            }
            tmp += 4;
        }
        tmp = 2;
        count = 0;
        while (tmp < playGround.length - 1) {
            if (playGround[tmp].equals(symbol)) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                output();
               if (symbol.equals("X")) {
                System.out.println("Player 1 wins");
                } else {
                System.out.println("Player 2 wins");
                }
                System.exit(0);
            }
            tmp += 2;
        }
    }
}
