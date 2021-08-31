package angle_command;

public class Application{
	public static void main(String[]args){
		TeammateRequest1 faqijingong=new TeammateRequest1();
		Command request1_attack=new ConcreteCommandAttack(faqijingong);
		PlayerRequests wanjia=new PlayerRequests();
		wanjia.setCommand(request1_attack);
		wanjia.startExecute();
		
		TeammateRequest2 qingqiujihe=new TeammateRequest2();
		Command request2_gather=new ConcreteCommandGather(qingqiujihe);
		wanjia.setCommand(request2_gather);
		wanjia.startExecute();
		
		TeammateRequest3 kaishichetui=new TeammateRequest3();
		Command request3_retreat=new ConcreteCommandRetreat(kaishichetui);
		wanjia.setCommand(request3_retreat);
		wanjia.startExecute();
	}
}
