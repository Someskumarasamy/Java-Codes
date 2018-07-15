package game_shooting;

import java.util.Scanner;

/**
 *
 * @author Somesh
 */
public class Board {

    Scanner s = new Scanner(System.in);
    char board[][] = new char[10][10];
    int xpos = 0, ypos = 0;
    int hposx=0,hposy=0;
    Board() {
        for (int i = 0; i < 10; i++) {
            board[0][i] = 'w';
            board[9][i] = 'w';
            board[i][0] = 'w';
            board[i][9] = 'w';
        }

    }

    void boardwall(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Enter pos x and y");
            xpos = s.nextInt();
            ypos = s.nextInt();
            if (board[xpos][ypos] != 'w' && board[xpos][ypos] != 'v' && board[xpos][ypos] != 'h'&& board[xpos][ypos] != 'k') {
                board[xpos][ypos] = 'w';
            } else {
                System.out.println("Oops pos is not valid");
                i--;
            }
        }
        boarddisp();
    }

    void boardvillan(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter pos x and y");
            xpos = s.nextInt();
            ypos = s.nextInt();
            if (board[xpos][ypos] != 'w' && board[xpos][ypos] != 'v' && board[xpos][ypos] != 'h'&& board[xpos][ypos] != 'k') {
                board[xpos][ypos] = 'v';
            } else {
                System.out.println("Oops pos is not valid");
                i--;
            }
        }
        boarddisp();
    }

    void boardhero() {
        boolean bool = false;
        while (!bool) {
            System.out.println("Enter the position of the hero");
            xpos = s.nextInt();
            ypos = s.nextInt();
            hposx=xpos;
            hposy=ypos;
            if (board[xpos][ypos] != 'w' && board[xpos][ypos] != 'v' && board[xpos][ypos] != 'h'&& board[xpos][ypos] != 'k') {
                board[xpos][ypos] = 'h';
                bool = true;
            }
        }
        boarddisp();
    }

    void boardkey() {
        boolean bool = false;
        while (!bool) {
            System.out.println("Enter the position of the Key");
            xpos = s.nextInt();
            ypos = s.nextInt();
            
            if (board[xpos][ypos] != 'w' && board[xpos][ypos] != 'v' && board[xpos][ypos] != 'h' && board[xpos][ypos] != 'k') {
                board[xpos][ypos] = 'k';
                bool = true;
            }
        }
        boarddisp();
    }

    void boarddisp() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

}
