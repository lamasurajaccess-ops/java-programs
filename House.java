import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.*;

class DrawRect extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int[] xPoints = {100, 200, 300}; 
        int[] yPoints = {200, 100, 200}; 

        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 150);

        g.setColor(Color.RED);
        g.drawPolygon(xPoints, yPoints, 3);

        g.setColor(Color.CYAN);
        g.fillRect(120, 220, 50, 50);

        g.setColor(Color.BLUE);
        g.fillRect(180, 250, 50, 100);
    }
}

public class House{
    public static void main(String[] args) {
        JFrame f = new JFrame("Drawing house");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.add(new DrawRect());

        f.setVisible(true);

    }
}