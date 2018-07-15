/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_shooting;

/**
 *
 * @author Somesh
 */
public class PlayerActions extends Board {

    boolean flag = true;

    void PlayerActions1() {
        int i = hposx, j = hposy;
        while (flag) {
            boarddisp();
            System.out.println("your are at pos " + i + " " + j);
            System.out.println("Enter your move 6(right) 4(left) 8(up) 2(down)");
            int ch = s.nextInt();
            int tmpi, tmpj;
            switch (ch) {
                case 8:
                    System.out.println("Move upwards");
                    tmpi = i - 1;
                    if (tmpi < 0) {
                        System.out.println("Error");
                        break;
                    }
                    if (board[tmpi][j] == 'w') {
                        System.out.println("Illegal move ");
                        System.out.println("wall is ahead " + i + " " + j);
                    } else if (board[tmpi][j] == 'v') {

                        System.out.println("Player Killed You Lost...");
                        flag = false;

                    } else if (board[tmpi][j] == 'k') {

                        System.out.println("You Won...");
                        flag = false;
                    } else {
                        board[tmpi][j] = 'h';
                        board[i][j] = ' ';
                        i--;
                    }
                    break;
                case 4:
                    System.out.println("Move leftwards");
                    tmpj = j - 1;
                    if (tmpj < 0) {
                        System.out.println("Error");
                        break;
                    }
                    if (board[i][tmpj] == 'w') {
                        System.out.println("Illegal move ");

                    } else if (board[i][tmpj] == 'v') {
                        System.out.println("Player Killed You Lost...");

                        flag = false;

                    } else if (board[i][tmpj] == 'k') {
                        System.out.println("You Won...");

                        flag = false;
                    } else {
                        board[i][tmpj] = 'h';

                        board[i][j] = ' ';
                        j--;
                    }
                    break;
                case 6:
                    System.out.println("Move rightwards");
                    tmpj = j + 1;
                    if (tmpj > 9) {
                        System.out.println("Error");
                        break;
                    }
                    if (board[i][tmpj] == 'w') {
                        System.out.println("Illegal move ");

                    } else if (board[i][tmpj] == 'v') {
                        System.out.println("Player Killed You Lost...");

                        flag = false;

                    } else if (board[i][tmpj] == 'k') {
                        System.out.println("You Won...");

                        flag = false;
                    } else {
                        board[i][tmpj] = 'h';

                        board[i][j] = ' ';
                        j++;
                    }
                    break;
                case 2:
                    System.out.println("Move downwards");
                    tmpi = i + 1;
                    if (tmpi > 9) {
                        System.out.println("Error");
                        break;
                    }
                    if (board[tmpi][j] == 'w') {
                        System.out.println("Illegal move ");

                    } else if (board[tmpi][j] == 'v') {
                        System.out.println("Player Killed You Lost...");

                        flag = false;

                    } else if (board[tmpi][j] == 'k') {
                        System.out.println("You Won...");

                        flag = false;
                    } else {
                        board[tmpi][j] = 'h';

                        board[i][j] = ' ';
                        i++;
                    }
                    break;
            }
        }
    }

}
