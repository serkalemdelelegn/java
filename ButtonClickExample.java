import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new button
        JButton button = new JButton("Click Me!");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the button click event
                System.out.println("Button was clicked!");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
