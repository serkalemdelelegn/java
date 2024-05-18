import javax.swing.*;
import java.awt.*;

class MenuDemo extends JFrame {
    JMenuBar mbar;
    JMenu fileMenu, editMenu;
    JMenuItem newItem, openItem, saveItem, exitItem, cutItem, copyItem, pasteItem;
    JCheckBoxMenuItem cbox;

    MenuDemo() {
        mbar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        
        mbar.add(fileMenu);
        mbar.add(editMenu);

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        cutItem = new JMenuItem("Cut");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        cbox = new JCheckBoxMenuItem("Choice");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        fileMenu.addSeparator();

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(cbox);

        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(mbar, BorderLayout.NORTH);

        setVisible(true);
        setSize(400, 600);
        setTitle("Menu Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
