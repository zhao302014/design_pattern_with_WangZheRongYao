package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.Goods;

public class Hero extends Goods{
	   private int heroNumber;
	   private int skinNumber;
	   private String name;
	   Hero(String name,int heroNumber,int skinNumber){
	       this.name=name;
	       this.heroNumber=heroNumber;
	       this.skinNumber=skinNumber;
	   }
	    public int getHeroNumber(){
	       return heroNumber;
	   }
	   public int getSkinNumber(){
	       return skinNumber;
	   }
	   public String getName(){
	       return name;
	   } 
	}