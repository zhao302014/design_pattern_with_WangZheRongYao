package angle_strategy;

import angle_strategy.QualifyingCompetition;
import angle_strategy.Hero;
import angle_strategy.StaregyDiaochanJinghua;
import angle_strategy.StaregyHouyiKuangbao;
import angle_strategy.StaregyLibaiChengji;
import angle_strategy.StaregyMachaoJipao;
import angle_strategy.StaregyMingshiyinZhiliao;

public class Application {

	public static void main(String[] args) {
		QualifyingCompetition game=new QualifyingCompetition();     //上下文对象
		Hero diaochan=new Hero();
		diaochan.setName("貂蝉");         //貂蝉净化
        diaochan.setSkill("净化");
        diaochan.setDialogue("无尽的舞蹈何日方休");
        Hero houyi=new Hero();
		houyi.setName("后羿");         //后羿狂暴
        houyi.setSkill("狂暴");
        houyi.setDialogue("周日被我射熄火了,所以今天是周一");
        Hero libai=new Hero();
		libai.setName("李白");         //李白惩击
        libai.setSkill("惩击");
        libai.setDialogue("凤兮凤兮归故乡，遨游四海求其凰");
        Hero machao=new Hero();
		machao.setName("马超");         //马超疾跑
        machao.setSkill("疾跑");
        machao.setDialogue("我的枪去而复返，你的生命有去无回");
        Hero mingshiyin=new Hero();
		mingshiyin.setName("明世隐");         //明世隐治疗
        mingshiyin.setSkill("治疗");
        mingshiyin.setDialogue("血管里,流淌着忘川之水");
        System.out.println("");
        System.out.println("我打哪个位置都可以，你们先选，我补位!");
        System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyDiaochanJinghua());        //上下文对象使用策略一
		System.out.println("当最后剩余【法师】位时：");
		System.out.printf("我选择【%s】，我带的召唤师技能是【%s】\n",diaochan.getName(),diaochan.getSkill());
		System.out.printf("选择后触发英雄台词：%s\n",diaochan.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyHouyiKuangbao());    //上下文对象使用策略二
		System.out.println("当最后剩余【射手】位时：");
		System.out.printf("我选择【%s】，我带的召唤师技能是【%s】\n",houyi.getName(),houyi.getSkill());
		System.out.printf("选择后触发英雄台词：%s\n",houyi.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyLibaiChengji());    //上下文对象使用策略三
		System.out.println("当最后剩余【打野】位时：");
		System.out.printf("我选择【%s】，我带的召唤师技能是【%s】\n",libai.getName(),libai.getSkill());
		System.out.printf("选择后触发英雄台词：%s\n",libai.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyMachaoJipao());    //上下文对象使用策略四
		System.out.println("当最后剩余【战士/坦克】位时：");
		System.out.printf("我选择【%s】，我带的召唤师技能是【%s】\n",machao.getName(),machao.getSkill());
		System.out.printf("选择后触发英雄台词：%s\n",machao.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyMingshiyinZhiliao());    //上下文对象使用策略五
		System.out.println("当最后剩余【辅助】位时：");
		System.out.printf("我选择【%s】，我带的召唤师技能是【%s】\n",mingshiyin.getName(),mingshiyin.getSkill());
		System.out.printf("选择后触发英雄台词：%s\n",mingshiyin.getDialogue());
	    }

	}
	
	class Hero{
		String name,skill,dialogue;
		public void setName(String s){
			name=s;
		}
		public void setSkill(String t){
			skill=t;
		}
		public void setDialogue(String v){
			dialogue=v;
		}
		public String getDialogue(){
			return dialogue;
		}
		public String getName(){
			return name;
		}
		public String getSkill(){
			return skill;
		}
	}
