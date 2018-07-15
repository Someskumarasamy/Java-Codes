/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_shooting;

import java.util.Scanner;

/**
 *
 * @author Somesh
 */
public class Game_Shooting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PlayerActions bobj = new PlayerActions();
        boolean boll = true;
        while (boll) {
            System.out.println("Hello\n welcome to the game.... here please tell us your role\n 1)Admin\n2)Player");
            int role = s.nextInt();
            switch (role) {
                case 1:
                    System.out.println("Enter Your Password");
                    String pass = s.next();
                    if (pass.equals("hello")) {
                        System.out.println("Enter the wall count");
                        int c1 = s.nextInt();
                        bobj.boardwall(c1);
                        System.out.println("Enter Villian count");
                        c1 = s.nextInt();
                        bobj.boardvillan(c1);
                        bobj.boardhero();
                        bobj.boardkey();
                    } else {
                        System.out.println("Poda venna pass thappu");
                    }
                    break;
                case 2:
                    System.out.println("let's play");
                    bobj.PlayerActions1();
                    break;
                case 3:
                    boll = false;
                    break;
            }
        }
    }
}
