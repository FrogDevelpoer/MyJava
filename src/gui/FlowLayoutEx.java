package gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentpane = getContentPane();

        contentpane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        contentpane.add(new JButton("버튼1"));
        contentpane.add(new JButton("버튼2"));
        contentpane.add(new JButton("버튼3"));
        contentpane.add(new JButton("버튼4"));
        contentpane.add(new JButton("버튼5"));
        contentpane.add(new JButton("버튼6"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
