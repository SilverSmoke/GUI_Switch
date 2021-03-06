package forms;

import controller.FramesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FIOForm {
    private final FramesController framesController;
    private JTextField textFIO;
    private JButton switchFIO;
    private JPanel rootPanel;
    private JProgressBar progressBar;

    public FIOForm(FramesController framesController) {

        this.framesController = framesController;

        switchFIO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framesController.jumpToMainFrame();
            }
        });
        textFIO.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                progressFIO();
                if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER) {
                    framesController.jumpToMainFrame();
                }
            }
        });
    }

    private void progressFIO() {
        progressBar.setMinimum(0);
        progressBar.setMaximum(3);

        progressBar.setValue(0);

        if(!textFIO.getText().equals("")) {
            String[] fio = textFIO.getText().trim().split(" ");
            progressBar.setValue(fio.length);
        }
    }

    public void setFIO(String fio){
        textFIO.setText(fio);
        progressFIO();
    }

    public String getFIO() {
        return textFIO.getText();
    }

    public Container getRootPanel() {
        return rootPanel;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }
}
