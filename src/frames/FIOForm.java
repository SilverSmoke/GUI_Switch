package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FIOForm {
    private JTextField textFIO;
    private JButton switchFIO;
    private JPanel rootPanelFIO;
    private JFrame frameMain;

    public FIOForm() {
        switchFIO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jumpToMainFrame();
            }
        });
    }

    private void jumpToMainFrame() {
        String fio = getFIO();
        /*frameMain.getContentPane().getComponent()setTextFIO(fio);
        frameFIO.setVisible(false);
        frame.setVisible(true);*/
    }

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

    public void setFrameMain(JFrame frame) {
        frameMain = frame;
    }
}
