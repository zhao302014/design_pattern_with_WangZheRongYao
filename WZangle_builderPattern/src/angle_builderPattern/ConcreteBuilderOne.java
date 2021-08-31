package angle_builderPattern;

import angle_builderPattern.Builder;
import angle_builderPattern.Product;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConcreteBuilderOne implements Builder{
      private Product panel;       //��Ҫ����������
      ConcreteBuilderOne(){
            panel=new Product();
      } 
      public void buildButton(){
            panel.button=new JButton("��ͼ���չ��");
      }
      public void buildLabel(){
           panel.label=new JLabel("�Ҳ��װ");
      }
      public JPanel  getPanel(){
           panel.add(panel.button);     //������ConcreteBuilder��������˳��Ĳ�ͬ
           panel.add(panel.label);
           return panel;
      }
} 

