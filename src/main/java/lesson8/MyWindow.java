package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int width = 500;
        int height = 500;
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        setBounds(center.x - width / 2, center.y - height / 2, width, height);
        final JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается");
            }
        });
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
//        setLayout(new FlowLayout());
//        setLayout(new GridLayout(3, 3));
//        setLayout(null);

//        final JButton button = new JButton("Нажми сюда");
//        add(button, BorderLayout.CENTER);
//        button.addActionListener(new AbstractAction() {
//            public void actionPerformed(ActionEvent e) {
//                button.setText("Нажал");
//            }
//        });

//        for (int i = 0; i < 5; i++) {
//            add(new JButton("button " + (i + 1)));
//        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}
