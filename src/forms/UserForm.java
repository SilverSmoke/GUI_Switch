package forms;

import controller.FramesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }

    public String getFIO() {
        if(name.getText().length()>0 && patronymic.getText().length()>0 && surName.getText().length()>0) {
            return surName.getText() + " " + patronymic.getText() + " " + name.getText();
        }else{
            return "";
        }
    }

    public void setFIO(String fio) {
        try {
            String[] fioArray = fio.split(" ");
            name.setText(fioArray[2]);
            patronymic.setText(fioArray[1]);
            surName.setText(fioArray[0]);
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
