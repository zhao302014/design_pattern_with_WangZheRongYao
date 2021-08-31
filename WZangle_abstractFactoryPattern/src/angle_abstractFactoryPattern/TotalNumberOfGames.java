package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.MilitaryExploits;

public class TotalNumberOfGames extends MilitaryExploits{
	   private int number;
	   private int probability;
	   private String name;
	   TotalNumberOfGames(String name,int number,int probability){
	       this.name=name;
	       this.number=number;
	       this.probability=probability;
	   }
	   public int getWinProbability(){
	       return probability;
	   }
	   public int getTotalNumber(){
	       return number;
	   }
	   public String getName(){
	       return name;
	   } 
	}
