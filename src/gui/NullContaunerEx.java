package gui;

import javax.swing.*;
import java.awt.*;

public class NullContaunerEx extends JFrame {
    public NullContaunerEx() {
        setTitle("배치 관리자 없이 절대 배치");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        JLabel la = new JLabel("뿅뺭입니당");
        la.setLocation(130, 50);
        la.setSize(200, 20);

        this.add(la);

        // 10개의 버튼 생성하고 크기는 동일, 위치는 겹치게
        for (int i = 0; i <= 10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setLocation(i * 15, i * 15);
            btn.setSize(50, 20);
            this.add(btn);
        }
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NullContaunerEx();
    }
}
