package forms;

import controller.FramesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UserForm {
    private JPanel rootPanel;
    private JTextField surName;
    private JTextField patronymic;
    private JTextField name;
    private JButton switchUser;

    private FramesController framesController;

    public UserForm(FramesController framesController) {

        this.framesController = framesController;

        switchUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framesController.jumpToFIOFrame();
            }
        });

        name.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkJumpCommand(e);
            }
        });
        surName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkJumpCommand(e);
            }
        });
        patronymic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                checkJumpCommand(e);
            }
        });

    }

    private void checkJumpCommand(KeyEvent e){
        if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_ENTER) {
            framesController.jumpToFIOFrame();
        }
    }

    public String getFIO() {
        return (surName.getText() + " " + patronymic.getText() + " " + name.getText()).trim();
    }

    public void setFIO(String fio) {
        try {
            String[] fioArray = fio.trim().split(" ");
            surName.setText(fioArray[0]);
            name.setText(fioArray[1]);
            patronymic.setText(fioArray[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            name.setText("");
            patronymic.setText("");
            surName.setText("");
        }
    }

    public Container getRootPanel() {
        return rootPanel;
    }
}
