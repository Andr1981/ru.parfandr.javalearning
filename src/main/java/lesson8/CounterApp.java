package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int width = 500;
        int hight = 500;
        setBounds(center.x - width / 2, center.y - hight / 2, width, hight);
        setTitle("Счетчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 32);
        final JLabel counterValueVier = new JLabel();
        final JLabel counterStringVier = new JLabel();
        counterStringVier.setFont(font);
        counterValueVier.setFont(font);
        counterValueVier.setHorizontalAlignment(SwingConstants.CENTER);
        counterStringVier.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueVier, BorderLayout.CENTER);
        add(counterStringVier, BorderLayout.NORTH);

        value = initialValue;
        counterValueVier.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        JButton incrementButton = new JButton(">");
        decrementButton.setFont(font);
        incrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueVier.setText(String.valueOf(value));
                counterStringVier.setText("Работает на уменьшение");
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueVier.setText(String.valueOf(value));
                counterStringVier.setText("Работает на увеличение");
            }
        });

        setVisible(true);


    }
}
