// EX04_GLU_CoSD
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
	
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
	scissors.setStrongAgainst(paper);
        
        Move userPick, computerPick;
        int userScore, computerScore;
	
	int roundsToWin = 2;
        
	boolean conGame = true;
        int inputA, inputB;
        Scanner in = new Scanner(System.in);
        
        while (conGame){
            System.out.print("""
                             Welcome to Rock, Paper, Scissors. Please choose an option:
                             1. Start game
                             2. Change number of rounds
                             3. Exit application
                             \n""");
            inputA = in.nextInt();
            in.nextLine();
            
            switch (inputA) {
                case 1:
                    userScore = 0;
                    computerScore = 0;
                    System.out.println("\nThis match will be first to " + roundsToWin + " wins.");
                    
                    while (!(userScore == roundsToWin || computerScore == roundsToWin)) {
                        int randomChoice = (int) Math.floor(Math.random()*3) + 1;
                        if (randomChoice == 1) {
                            computerPick = rock;
                        } 
                        else if (randomChoice == 2) {
                            computerPick = paper;
                        } 
                        else {
                            computerPick = scissors;
                        }
                        
                        System.out.println("""
                                           The computer has selected its move. Select your move:
                                           1. Rock
                                           2. Paper
                                           3. Scissors
                                           """);
                        inputB = in.nextInt();
                        in.nextLine();
                        if (inputB == 1) {
                            userPick = rock;
                        }  
                        else if (inputB == 2) {
                            userPick = paper;
                        } 
                        else {
                            userPick = scissors;
                        }
                        System.out.print("\nPlayer chose " + userPick.getName() + ". Computer chose " + computerPick.getName() + ". ");

                        int result = Move.compareMoves(userPick, computerPick);

                        if (result == 0) {
                            userScore++;
                            System.out.print("Player wins round!\n");
                        } 
                        else if (result == 1) {
                            computerScore++;
                            System.out.print("Computer wins round!\n");
                        } 
                        else {
                            System.out.print("Round is tied!\n");
                        }
                        
                        System.out.print("Player: " + userScore + " - Computer: " + computerScore + '\n');
                    }
                    
                    if (userScore == roundsToWin) {
                        System.out.println("Player wins!\n");
                    } 
                    else {
                        System.out.println("Computer wins!\n");
                    }
                    break;
                    
                    
                case 2:
                    System.out.println("\nHow many wins are needed to win a match?");
                    roundsToWin = in.nextInt();
                    in.nextLine();
                    System.out.println("\nNew setting has been saved!\n");
                    break;
                    
                case 3:
                    System.out.println("\nThank you for playing!");
                    conGame = false;
            }
        }
    }
}