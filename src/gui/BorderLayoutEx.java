package gui;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx(){
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout(30, 20));

        contentPane.add(new JButton("버튼1"), BorderLayout.CENTER);
        contentPane.add(new JButton("버튼2"), BorderLayout.NORTH);
        contentPane.add(new JButton("버튼3"), BorderLayout.SOUTH);
        contentPane.add(new JButton("버튼4"), BorderLayout.EAST);
        contentPane.add(new JButton("버튼5"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}
