package gui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setSize(300, 200); // 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("프레임 작성 예시");

        setLayout(new FlowLayout()); // 배치 관리자 설정
//        JButton button = new JButton("배고프다! ");
//        JLabel label = new JLabel("Hello i'm java");
          JTextField text = new JTextField(20);

        // 컴포넌트 생성 및 추가
        this.add(text);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
