import javax.swing.*;

class Advance extends JFrame {
    Advance() {
        String[] columnNames = {"ID", "S_Name", "Dept"};
        String[][] data = {
            {"10", "Aster", "sw"},
            {"20", "Getachew", "IT"},
            {"30", "Arifa", "CS"}
        };

        JTable jt = new JTable(data, columnNames);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);

        setVisible(true);
        setSize(500, 500);
        setTitle("JTable Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Advance();
    }
}
