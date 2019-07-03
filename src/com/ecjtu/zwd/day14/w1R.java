package com.ecjtu.zwd.day14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class w1R {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Server");
       FrameUtil frameUtil=new FrameUtil();
       frameUtil.initFrame(frame,500,600);
        TextField textField=new TextField();
        TextArea textArea=new TextArea();
        frame.add(textField);
        frame.add(textArea);
    }
}
