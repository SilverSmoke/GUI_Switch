package forms;

import controller.FramesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FIOForm {
    private final FramesController framesController;
    private JTextField textFIO;
    private JButton switchFIO;
    private JPanel rootPanel;

    public FIOForm(FramesController framesController) {

        this.framesController = framesController;

        switchFIO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framesController.jumpToMainFrame();
            }
        });
    }

    public void setFIO(String fio){
        textFIO.setText(fio);
    }

    public String getFIO() {
        return textFIO.getText();
    }

    public Container getRootPanel() {
        return rootPanel;
    }
}
