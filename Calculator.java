import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    // Define the components
    TextField display;
    Button[] numButtons = new Button[10];
    Button addButton, subButton, mulButton, divButton, equButton, clrButton;
    Panel panel;

    // Variables to hold the values and operation
    String operator;
    double num1, num2, result;

    // Constructor to set up the GUI
    Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 600);
        setLayout(null);

        // Create the display field
        display = new TextField();
        display.setBounds(50, 50, 300, 50);
        display.setEditable(false);
        add(display);

        // Initialize the panel for buttons
        panel = new Panel();
        panel.setBounds(50, 150, 300, 400);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Initialize number buttons and add them to the panel
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new Button(String.valueOf(i));
            numButtons[i].addActionListener(this);
            panel.add(numButtons[i]);
        }

        // Initialize operation buttons
        addButton = new Button("+");
        subButton = new Button("-");
        mulButton = new Button("*");
        divButton = new Button("/");
        equButton = new Button("=");
        clrButton = new Button("C");

        // Add action listeners to operation buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        equButton.addActionListener(this);
        clrButton.addActionListener(this);

        // Add operation buttons to the panel
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(clrButton);
        panel.add(equButton);

        // Add panel to the frame
        add(panel);

        // Set frame visibility
        setVisible(true);

        // Add window listener to close the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Action listener method
    public void actionPerformed(ActionEvent e) {
        // Handle number button presses
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButtons[i]) {
                display.setText(display.getText() + i);
            }
        }

        // Handle clear button press
        if (e.getSource() == clrButton) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        }

        // Handle operator button presses
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        }

        // Handle equals button press
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(display.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result;
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new Calculator();
    }
}
