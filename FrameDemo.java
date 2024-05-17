import java.awt.*;
import java.awt.event.*;

// Define a class named FrameDemo that extends the Frame class and implements the WindowListener interface
class FrameDemo extends Frame implements WindowListener {
    // Constructor of FrameDemo class
    FrameDemo() {
        // Make the frame visible
        setVisible(true);
        
        // Set the size of the frame to 300x300 pixels
        setSize(300, 300);
        
        // Set the title of the frame to "Window Listener"
        setTitle("Window Listener");
        
        // Add this FrameDemo object as a window listener to handle window events
        addWindowListener(this);
    }

    // Main method - entry point of the application
    public static void main(String[] args) {
        // Create an instance of FrameDemo which will display the frame
        FrameDemo fd = new FrameDemo();
    }

    // Called when the window is first opened
    public void windowOpened(WindowEvent we) {}

    // Called when the user attempts to close the window
    public void windowClosing(WindowEvent we) {
        // Terminate the program
        System.exit(0);
    }

    // Called when the window has been closed
    public void windowClosed(WindowEvent we) {}

    // Called when the window is activated (gains focus)
    public void windowActivated(WindowEvent we) {}

    // Called when the window is deactivated (loses focus)
    public void windowDeactivated(WindowEvent we) {}

    // Called when the window is minimized (iconified)
    public void windowIconified(WindowEvent we) {}

    // Called when the window is restored from minimized state
    public void windowDeiconified(WindowEvent we) {}
}
