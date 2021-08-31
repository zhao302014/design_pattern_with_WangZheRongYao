package angle_builderPattern;

import javax.swing.JPanel;

public interface Builder{
    public abstract void buildButton();
    public abstract void buildLabel();
    public abstract JPanel getPanel();
}

