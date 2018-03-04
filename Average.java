public class Average{
	public static void main(String[] args){	
		ThreeDiceScorer roll;
		int NumberOfPossibilities = 0;
		float totalPoints = 0;
		float AveragePoints;
		int die1 = 0;
		int die2 = 0;
		int die3 = 0;
	
		// Part c) computes the average of points of three 6 sided dice rolls (the points are obtained with ThreeDiceScorer.java class)
		for (int i = 1; i <= 6; i++){
			die1++;
			System.out.println("die1 :"+die1);
			for (int j = 1; j <= 6; j++){
				die2++;
				System.out.println("die2 :"+die2);
				for (int k = 1; k <= 6; k++){
					die3++;
					System.out.println("die3 :"+die3);
					roll = new ThreeDiceScorer(die1, die2, die3);
					totalPoints =  totalPoints + roll.CountPoints();
					NumberOfPossibilities++;
				}
				die3 = 0;
			}
			die2 = 0;
		}
		die1 = 0;
		System.out.println("Total Points :"+totalPoints);
		System.out.println("Number of possibilities: "+NumberOfPossibilities);
		AveragePoints = totalPoints/NumberOfPossibilities;
		System.out.println("The average points of all possible rolls of three six sided dice is :"+AveragePoints);
		
		//Part d) where one die has the values : 2, 3, 4, 5, 6, 6.
		totalPoints = 0;
		for (int i = 1; i <= 6; i++){
			die1++;
			System.out.println("die1 :"+die1);
			for (int j = 1; j <= 6; j++){
				die2++;
				System.out.println("die2 :"+die2);
				for (int k = 1; k <= 6; k++){
					die3++;
					System.out.println("die3 :"+die3);
					if (die1 == 1){
						roll = new ThreeDiceScorer(6, die2, die3);
						System.out.println("SPECIAL CASE");
					}else{
						roll = new ThreeDiceScorer(die1, die2, die3);
					}
					totalPoints =  totalPoints + roll.CountPoints();
				}
				die3 = 0;
			}
			die2 = 0;
		}
		die1 = 0;
		System.out.println("Total points :"+totalPoints);
		System.out.println("Number of possibilities: "+NumberOfPossibilities);
		AveragePoints = totalPoints/NumberOfPossibilities;
		System.out.println("The average points of all possible rolls of two six sided dices and one biased dice is :"+AveragePoints);
	}
}