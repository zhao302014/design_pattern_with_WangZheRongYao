package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.MilitaryExploits;

public class WinningProbability extends MilitaryExploits{
	   private int probability;
	   private int number;
	   private String name;
	   WinningProbability(String name,int number,int probability){
	       this.name=name;
	       this.probability=probability;
	       this.number=number;
	   }
	   public int getTotalNumber(){
	       return number;
	   }
	   public int getWinProbability(){
	       return probability;
	   }
	   public String getName(){
	       return name;
	   } 
	}
