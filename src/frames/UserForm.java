package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class UserForm {
    private JPanel rootPanel;
    private JTextField surName;
    private JTextField patronymic;
    private JTextField name;
    private JButton switchUser;
    private JFrame frameFIO;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setFrameFIO(JFrame frameFIO) {
        this.frameFIO = frameFIO;
    }

    public JButton getSwitchUser() {
        return switchUser;
    }

    public String getFIO() {
        if(name.getText().length()>0 && patronymic.getText().length()>0 && surName.getText().length()>0) {
            return surName.getText() + " " + patronymic.getText() + " " + name.getText();
        }else{
            return "";
        }
    }

    public void setTextFIO(String fio) {
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
}
