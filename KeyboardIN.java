import java.awt.event.*;
import javax.swing.*;

public class KeyboardIN {
    // creating our future conditions
    private  boolean isWPressed = false;
    private  boolean isAPressed = false;
    private  boolean isDPressed = false;
    private  boolean isSPressed = false;

    /*Getter methods for returning the booleans
     without actually checking the
     originals directly from another class and having to make the
     booleans public */
    
     public boolean isWPressed() {
        return isWPressed;
    }
    
    public boolean isAPressed() {
        return isAPressed;
    }
    public boolean isDPressed() {
        return isDPressed;
    }
    public boolean isSPressed() {
        return isSPressed;
    }

    public KeyboardIN(JFrame DRS) {
        DRS.addKeyListener(new KeyAdapter() {
            @Override public void keyPressed(KeyEvent w) {
                if (w.getKeyCode() == KeyEvent.VK_W) {
                    isWPressed = true;
                }
        }
            @Override 
            public void keyReleased(KeyEvent w) {
                if (w.getKeyCode() == KeyEvent.VK_W) {
                    isWPressed = false;
                }
            }
        });
    }
}