package Week10.Exercise01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Miguel Emmara
 */
public class AppPanel extends JPanel {
    private static final String[] random_phrases = {"queue","lily","valley","Hello World","seller","god","survival","midnight","crackpot","estate"};
    private final JLabel text;
    private final JButton random_button;

    public AppPanel() {
        ButtonListener listener = new ButtonListener();
        this.setLayout(null);

        // Text
        text = new JLabel("Hello World");
        text.setLocation(160, 10);
        text.setSize(150, 100);
        text.setFont(new Font("Verdana", Font.PLAIN, 25));
        this.add(text);

        // Button
        random_button = new JButton("Random Phrase");
        random_button.setLocation(160,150);
        random_button.setSize(150,100);
        random_button.setFocusable(false);
        random_button.addActionListener(listener);
        this.add(random_button);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            if (e.getSource() == random_button) {
                text.setText(random_phrases[random.nextInt(random_phrases.length)]);
            }
        }
    }
}