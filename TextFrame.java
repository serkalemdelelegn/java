import java.awt.*; // Importing AWT classes for GUI components
import java.awt.event.*; // Importing AWT event classes for event handling

// TextFrame class extends Frame to create a window
class TextFrame extends Frame {
    // Constructor for TextFrame
    TextFrame() {
        // Make the frame visible
        setVisible(true);
        
        // Set the size of the frame
        setSize(300, 300);
        
        // Set the title of the frame
        setTitle("message frame");
        
        // Add a window listener to handle window closing event using an anonymous inner class
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                // Exit the program when the window is closed
                System.exit(0);
            }
        });
    }

    // Main method - entry point of the application
    public static void main(String[] args) {
        // Create an instance of TextFrame, which will display the frame
        new TextFrame();
    }

    // Override the paint method to perform custom painting on the frame
    public void paint(Graphics g) {
        // Create a new Color object with RGB values (200, 0, 0)
        Color c = new Color(200, 0, 0);
        
        // Set the color of the graphics context to the created color
        g.setColor(c);
        
        // Create a new Font object with name "Arial", style bold, and size 34
        Font f = new Font("arial", Font.BOLD, 34);
        
        // Set the font of the graphics context to the created font
        g.setFont(f);
        
        // Display the message "Hello students" at the location (100, 100) on the frame
        g.drawString("Hello students", 100, 100);
    }
}
