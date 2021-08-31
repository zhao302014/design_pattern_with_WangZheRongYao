package angle_observer;

import angle_observer.Observer;

/*
��ɫ1�����⣺��һ���ӿڣ��涨�˾���������Ҫʵ�ֵķ���
          �磺��ӡ�ɾ���۲����Լ�֪ͨ�۲��߸������ݵķ��� 
*/

public interface Subject {
	public void addObserver(Observer o);    //�涨�˾���������Ҫʵ�ֵ���ӹ۲��߸������ݵķ���
	public void deleteObserver(Observer o);    //�涨�˾���������Ҫʵ�ֵ�ɾ���۲��߸������ݵķ���
	public void notifyObservers();          //�涨�˾���������Ҫʵ�ֵ�֪ͨ�۲��߸������ݵķ���


}
