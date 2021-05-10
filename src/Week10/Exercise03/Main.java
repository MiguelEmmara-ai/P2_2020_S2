package Week10.Exercise03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Miguel Emmara
 */
public class Main extends JFrame {
    public Main(String title) throws HeadlessException {
        super(title);
        
        AppPanel appPanel = new AppPanel("Increment Decrement");

        //get the size of the screen
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        this.setSize(400, 150);

        //Calculate the frame location
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;

        this.getContentPane().add(appPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(x,y);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main("Increment Decrement");
    }
}
