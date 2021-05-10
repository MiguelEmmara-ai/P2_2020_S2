package Week10.Exercise03;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Miguel Emmara
 */
public class AppPanel extends JPanel {
    JButton increment, decrement;
    JLabel label;
    private int number = 50;

    public AppPanel(String title) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {

        }

        ButtonListener listener = new ButtonListener();

        label = new JLabel(String.valueOf(number),SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(300,20));
        label.setOpaque(true);
        label.setBackground(Color.CYAN);

        Border blackLine = BorderFactory.createTitledBorder(title);
        JPanel buttonPanel = new JPanel();

        increment = new JButton("Increment");
        increment.setFocusable(false);
        increment.addActionListener(listener);

        decrement = new JButton("Decrement");
        decrement.setFocusable(false);
        decrement.addActionListener(listener);

        buttonPanel.setBorder(blackLine);
        buttonPanel.setPreferredSize(new Dimension(300,70));
        buttonPanel.add(increment);
        buttonPanel.add(decrement);

        this.setPreferredSize(new Dimension(300,100));
        this.add(label);
        this.add(buttonPanel);
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();

            if (source == increment) {
                number += 1;
                label.setText(String.valueOf(number));
            } else if (source == decrement) {
                number -= 1;
                label.setText(String.valueOf(number));
            }
        }
    }
}
