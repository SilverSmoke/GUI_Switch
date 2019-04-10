package main;

import frames.FIOForm;
import frames.UserForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        UserForm form = new UserForm();
        frame.setContentPane(form.getRootPanel());

        frame.setTitle("GUI Basics");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.println(frame.getRootPane());
        System.out.println(form.getRootPanel().getParent());
        /*JFrame frameFIO = new JFrame();

        FIOForm formFIO = new FIOForm();
        frameFIO.setContentPane(formFIO.getRootPanelFIO());

        frameFIO.setTitle("FIO");
        frameFIO.setSize(800, 120);
        frameFIO.setLocationRelativeTo(null);
        frameFIO.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameFIO.setVisible(false);*/

        /*form.setFrameFIO(frameFIO);
        formFIO.setFrameMain(frame);

        frame.getContentPane().getComponent(0);

        System.out.println(frame.getContentPane().getParent().getParent().getParent());*/

        /*form.getSwitchUser().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchFormFIO();
            }
        });

        formFIO.getSwitchFIO().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fio = formFIO.getFIO();
                form.setTextFIO(fio);
                frameFIO.setVisible(false);
                frame.setVisible(true);
            }
        });

        form.getSwitchUser().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == 17){

                }
            }
        });

        void switchFormFIO(){
            String fio = form.getFIO();
            formFIO.setTextFIO(fio);
            frame.setVisible(false);
            frameFIO.setVisible(true);
        }*/
    }
}
