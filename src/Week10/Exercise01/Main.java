package Week10.Exercise01;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Miguel Emmara
 */
public class Main {
    public static void main(String[] args) {
        AppPanel appPanel = new AppPanel();
        JFrame jframe = new JFrame("My Window");

        //get the size of the screen
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        jframe.setSize(500, 500);

        //Calculate the frame location
        int x = (screenSize.width - jframe.getWidth()) / 2;
        int y = (screenSize.height - jframe.getHeight()) / 2;
        jframe.getContentPane().add(appPanel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setLocation(x, y);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
}
