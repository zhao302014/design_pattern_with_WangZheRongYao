package angle_builderPattern;

import angle_builderPattern.Builder;
import angle_builderPattern.Product;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreteBuilderTwo implements Builder{
      private Product panel;       //��Ҫ����������
      ConcreteBuilderTwo(){
            panel=new Product();
      } 
      public void buildButton(){
            panel.button=new JButton("��ͼ�Ҳ�չ��");
      }
      public void buildLabel(){
           panel.label=new JLabel("����װ");
      }
      public JPanel  getPanel(){          //������ConcreteBuilder��������˳��Ĳ�ͬ
            panel.add(panel.label);
            panel.add(panel.button);
            return panel;
      }
}
