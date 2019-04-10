package frames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

public class UserForm {
    private JPanel rootPanel;
    private JTextField surName;
    private JTextField patronymic;
    private JTextField name;
    private JButton switchUser;
    private JFrame frameFIO;
    private FIOForm formFIO;

    public UserForm() {
        switchUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frameFIO ==null) {
                    frameFIO = new JFrame();

                    formFIO = new FIOForm();
                    frameFIO.setContentPane(formFIO.getRootPanelFIO());
                    formFIO.setFrameMain((JFrame) rootPanel.getParent().getParent().getParent());

                    frameFIO.setTitle("FIO");
                    frameFIO.setSize(800, 120);
                    frameFIO.setLocationRelativeTo(null);
                    frameFIO.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    frameFIO.setVisible(false);
                }
                jumpToFIOFrame();
            }
        });
    }

    private void jumpToFIOFrame() {
        String fio = getFIO();
        formFIO.setTextFIO(fio);
        rootPanel.getParent().getParent().getParent().setVisible(false);
        frameFIO.setVisible(true);
    }

    public JPanel getRootPanel() {
        return rootPanel;
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
