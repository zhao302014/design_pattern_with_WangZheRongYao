package angle_iteratorPattern;

import java.util.*; 

class Players implements Comparable{
    String name,level;     //段位星数，名字
    int minute=0;       //开局时长
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
