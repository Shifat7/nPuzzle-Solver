package solver;

import java.util.Comparator;

public class PuzzleComparator implements Comparator<PuzzleState>
{
	//compares the states list using each of their evaluation function
	@Override
	public int compare(PuzzleState state1, PuzzleState state2) 
	{
		return state1.getEvaluationFunction() - state2.getEvaluationFunction();
	}

}
