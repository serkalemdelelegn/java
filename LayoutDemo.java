import javax.swing.*;
import java.awt.*;

class LayoutDemo extends JFrame {
    JButton b1, b2, b3, b4, b5;
    Container c;
    GridBagLayout gbl;
    GridBagConstraints cons;

    LayoutDemo() {
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");
        
        c = this.getContentPane();
        gbl = new GridBagLayout();
        c.setLayout(gbl);
        
        cons = new GridBagConstraints();
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.weightx = 0.8;
        
        cons.gridx = 0;
        cons.gridy = 0;
        gbl.setConstraints(b1, cons);
        c.add(b1);
        
        cons.gridx = 1;
        cons.gridy = 0;
        gbl.setConstraints(b2, cons);
        c.add(b2);
        
        cons.gridx = 2;
        cons.gridy = 0;
        gbl.setConstraints(b3, cons);
        c.add(b3);
        
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 3;
        cons.ipady = 100;
        gbl.setConstraints(b4, cons);
        c.add(b4);
        
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 2;
        cons.ipady = 50;
        gbl.setConstraints(b5, cons);
        c.add(b5);
        
        this.setVisible(true);
        this.setSize(400, 400);
        this.setTitle("Layout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LayoutDemo();
    }
}
