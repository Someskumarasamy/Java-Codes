package Java.Zoho_Prep;
//*********************************auth : SOMES KUMAR K.*******************************************//
//*********************************LEARN CODE WITH FUN*********************************************//
import java.util.Scanner;

public class X_O_Game {

    int xi,xj;
    static Scanner s =new Scanner(System.in);
    char board [][];
    void print_line(int n){
        int x = (n*4)-1;
        for(int i=0;i<x;i++){
            System.out.print("-");
        }
        System.out.println();
    }
      public void make_board(int n){
         if(n%2!=0){
             setBoard(n);
         }
         else{
             System.out.println("Enter valid Board Size");
              n = s.nextInt();
              make_board(n);
         }
     }
    public void setBoard(int size) {
        board=new char[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                board[i][j]=' ';
            }
        }
    }
    boolean check_board_empty(int size){
        boolean c=true;
          for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(board[i][j]==' '){
                    c=false;
                    break;
                }
            }
        }
        return !c;
    }
    public void display_board(int size){
        print_line(size);
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
               System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            print_line(size);
        }
    }
    boolean check_win(char op,int size){
         boolean col=true,row=true,dig1=true,dig2=true;
         int di=size-1;
         for(int i=0;i<size;i++){
              if(board[xi][i]!=op){
                  col=false;
              }
              if(board[i][xj]!=op){
                  row=false;
              }
              if(board[i][i]!=op){
                  dig1=false;
              }
              if(board[i][di]!=op){
                  dig2=false;
              }
              di--;
          }
          return col || row || dig1 || dig2 ;
    }
    //*******************************************Main-Function**************of my Code******************//
    public static void main(String[] args) {
         boolean win=false;
        X_O_Game xo = new X_O_Game();
        System.out.println("Get Board Size");
        int n = s.nextInt();
        xo.make_board(n);
        System.out.println("Intial Board");
        xo.display_board(n);
        while(xo.check_board_empty(n)){
            System.out.println("Player X");
            if(xo.get_input_x(n)){
                if(xo.check_win('X',n)){
                    win=true;
                    System.out.println("X wins....");
                    xo.display_board(n);
                    break;
                }
            }
            System.out.println("Player O");
            if(xo.get_input_y(n)){
                if(xo.check_win('O',n)){
                    win=true;
                    System.out.println("O wins....");
                    xo.display_board(n);
                    break;
                }
            }
        }
        if(!win){

            System.out.println("Match ties...");
            xo.display_board(n);
        }
    }
    //************************************************Main-Ends*************************************************//
    boolean get_input_x(int size){
          if(check_board_empty(size))
          {
              System.out.println("i pos and j pos");
              xi=s.nextInt();
              xj=s.nextInt();
              if(xi<size && xj<size && board[xi][xj]==' '){
              board[xi][xj]='X';
              display_board(size);
              return  true;
          }
          else {
              System.out.println("Re enter your input");
              return get_input_x(size);
          }}
          else
              return false;
    }
    boolean get_input_y(int size){
           if (check_board_empty(size)) {
               System.out.println("i pos and j pos");
               xi = s.nextInt();
               xj = s.nextInt();
               if (xi < size && xj < size && board[xi][xj] == ' ') {
                   board[xi][xj] = 'O';
                   display_board(size);
                   return true;
               } else {
                   System.out.println("Re enter your input");
                   return get_input_y(size);
               }
           } else {
               return false;
           }


    }

}
//****************************Any doubts??____drop a comment********************************************//