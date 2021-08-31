package angle_mementoPattern;

import angle_mementoPattern.Caretaker;
import angle_mementoPattern.Originator;

public class Application {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        System.out.println("���ﵱ���װ������{���ߵıӻ�}ʱ����");
        
        originator.setState("alive");
        System.out.println("      �����״̬��" + originator.getState());
        caretaker.saveMemento(originator.createMemento());
    
        System.out.println("");
        System.out.println("������ұ���ɱʱ������װ��Ч������");
        
        originator.setState("death");
        System.out.println("      �����״̬��" + originator.getState());
   
        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println("");
        System.out.println("����װ������Ч��2������");
        System.out.println("      �����״̬��" + originator.getState());
    }
}
