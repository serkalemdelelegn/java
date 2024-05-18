import java.io.*;

class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("divert.txt");
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);
        System.out.println("hi");
        System.out.println("how are you?");
        System.out.println("are you listening?");
    }
}
