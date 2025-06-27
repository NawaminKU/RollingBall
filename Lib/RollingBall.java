package Lib;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class RollingBall extends JPanel implements ActionListener {
    public void  paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 90, 80, 80); // วาดวงกลมทั้งวง
        g.fillArc(100, 90, 80, 80, 0, 180); // วาดตัวครึ่งวงกลม
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
