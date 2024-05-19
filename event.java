import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventDemo extends JFrame implements ActionListener {
    JButton button;

    EventDemo() {
        // Create a button
        button = new JButton("Click Me");

        // Set up the layout and add the button
        setLayout(new FlowLayout());
        add(button);

        // Add action listener to the button
        button.addActionListener(this);

        // Set up the frame
        setTitle("Event Handling Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Implement the actionPerformed method
    public void actionPerformed(ActionEvent ae) {
        // Print a message to the console when the button is clicked
        System.out.println("Button was clicked!");
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}
