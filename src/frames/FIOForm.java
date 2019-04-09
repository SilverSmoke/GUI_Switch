package frames;

import javax.swing.*;
import java.awt.*;

public class FIOForm {
    private JTextField textFIO;
    private JButton switchFIO;
    private JPanel rootPanelFIO;

    public Container getRootPanelFIO() {
        return rootPanelFIO;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanelFIO = new JPanel();
    }

    public void setTextFIO(String fio){
        textFIO.setText(fio);
    }

    public JButton getSwitchFIO() {
        return switchFIO;
    }

    public String getFIO() {
        return textFIO.getText();
    }
}
