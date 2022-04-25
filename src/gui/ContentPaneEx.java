package gui;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제"); // 프레임 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
        contentPane.setBackground(Color.orange); // 배경색 : orange
        contentPane.setLayout(new FlowLayout()); // 컨텐트팬에 FlowLayout 배치 관리자 달기

        contentPane.add(new Button("OK")); // OK버튼
        contentPane.add(new Button("Cancel")); // Cancel; 버튼
        contentPane.add(new Button("Ignore")); // Ignore 버튼

        setSize(300, 150); // 프레임 크기 300 * 150
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new ContentPaneEx();
    }
}
