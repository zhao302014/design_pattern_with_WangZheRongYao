package angle_observer;

/*
角色2：观察者：是一个接口，规定了具体观察者用来更新数据的方法 
*/

public interface Observer {
	public void hearMessage(String mess);   //相当于观察者模式类图中的update()方法
//要求观察者都通过实现hearMessage()方法（模拟接收系统消息）来更新数据

}