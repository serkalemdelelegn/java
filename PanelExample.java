import java.awt.*; // Importing the necessary AWT classes

// Define the public class PanelExample
public class PanelExample {  

    // Constructor of PanelExample class
    PanelExample() {  
        // Create a new frame with the title "Panel Example"
        Frame f = new Frame("Panel Example");    

        // Create a new panel
        Panel panel = new Panel();  

        // Set the position and size of the panel
        panel.setBounds(40, 80, 200, 200);    

        // Set the background color of the panel to gray
        panel.setBackground(Color.gray);  

        // Create a new button with the label "Button 1"
        Button b1 = new Button("Button 1");    

        // Set the position and size of the first button
        b1.setBounds(50, 100, 80, 30);    

        // Set the background color of the first button to yellow
        b1.setBackground(Color.yellow);    

        // Create a new button with the label "Button 2"
        Button b2 = new Button("Button 2");    

        // Set the position and size of the second button
        b2.setBounds(100, 100, 80, 30);  

        // Set the background color of the second button to green
        b2.setBackground(Color.green);    

        // Add the first button to the panel
        panel.add(b1); 

        // Add the second button to the panel
        panel.add(b2);   

        // Add the panel to the frame
        f.add(panel);   

        // Set the size of the frame to 400x400 pixels
        f.setSize(400, 400);    

        // Set the layout of the frame to null (absolute positioning)
        f.setLayout(null);    

        // Make the frame visible
        f.setVisible(true);    
    }  

    // Main method - entry point of the application
    public static void main(String args[]) {  
        // Create an instance of PanelExample, which sets up and displays the GUI
        new PanelExample();  
    }  
}  
