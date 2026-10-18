import java.awt.*;
import javax.swing.*;

public class RobotPanel extends JPanel {
   
    // X and Y Positions for the image
    private int robotX = 250;
    private int robotY = 200;

    // methods to be called in KeyboardIN when a key is being pressed

    public void moveRight() {
        robotX += 5;
        repaint();
    }

    public void moveLeft() {
        robotX -= 5;
        repaint();
    }

    public void moveDown() {
        robotY += 5;
        repaint();
    }

    public void moveUp() {
        robotY -= 5;
        repaint();
    }

    private final Image robot = new ImageIcon("robot.png").getImage(); // Gets the image asset from the files
    
    @Override
    protected void paintComponent(Graphics g) { // Calls a method and uses it to create the image on the window
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        g.drawImage(robot, robotX, robotY, this);
    }
    public RobotPanel() {
        setBackground(Color.BLACK);
    }
}