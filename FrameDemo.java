import java.awt.*;
import java.awt.event.*;

class FrameDemo extends Frame implements WindowListener {
    FrameDemo() {
        // Making the frame visible
        setVisible(true);
        
        // Setting the size of the frame
        setSize(300, 300);
        
        // Setting the title of the frame
        setTitle("Window Listener");
        
        // Adding the listener to the frame
        addWindowListener(this);
    }

    public static void main(String[] args) {
        // Creation of frame object
        FrameDemo fd = new FrameDemo();
    }

    // Null implementation methods
    public void windowOpened(WindowEvent we) {}

    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent we) {}

    public void windowActivated(WindowEvent we) {}

    public void windowDeactivated(WindowEvent we) {}

    public void windowIconified(WindowEvent we) {}

    public void windowDeiconified(WindowEvent we) {}
}
