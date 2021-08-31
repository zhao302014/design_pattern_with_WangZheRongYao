package angle_mementoPattern;

import angle_mementoPattern.Caretaker;
import angle_mementoPattern.Originator;

public class Application {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        System.out.println("★★★当玩家装备中有{贤者的庇护}时★★★");
        
        originator.setState("alive");
        System.out.println("      →玩家状态：" + originator.getState());
        caretaker.saveMemento(originator.createMemento());
    
        System.out.println("");
        System.out.println("★★★玩家被击杀时，触发装备效果★★★");
        
        originator.setState("death");
        System.out.println("      →玩家状态：" + originator.getState());
   
        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println("");
        System.out.println("★★★装备出发效果2秒后★★★");
        System.out.println("      →玩家状态：" + originator.getState());
    }
}
