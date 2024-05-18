import java.awt.*; // Importing AWT classes for GUI components
import java.awt.event.*; // Importing AWT event classes for event handling

// SelectionFrame class extends Frame to create a window
class SelectionFrame extends Frame {
    // Declare checkboxes and a checkbox group
    Checkbox cb1, cb2, cb3, rb1, rb2, rb3;
    CheckboxGroup cbg;
    TextArea ta;

    // Constructor for SelectionFrame
    SelectionFrame() {
        // Initialize the checkboxes
        cb1 = new Checkbox("Programming");
        cb2 = new Checkbox("Reading");
        cb3 = new Checkbox("Browsing");

        // Initialize the checkbox group for radio buttons
        cbg = new CheckboxGroup();

        // Initialize the radio buttons and associate them with the checkbox group
        rb1 = new Checkbox("Btech", cbg, false);
        rb2 = new Checkbox("BE", cbg, false);
        rb3 = new Checkbox("MCA", cbg, false);

        // Initialize the text area with 6 rows and 20 columns
        ta = new TextArea(6, 20);

        // Set the layout manager for the frame
        setLayout(new FlowLayout());

        // Add the components to the frame
        add(cb1);
        add(cb2);
        add(cb3);
        add(rb1);
        add(rb2);
        add(rb3);
        add(ta);

        // Set the frame properties
        setVisible(true);
        setSize(400, 500);
        setTitle("SelectionFrame");

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
        // Create an instance of SelectionFrame, which will display the frame
        new SelectionFrame();
    }
}
