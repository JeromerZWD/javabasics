package com.ecjtu.zwd.day14;

import javax.swing.*;
import java.awt.*;

public class FrameUtil {
    public static void initFrame(JFrame frame,int width,int height){
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension=toolkit.getScreenSize();
        int x= (int)dimension.getWidth();
        int y= (int)dimension.getHeight();
        frame.setBounds((x-width)/2,(y-height)/2,width,height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
