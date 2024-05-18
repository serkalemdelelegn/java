import javax.swing.*;
import java.awt.*;

class Layout extends JFrame {
    JButton b1, b2, b3, b4, b5;

    Layout() {
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");

        Container c = this.getContentPane();
        BorderLayout bl = new BorderLayout(10, 20);
        c.setLayout(bl);

        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3, BorderLayout.EAST);
        c.add(b4, BorderLayout.WEST);
        c.add(b5, BorderLayout.CENTER);

        setVisible(true);
        setSize(400, 400);
        setTitle("BorderDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Layout();
    }
}
