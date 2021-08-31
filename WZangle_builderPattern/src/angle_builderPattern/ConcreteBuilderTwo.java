package angle_builderPattern;

import angle_builderPattern.Builder;
import angle_builderPattern.Product;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreteBuilderTwo implements Builder{
      private Product panel;       //需要创建的容器
      ConcreteBuilderTwo(){
            panel=new Product();
      } 
      public void buildButton(){
            panel.button=new JButton("地图右侧展开");
      }
      public void buildLabel(){
           panel.label=new JLabel("左侧出装");
      }
      public JPanel  getPanel(){          //与其它ConcreteBuilder添加组件的顺序的不同
            panel.add(panel.label);
            panel.add(panel.button);
            return panel;
      }
}
