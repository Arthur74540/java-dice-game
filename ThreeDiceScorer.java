public class ThreeDiceScorer extends ThreeDice {
	int points;
	int sumOfDice;
	public ThreeDiceScorer(int s1, int s2, int s3) {
		super(s1, s2, s3);
	}	
	public int CountPoints(){
		sumOfDice = getDie1() + getDie2() + getDie3();
		if (threeSame()){
			points =  sumOfDice + 60;
		}else if (runOfThree()){
			points = sumOfDice + 40;
		}else if (pair()){
			points = sumOfDice + 20;
		}else{
			points = sumOfDice;	
		}
		return points;	
	}
}	