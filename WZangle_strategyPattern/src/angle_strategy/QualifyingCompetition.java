package angle_strategy;

/*
         ��ɫ3�������� (��λ����)
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
