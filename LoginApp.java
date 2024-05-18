import java.awt.*;
import java.awt.event.*;

class LoginApp extends Frame {
    Label ul, pl;
    TextField utf, ptf;
    Button logb;

    LoginApp() {
        ul = new Label("Username");
        pl = new Label("Password");
        utf = new TextField(30);
        ptf = new TextField(30);
        logb = new Button("Login");
        ptf.setEchoChar('*');
        this.setLayout(null);
        ul.setBounds(100, 100, 90, 30);
        utf.setBounds(200, 100, 150, 30);
        pl.setBounds(100, 150, 90, 30);
        ptf.setBounds(200, 150, 150, 30);
        logb.setBounds(150, 200, 90, 30);
        this.add(ul);
        this.add(utf);
        this.add(pl);
        this.add(ptf);
        this.add(logb);
        this.setVisible(true);
        this.setSize(400, 300);
        this.setTitle("Login App");
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new LoginApp();
    }
}
