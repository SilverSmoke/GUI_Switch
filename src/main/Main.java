package main;

import controller.FramesController;
import forms.UserForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        JFrame frameFIO = new JFrame();

        FramesController framesController = new FramesController(frame, frameFIO);
    }
}
