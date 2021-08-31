package angle_builderPattern;

import angle_builderPattern.Builder;
import angle_builderPattern.ConcreteBuilderOne;
import angle_builderPattern.ConcreteBuilderTwo;
import angle_builderPattern.Director;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application{
    public static void main(String args[]){
    	
       Builder builder=new ConcreteBuilderOne();
       Director director=new Director(builder);
       JPanel panel=director.constructProduct();
       JFrame frameOne=new JFrame();
       frameOne.add(panel);
       frameOne.setBounds(1600,300,200,120);
       frameOne.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frameOne.setVisible(true);
       
       builder=new ConcreteBuilderTwo();
       director=new Director(builder);
       panel=director.constructProduct();
       JFrame frameTwo=new JFrame();
       frameTwo.add(panel);
       frameTwo.setBounds(1600,450,200,120);
       frameTwo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frameTwo.setVisible(true);
       
       builder=(Builder) new ConcreteBuilderThree();
    }
}
