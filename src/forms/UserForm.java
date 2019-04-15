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
                if(isFormComplete()){
                    framesController.jumpToFIOFrame();
                }
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
            if(isFormComplete()) {
                framesController.jumpToFIOFrame();
            }
        }
    }

    private boolean isFormComplete(){
        boolean complete = true;
        if(name.getText().equals("")){
            JOptionPane.showMessageDialog(
                    rootPanel,
                    "Введите имя!");
            complete = false;
        }else if(surName.getText().equals("")){
            JOptionPane.showMessageDialog(
                    rootPanel,
                    "Введите фамилию!");
            complete = false;
        }else if(patronymic.getText().equals("")){
            int result = JOptionPane.showConfirmDialog(
                    rootPanel,
                    "Уверены ли Вы в том, что не хотите установить отчество?",
                    "Уверены?",
                    JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.NO_OPTION) {
                complete = false;
            }
        }
        return complete;
    }

    public String getFIO() {
        if(patronymic.getText().equals("")) {
            return (surName.getText() + " " + name.getText()).trim();
        }
        return (surName.getText() + " " + name.getText() + " " + patronymic.getText()).trim();
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
