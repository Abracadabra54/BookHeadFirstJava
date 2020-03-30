package page394to397;

import javax.swing.*;
import java.awt.*;

public class TestJPanel {

    public static void main (String [] args) {
        TestJPanel gui = new TestJPanel();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent (Graphics g){
            Graphics2D g2d = (Graphics2D) g;

            int red = (int) (Math.random()*255);
            int green = (int) (Math.random()*255);
            int blue = (int) (Math.random()*255);
            Color startColor = new Color(red, green, blue);

            red = (int) (Math.random()*255);
            green = (int) (Math.random()*255);
            blue = (int) (Math.random()*255);
            Color endColor = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(70,70, startColor, 150, 150, endColor);

            g2d.setPaint(gradient);
            g2d.fillOval(70, 70, 100, 100);
        }
    }
}
