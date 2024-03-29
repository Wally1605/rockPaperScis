import java.util.Scanner;
import java.util.Random;
public class Main {
    enum Move{
        ROCK,
        PAPER,
        SCISSOR;}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int CPU = 0;
    int user = 0;
    Move move = Move.ROCK;
    Move Cmove = Move.ROCK;
    boolean i = false;

    while(i == false){
        System.out.println("Welcome to rock paper scissors! Type in (1 or 2 or 3) to put in a move.");
        CPU = rand.nextInt(3);
        user = sc.nextInt();
        switch (user){
            case 0:
                move = Move.ROCK;
                break;
            case 1:
                move = Move.PAPER;
                break;
            case 2:
                move = Move.SCISSOR;
                break;
        }
        switch (CPU){
            case 0:
                Cmove = Move.ROCK;
                break;
            case 1:
                Cmove = Move.PAPER;
                break;
            case 2:
                Cmove = Move.SCISSOR;
                break;
        }

        if(move == Move.ROCK && Cmove == Move.PAPER){
            System.out.println(move + " "+ Cmove);
            System.out.println("You lost!");
        }
        else if(move == Move.ROCK && Cmove == Move.SCISSOR){
            System.out.println(move + " "+ Cmove);
            System.out.println("You Won!");
        }
        else if(move == Move.PAPER && Cmove == Move.ROCK){
            System.out.println(move + " "+ Cmove);
            System.out.println("You Won!");
        }
        else if(move == Move.PAPER && Cmove == Move.SCISSOR){
            System.out.println(move + " "+ Cmove);
            System.out.println("You Lost!");
        }
        else if(move == Move.SCISSOR && Cmove == Move.ROCK){
            System.out.println(move + " "+ Cmove);
            System.out.println("You lost!");
        }
        else if(move == Move.SCISSOR && Cmove == Move.PAPER){
            System.out.println(move + " "+ Cmove);
            System.out.println("You Won!");
        }else{
            System.out.println(move + " "+ Cmove);
            System.out.println("It's a tie!");
        }

        System.out.println("Want to play again? y/n");
        sc.nextLine();
        String answer = sc.nextLine();
        if(answer.equals("n")){
            i = true;
        }
    }
    }
}
