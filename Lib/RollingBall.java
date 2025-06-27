package Lib;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RollingBall extends JPanel implements ActionListener {
    private int x = 100, y = 90, start_angle = 0;
    private int ball_Size = 80;
    public RollingBall() {
        Timer t = new Timer(20, this);
        t.start();
    }

    public void  paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, ball_Size, ball_Size); // วาดวงกลมทั้งวง
        g.fillArc(x, y, ball_Size, ball_Size, start_angle, 180); // วาดตัวครึ่งวงกลม
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x -= 2;
        start_angle += 5;
        if (x <= -ball_Size) x = getWidth();
        if (start_angle >= 360) start_angle = 0;
        repaint();
    }
}
