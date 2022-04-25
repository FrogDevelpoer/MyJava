package gui;

import javax.swing.*;
import java.awt.*;

public class GirdLayoutEx extends JFrame {
    public GirdLayoutEx(){
        setTitle("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(1, 10));

        for(int i = 0; i < 10; i++){
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            this.add(button);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GirdLayoutEx();
    }
}
