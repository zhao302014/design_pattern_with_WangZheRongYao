package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.MilitaryExploits;
import angle_abstractFactoryPattern.Goods;

public class ZoneTwo extends Zone {
    public MilitaryExploits createMilitaryExploits(int proibility,int number){
         return new TotalNumberOfGames("          ս��",proibility,number);
    }
    public Goods createGoods(int heroNumber,int skinNumber){
         return new Skin("          ��Ʒ",heroNumber,skinNumber);
    }
}
