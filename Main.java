import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Stores the window into an object called DRS
        JFrame DRS = new JFrame("Geekmobile");
        KeyboardIN controls = new KeyboardIN(DRS); /*  Declares a varible named controls that can refrence a KeyboardIN object, 
        the constructor gets created in the KeyboardIN file and the right side of the line calls the constructor*/
        
       // Configs for the window proporties
        DRS.setSize(900, 700);
        DRS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        DRS.setLocationRelativeTo(null);
        RobotPanel panel = new RobotPanel();
        
       //Creates and makes our window visible
        DRS.add(panel);
        DRS.setVisible(true);
        
    }
}