package angle_builderPattern;

import angle_builderPattern.Builder;
import angle_builderPattern.Product;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreteBuilderOne implements Builder{
      private Product panel;       //需要创建的容器
      ConcreteBuilderOne(){
            panel=new Product();
      } 
      public void buildButton(){
            panel.button=new JButton("地图左侧展开");
      }
      public void buildLabel(){
           panel.label=new JLabel("右侧出装");
      }
      public JPanel  getPanel(){
           panel.add(panel.button);     //与其它ConcreteBuilder添加组件的顺序的不同
           panel.add(panel.label);
           return panel;
      }
} 

