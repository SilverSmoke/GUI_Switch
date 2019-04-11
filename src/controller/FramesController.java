package controller;

import forms.FIOForm;
import forms.UserForm;

import javax.swing.*;

public class FramesController {

    JFrame mainFrame;
    JFrame fioFrame;
    UserForm mainForm;
    FIOForm formFIO;

    public FramesController(JFrame mainFrame, JFrame FIOFrame) {
        this.mainFrame = mainFrame;
        this.fioFrame = FIOFrame;
        constructionFrames();
    }

    private void constructionFrames() {

        /**mainFrame construction*/
        mainForm = new UserForm(this);
        mainFrame.setContentPane(mainForm.getRootPanel());

        mainFrame.setTitle("GUI Basics");
        mainFrame.setSize(800, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        /**fioFrame construction*/
        formFIO = new FIOForm(this);
        fioFrame.setContentPane(formFIO.getRootPanel());

        fioFrame.setTitle("FIO");
        fioFrame.setSize(800, 120);
        fioFrame.setLocationRelativeTo(null);
        fioFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fioFrame.setVisible(false);
    }

    public JFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(JFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public JFrame getFIOFrame() {
        return fioFrame;
    }

    public void setFIOFrame(JFrame FIOFrame) {
        this.fioFrame = FIOFrame;
    }

    public void jumpToMainFrame() {
        String fio = formFIO.getFIO();
        mainForm.setFIO(fio);
        fioFrame.setVisible(false);
        mainFrame.setVisible(true);
    }

    public void jumpToFIOFrame() {
        String fio = mainForm.getFIO();
        formFIO.setFIO(fio);
        mainFrame.setVisible(false);
        fioFrame.setVisible(true);
    }
}
