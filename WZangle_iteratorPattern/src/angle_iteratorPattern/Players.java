package angle_iteratorPattern;

import java.util.*; 

class Players implements Comparable{
    String name,level;     //��λ����������
    int minute=0;       //����ʱ��
    Players(String name,String level,int minute){
        this.name=name;
        this.level=level;
        this.minute=minute;
    }
    public int compareTo(Object b){       
    	Players plater=(Players)b;
        return (int)(this.minute-plater.minute);
    }
    public String getLevel(){
        return level;
    }
    public String getName(){
        return name;
    }
    public int getMinute(){
        return minute;
    }
}
