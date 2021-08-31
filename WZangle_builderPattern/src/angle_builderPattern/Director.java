package angle_builderPattern;

import angle_builderPattern.Builder;
import javax.swing.JPanel;

public class Director{
    private Builder builder;
    Director(Builder builder){
       this.builder=builder;
    }
    public JPanel constructProduct(){
       builder.buildButton();
       builder.buildLabel();
       JPanel product=builder.getPanel();
       return product;
   }
}
