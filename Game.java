import java.util.Scanner;
public class Game {
	public static void main(String[] args){	
		int die1, die2, die3, die4, die5, die6;
		float rounds;
		float AvgPointsPerRoundPlayer1 = 0;
		float AvgPointsPerRoundPlayer2 = 0;
		int totalPointsPlayer1 = 0;
		int totalPointsPlayer2 = 0;
		int player1Points;
		int player2Points;
		int roundWinsPlayer1 = 0;
		int roundWinsPlayer2 = 0;
		ThreeDiceScorer player1;
		ThreeDiceScorer player2;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of rounds to play (min 0):");
		rounds = input.nextInt();
		while (rounds < 0){
			System.out.print("Input the number of rounds to play (min 0):");
			rounds = input.nextInt();
		}
	
		for (int i =1; i<=rounds; i++){
			System.out.print("Round "+i+"   ");
			die1 = 1 + (int)(6 * Math.random());
			die2 = 1 + (int)(6 * Math.random());
			die3 = 1 + (int)(6 * Math.random());
			die4 = 1 + (int)(6 * Math.random());
			die5 = 1 + (int)(6 * Math.random());
			die6 = 1 + (int)(6 * Math.random());
			player1 = new ThreeDiceScorer(die1, die2, die3);
			System.out.print("Player 1:");
			player1.printResult();
			player1Points = player1.CountPoints();
			System.out.println("Points: " + player1Points);
			player2 = new ThreeDiceScorer(die4, die5, die6);
			System.out.print("Player 2:");
			player2.printResult();
			player2Points = player2.CountPoints();
			System.out.println("Points : " + player2Points);
			if (player1Points > player2Points){
				System.out.println("Round winner is player 1");
				roundWinsPlayer1 = roundWinsPlayer1 + 1;
			}else if (player1Points < player2Points){
				System.out.println("Round winner is player 2");
				roundWinsPlayer2 = roundWinsPlayer2 + 1;
			}else{
				System.out.println("Round is tied");
			}
			totalPointsPlayer1 = totalPointsPlayer1 + player1Points;
			totalPointsPlayer2 = totalPointsPlayer2 + player2Points;
			AvgPointsPerRoundPlayer1 = totalPointsPlayer1/rounds;
			AvgPointsPerRoundPlayer2 = totalPointsPlayer2/rounds;
		}
		System.out.println("Total wins :");
		System.out.println("Player 1: "+roundWinsPlayer1+"   Player 2: "+roundWinsPlayer2);
		System.out.println("Total Points: ");
		System.out.println("Player 1: "+totalPointsPlayer1+"  Player 2: "+totalPointsPlayer2);
		System.out.println("Average Points Per Round: ");
		System.out.println("Player 1: "+AvgPointsPerRoundPlayer1+"   Player 2: "+AvgPointsPerRoundPlayer2);
		System.out.println("");
		if (totalPointsPlayer1 > totalPointsPlayer2){
			System.out.println("Overall points winner is player 1!");
		}else if (totalPointsPlayer1 < totalPointsPlayer2){
			System.out.println("Overall points winner is player 2!");
		}else{
			System.out.println("Overall points is a draw!");
		}
		
		
	}
}