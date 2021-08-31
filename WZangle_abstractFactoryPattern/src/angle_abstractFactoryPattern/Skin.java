package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.Goods;

public class Skin extends Goods{
	   private int skinNumber;
	   private int heroNumber;
	   private String name;
	   Skin(String name,int heroNumber,int skinNumber){
	       this.name=name;
	       this.skinNumber=skinNumber;
	       this.heroNumber=heroNumber;
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