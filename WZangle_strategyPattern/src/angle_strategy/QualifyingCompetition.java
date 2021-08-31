package angle_strategy;

/*
         角色3：上下文 (排位比赛)
*/

import angle_strategy.ChoosesStaregy;

public class QualifyingCompetition {
	ChoosesStaregy strategy;
	public void setStrategy(ChoosesStaregy strategy){
		this.strategy=strategy;
	}
	public String getPlayerChooses(String a){
		if(strategy!=null)
			return strategy.whichChooses(a);
		else
			return null;
	}

}
