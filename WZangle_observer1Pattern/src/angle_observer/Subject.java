package angle_observer;

import angle_observer.Observer;

/*
角色1：主题：是一个接口，规定了具体主题需要实现的方法
          如：添加、删除观察者以及通知观察者更新数据的方法 
*/

public interface Subject {
	public void addObserver(Observer o);    //规定了具体主题需要实现的添加观察者更新数据的方法
	public void deleteObserver(Observer o);    //规定了具体主题需要实现的删除观察者更新数据的方法
	public void notifyObservers();          //规定了具体主题需要实现的通知观察者更新数据的方法


}
