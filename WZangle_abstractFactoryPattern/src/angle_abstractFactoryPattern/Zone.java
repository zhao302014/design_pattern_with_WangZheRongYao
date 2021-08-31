package angle_abstractFactoryPattern;

public abstract class Zone{
    public abstract MilitaryExploits createMilitaryExploits(int proibility,int number);
    public abstract Goods createGoods(int heroNumber,int skinNumber);
}
